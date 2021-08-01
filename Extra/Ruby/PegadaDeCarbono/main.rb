require './bicicleta.rb'
require './carro.rb'
require './predio.rb'
require './escola.rb'
require './casa.rb'

bike1 = Bicicleta.new("Caloi", 40, 12)
bike2 = Bicicleta.new("Monark", 39, 34)
car1 = Carro.new("Pegeot","ASB8794",34,"alcool")
car2 = Carro.new("Chevrolet","HAG9818",0,"gasolina")
casa1 = Casa.new(34,87,14,5,3)
casa2 = Casa.new(89,831,54,275,498)
escola1 = Escola.new(32,9843,798,3)
escola2 = Escola.new(55,343,24,53)

array = []

array.append(bike1)
array.append(bike2)
array.append(car1)
array.append(car2)
array.append(casa1)
array.append(casa2)
array.append(escola1)
array.append(escola2)

array.each do |element|
  puts "Pegada de carbono: #{element.getPegadaCarbono}"
  element.print
end
