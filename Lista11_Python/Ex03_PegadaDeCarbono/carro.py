class Carro:

    def __init__(self, marca, modelo, combustivel):
        self.marca = marca
        self.modelo = modelo
        self.combustivel = combustivel
        self.quilometragem = 0

    def __str__(self):
        string = "Marca: "+self.marca+"\nModelo: "+self.modelo+"\nTipo de combustivel: "+self.combustivel
        return string

    def getMarca(self):
        return self.marca

    def move(self, distancia):
        self.quilometragem += distancia

    def getPegadaCarbono(self):
        if self.combustivel == "gasolina":
            return 20 * self.quilometragem
        if self.combustivel == "alcool":
            return 10 * self.quilometragem
