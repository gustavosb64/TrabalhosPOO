require "./product.rb"
require "./not_perishable_product.rb"
require "./perishable_product.rb"
require "./special_perishable_product.rb"
require "./stock.rb"

#Creating products
perishable = PerishableProduct.new(1, 12, "perishable product", 9, Date.new(2021, 10, 01))
special = SpecialPerishableProduct.new(2, 80, "special perishable product", 12, Date.new(2022, 01, 27))
not_perishable = NotPerishableProduct.new(3, 98, "not perishable product", 20, 3)

#Registering products in stock
stock = Stock.new()
stock.registerProduct(perishable)
stock.registerProduct(special)
stock.registerProduct(not_perishable)

#Running some tests
search = stock.queryByCode(2)
search.print

totalPrice = stock.totalPrice

puts "Listing all products:"
stock.printAllProducts

puts "---------------------"

stock.withdraw(special)
stock.printAllProducts

puts "---------------------"

special = SpecialPerishableProduct.new(5, 87, "special perishable product 2", 45, Date.new(2025, 10, 31))
stock.registerProduct(special)
stock.printAllProducts()

puts "---------------------"

stock.withdraw(perishable)
stock.printAllProducts()
