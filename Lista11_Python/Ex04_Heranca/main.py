from produto import *
from produto_perecivel  import *

produto = Produto(1, 12, "blabal", 90)
produto_perecivel = ProdutoPerecivel(1, 12, "blabal", 90, 50)

check = issubclass(Produto, ProdutoPerecivel)
print(check)
check = issubclass(ProdutoPerecivel, Produto)
print(check)
