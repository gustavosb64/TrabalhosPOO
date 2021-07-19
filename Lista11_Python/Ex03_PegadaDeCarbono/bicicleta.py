class Bicicleta:

    def __init__(self, marca, aro, calibragem):
        self.marca = marca;
        self.aro = aro;
        self.calibragem = calibragem;

    def __str__(self):
        string = "Marca: "+self.marca+"\nAro: "+str(self.aro)+"\nCalibragem: "+str(self.calibragem)
        return string

    def getMarca(self):
        return self.marca

    def getAro(self):
        return self.aro
    
    def getCalibragem(self):
        return self.calibragem

    def getPegadaCarbono(self):
        pegCarb = 0
        return pegCarb
