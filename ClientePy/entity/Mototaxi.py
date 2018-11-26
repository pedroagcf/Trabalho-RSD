class Mototaxi:
    def __init__(self,id_mototaxi, nome, telefone, praca):
        self.__id_mototaxi = id_mototaxi
        self.__nome = nome
        self.__telefone = telefone
        self.__praca = praca

    def getId_mototaxi(self):
        return self.__id_mototaxi

    def setId_mototaxi(self, id_mototaxi):
        self.__id_mototaxi = id_mototaxi

    def getNome(self):
        return self.__nome

    def setNome(self, nome):
        self.__nome = nome

    def getTelefone(self):
        return self.__telefone

    def setTelefone(self, telefone):
        self.__telefone = telefone

    def getPraca(self):
        return self.__praca

    def setPraca(self, praca):
        self.__praca = praca