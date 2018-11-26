from socket import *

class TCPClient:

    def __init__(self, host, port):
        self.serverName = host
        self.serverPort = port
        self.clientSocket = socket(AF_INET, SOCK_STREAM)

    def connect(self):
        self.clientSocket.connect((self.serverName, self.serverPort))

    def sendRequest(self, request):
        self.clientSocket.send(request.encode('utf-8'))

    def getResponse(self):
        return self.clientSocket.recv(1024).decode('utf-8')

    def close(self):
        self.clientSocket.close()