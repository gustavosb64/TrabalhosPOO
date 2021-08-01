require './pegada_de_carbono.rb'

class Carro
  include PegadaDeCarbono

  attr_accessor :marca, :placa, :quilometragem, :combustivel
  
  def initialize(marca, placa, quilometragem, combustivel)
    @marca = marca
    @placa = placa
    @quilometragem = quilometragem
    @combustivel = combustivel
  end

  def print
    puts "CARRO"
    puts "Marca: #{@marca}"
    puts "Placa: #{@placa}"
    puts "Quilometragem: #{@quilometragem}"
    puts "Combustivel: #{@combustivel}"
    puts "--------------------"
  end

  def move(distancia)
    @quilometragem += distancia
  end

  def getPegadaCarbono
    if @combustivel == "gasolina"
      return 20 * @quilometragem
    elsif @combustivel == "alcool"
      return 10 * @quilometragem
    elsif @combustivel == "hibrido"
      return 15 * @quilometragem
    end
  end
  
end
