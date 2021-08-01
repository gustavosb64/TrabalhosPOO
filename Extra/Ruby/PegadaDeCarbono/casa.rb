require './predio.rb'

class Casa < Predio

  attr_accessor :n_salas

  def initialize(n_frequentadores, media_lixo_por_morador, consumo_gas_diario, n_comodos, n_chuveiros)
    @n_frequentadores = n_frequentadores
    @media_lixo_por_morador = media_lixo_por_morador
    @consumo_gas_diario = consumo_gas_diario
    @n_comodos = n_comodos
    @n_chuveiros = n_chuveiros
  end

  def print
    puts "CASA"
    super()
    puts "n_comodos: #{@n_comodos}"
    puts "n_chuveiros: #{@n_chuveiros}"
    puts "--------------------"
  end

  def getPegadaCarbono
    pCarbono = (@media_lixo_por_morador * @n_frequentadores * 0.05) + @consumo_gas_diario * 0.1 + @n_comodos*0.07 + @n_chuveiros*0.2
    return pCarbono
  end

end
