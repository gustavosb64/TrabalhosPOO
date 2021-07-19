from predio import *

class Casa(Predio):

    def __init__(self, nFrequentadores, mediaLixoPorFrequentador, consumoGasDiario, nComodos, nChuveiros):
        super().__init__(nFrequentadores, mediaLixoPorFrequentador, consumoGasDiario)
        self.nComodos = nComodos
        self.nChuveiros = nChuveiros

    def __str__(self):
        strComodos = str(self.nComodos)
        strChuveiros = str(self.nChuveiros)

        string = super().__str__()
        string = string+"\nnComodos: "+strComodos+"\n"
        string = string+"nComodos: "+strChuveiros

        return string
    
    def getNComodos(self):
        return self.nComodos

    def getPegadaCarbono(self):
        mediaLixoPorFrequentador = super().getMediaLixoPorFrequentador()
        nFrequentadores = super().getNFrequentadores()
        consumoGasPorDia = super().getConsumoGasDiario()
        pCarbono = (mediaLixoPorFrequentador * nFrequentadores * 0.1) + (consumoGasPorDia * 0.1)
        return pCarbono
