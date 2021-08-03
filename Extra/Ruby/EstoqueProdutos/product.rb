class Product
  attr_accessor :price, :description
  attr_reader :code, :num_in_stock

  def initialize(code, price, description, num_in_stock)
    raise "Product cannot be instancianted!"
  end

  def addToStock(num_added)
    @num_in_stock += num_added
  end

  def withdrawFromStock(num_taken)
    @num_in_stock -= num_taken

    if @num_in_stock < 0
      num_taken += @num_in_stock
      @num_in_stock = 0
    end

    return num_taken
  end

  def print()
    puts "Product id: #{@code}, #{@description}, price: #{@price}, #{@num_in_stock} in stock"
  end

end
