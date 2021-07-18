class Predio:

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
        pCarbono = (mediaLixoPorFrequentador * nFrequentadores * 0.2) + (consumoGasPorDia * 0.1)
        return pCarbono



class Casa(Predio):

    def __init__(self, nFrequentadores, mediaLixoPorFrequentador, consumoGasDiario, nComodos, nChuveiros):
        super(Casa, self).__init__(nFrequentadores, mediaLixoPorFrequentador, consumoGasDiario)
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
