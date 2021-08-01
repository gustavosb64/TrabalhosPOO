require './pegada_de_carbono.rb'

class Predio
  include PegadaDeCarbono

  attr_accessor :n_frequentadores, :media_lixo_por_morador, :consumo_gas_diario

  def initialize(n_frequentadores, media_lixo_por_morador, consumo_gas_diario)
    raise "Predio cannot be instanciated"
  end

  def print
    puts "n_frequentadores: #{@n_frequentadores}"
    puts "media_lixo_por_morador: #{@media_lixo_por_morador}"
    puts "consumo_gas_diario: #{@consumo_gas_diario}"
  end

  def getPegadaCarbono
    pCarbono = (@media_lixo_por_morador * @n_frequentadores * 0.2) + @consumo_gas_diario * 0.1
    return pCarbono
  end
  
end
