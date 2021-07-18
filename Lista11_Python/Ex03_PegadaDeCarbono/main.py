from bicicleta import Bicicleta
from predio import *
from casa import *
from escola import *

"""Criando objetos"""
bike1 = Bicicleta("Monark", 36.0, 40.5)
bike2 = Bicicleta("Olmo", 40.0, 43.0)
casa1 = Casa(15, 98.2, 245.12, 4, 2)
casa2 = Casa(4, 70.2, 76.2, 5, 2)
escola1 = Escola(220, 12.2, 20.8, 6)
escola2 = Escola(812, 15.8, 40.8, 15)

array = []
array.append(bike1)
array.append(bike2)
array.append(casa1)
array.append(casa2)
array.append(escola1)
array.append(escola2)

for elemento in array:
    pegadaCarbono = elemento.getPegadaCarbono()
    print(elemento)
    print("Pegada de carbono: "+str(pegadaCarbono))
    print("--------")
