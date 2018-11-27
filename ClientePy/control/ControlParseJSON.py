import datetime
import json

from control import CustomEncoder


class ControlParseJSON:

    def parseJSON(self, obj):
        return json.dumps(obj, indent=4, cls=CustomEncoder)

    def fromJSON(self, jsonSTR, obj):
        return json.loads(jsonSTR, object_hook=self.decode_object)

    def decode_object(self, o):
        if '__A__' in o:
            a = o.A()

            a.__dict__.update(o['__A__'])

            return a

        elif '__datetime__' in o:
            return datetime.strptime(o['__datetime__'], '%Y-%m-%dT%H:%M:%S')


        return o