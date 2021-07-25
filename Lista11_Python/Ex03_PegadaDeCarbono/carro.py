from interfacePegadaDeCarbono import *

class Carro(PegadaDeCarbono):

    def __init__(self, marca, modelo, combustivel):

        if (combustivel != "alcool" and combustivel != "gasolina" and combustivel != "hibrido"):
            print("Combustível deve ser: alcool ou gasolina")
            return

        self.marca = marca
        self.modelo = modelo
        self.combustivel = combustivel
        self.quilometragem = 0

    def __str__(self):
        string = "CARRO\n"
        string += "Marca: "+self.marca+"\nModelo: "+self.modelo+"\nTipo de combustivel: "+self.combustivel
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
        if self.combustivel == "hibrido":
            return 5 * self.quilometragem
