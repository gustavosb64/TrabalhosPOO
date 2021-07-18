from bicicleta import Bicicleta
from predio import *

bike = Bicicleta("Monark", 36.0, 40.5)

print(bike)

predio = Predio(12, 34.2, 134.5)
casa = Casa(15, 98.2, 245.12, 4, 2)

print(predio)

print("CASA:")
print(casa)
print(casa.getNFrequentadores())
