from abc import ABC, abstractmethod

class Predio(ABC):

    def __init__(self, nFrequentadores, mediaLixoPorFrequentador, consumoGasDiario):
        self.nFrequentadores = nFrequentadores
        self.mediaLixoPorFrequentador = mediaLixoPorFrequentador
        self.consumoGasDiario = consumoGasDiario

    def __str__(self):
        strFreq = str(self.nFrequentadores)
        strMedLixo = str(self.mediaLixoPorFrequentador)
        strConsGas = str(self.consumoGasDiario)

        string = "nFrequentadores: "+strFreq+"\n"
        string = string+"mediaLixoPorFrequentador: "+strMedLixo+"\n"
        string = string+"consumoGasDiario: "+strConsGas

        return string

    def getNFrequentadores(self):
        return self.nFrequentadores

    def setNFrequentadores(self, nFrequentadores):
        self.nFrequentadores = nFrequentadores

    def getMediaLixoPorFrequentador(self):
        return self.mediaLixoPorFrequentador

    def getConsumoGasDiario(self):
        return self.consumoGasDiario

    def getPegadaCarbono(self):
        pCarbono = (self.mediaLixoPorFrequentador * self.nFrequentadores * 0.2) + (self.consumoGasDiario * 0.1)
        return pCarbono
