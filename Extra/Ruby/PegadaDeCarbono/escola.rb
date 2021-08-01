require './predio.rb'

class Escola < Predio

  attr_accessor :n_salas

  def initialize(n_frequentadores, media_lixo_por_morador, consumo_gas_diario, n_salas)
    @n_frequentadores = n_frequentadores
    @media_lixo_por_morador = media_lixo_por_morador
    @consumo_gas_diario = consumo_gas_diario
    @n_salas = n_salas
  end

  def print
    puts "ESCOLA"
    super()
    puts "n_salas: #{@n_salas}"
    puts "--------------------"
  end

  def getPegadaCarbono
    pCarbono = (@media_lixo_por_morador * @n_frequentadores * 0.05) + @consumo_gas_diario * 0.1 + @n_salas*0.30 
    return pCarbono
  end

end
