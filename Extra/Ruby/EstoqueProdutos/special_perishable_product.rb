require "./perishable_product.rb"
require 'date'

class SpecialPerishableProduct < PerishableProduct

  def print()
    super
    puts "Expiration date: #{@expiration_date}"
  end

end
