from predio import *

class Escola(Predio):

    def __init__(self, nFrequentadores, mediaLixoPorFrequentador, consumoGasDiario, nSalas):
        super().__init__(nFrequentadores, mediaLixoPorFrequentador, consumoGasDiario)
        self.nSalas = nSalas

    def __str__(self):
        strSalas = str(self.nSalas)

        string = super().__str__()
        string = string+"\nnSalas: "+strSalas+"\n"

        return string
    
    def getNSalas(self):
        return self.nSalas

    def getPegadaCarbono(self):
        pCarbono = super().getPegadaCarbono()
        pCarbono *= 0.2 * self.nSalas
        return pCarbono
