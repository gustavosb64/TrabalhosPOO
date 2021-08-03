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
      if p.code == code 
        return p
      end
    end

    return nil
  end

  def withdraw(product)

    p = queryByCode(product.code)

    if p == nil
      return nil
    end

    @stock_list.delete(p)
    return p
  end

  def totalPrice()

    total_price = 0

    @stock_list.each do |p|
      puts p.price
      #totalPrice += p.price
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
