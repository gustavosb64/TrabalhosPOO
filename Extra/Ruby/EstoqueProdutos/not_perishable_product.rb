require "./product.rb"
require 'date'

class NotPerishableProduct < Product

  attr_reader :warranty

  def initialize(code, price, description, num_in_stock, warranty)
    @code = code
    @price = price
    @description = description
    @num_in_stock = num_in_stock
    @warranty = warranty
  end

end
