class Cliente:
    def __init__(self, id_cliente, nome, telefone):
        self.__id_cliente = id_cliente
        self.__nome = nome
        self.__telefone = telefone


    def getId_cliente(self):
        return self.__id_cliente

    def setId_cliente(self, id_cliente):
        self.__id_cliente = id_cliente

    def getNome(self):
        return self.__nome

    def setNome(self, nome):
        self.__nome = nome

    def getTelefone(self):
        return self.__telefone

    def setTelefone(self, telefone):
        self.__telefone = telefone

    def getClass(self):
        cliente = Cliente()
        return cliente.__dict__.update()
