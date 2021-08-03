require "./product.rb"
require 'date'

class PerishableProduct < Product

  attr_accessor :expiration_date

  def initialize(code, price, description, num_in_stock, expiration_date)
    @code = code
    @price = price
    @description = description
    @num_in_stock = num_in_stock
    @expiration_date = expiration_date
  end

  def withdrawFromStock(num_taken, cur_date)

    if cur_date + 30 > @expiration_date
      @num_in_stock = 0
      return 0
    end
    
    @num_in_stock -= num_taken

    if @num_in_stock < 0
      return_value = num_taken + @num_in_stock
      @num_in_stock = 0
      return return_value 
    end

    return num_taken
  end

  def addToStock(num_added)
    @num_in_stock == 0 ? @num_in_stock = num_added : @num_in_stock = 0
    return
  end
end
