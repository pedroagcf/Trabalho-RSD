import json

class ControlParseJSON:

    def parseJSON(self, obj):
        return json.encoder(obj)

    def fromJSON(self, jsonSTR, obj):
        return json.loads(jsonSTR, object_hook=obj.getClass())