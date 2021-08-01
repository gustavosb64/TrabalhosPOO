require './pegada_de_carbono.rb'

class Bicicleta
  include PegadaDeCarbono

  attr_accessor :marca, :aro, :calibragem

  def initialize(marca, aro, calibragem)
    @marca = marca
    @aro = aro
    @calibragem = calibragem
  end

  def print
    puts "BICICLETA"
    puts "Marca: #{@marca}"
    puts "Aro: #{@aro}"
    puts "Calibragem: #{@calibragem}"
    puts "--------------------"
  end

  def getPegadaCarbono()
    return 0
  end

end
