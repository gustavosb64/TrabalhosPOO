require "./product.rb"

class Stock

  attr_reader :stock_list

  def initialize()
    @stock_list = []
  end

  def registerProduct(product)

    if product.class.name != "NotPerishableProduct" and 
        product.class.name != "PerishableProduct" and 
        product.class.name != "SpecialPerishableProduct"
      puts "Input must be a Product"
      return
    end

    @stock_list.append(product)

  end

  def queryByCode(code)
    
    @stock_list.each do |p|
      return p if p.code == code
    end

    return nil
  end

  def withdraw(product)

    p = queryByCode(product.code)

    @stock_list.delete(p) if p != nil

    return p
  end

  def totalPrice()

    total_price = 0

    @stock_list.each do |p|
      total_price += p.price 
    end

    puts "Total price is: #{total_price}"
    return total_price
  end

  def printAllProducts()

    @stock_list.each do |p|
      p.print
    end

  end

end
