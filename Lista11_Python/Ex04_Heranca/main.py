from produto import *
from produto_nao_perecivel  import *
from produto_perecivel  import *
from produto_perecivel_especial  import *
from estoque import *
import datetime

#Criando produtos
produto = ProdutoNaoPerecivel(1, 12, "produto não perecível 1", 90, 5)

dataValidade1 = datetime.datetime(2021, 12, 3)
produto_perecivel = ProdutoPerecivel(2, 435, "produto perecível 1", 334, dataValidade1)

dataValidade2 = datetime.datetime(2023, 3, 29)
produto_perecivel_especial = ProdutoPerecivelEspecial(3, 435, "produto perecível 1", 334, dataValidade2)

#Adicionando produtos ao estoque
estoque = Estoque()
estoque.CadastrarProduto(produto)
estoque.CadastrarProduto(produto_perecivel)
estoque.CadastrarProduto(produto_perecivel_especial)

#Buscando produto de código 2
busca = estoque.ConsultarProduto(2)
print()

#Imprimindo custo total do estoque
custoTotal = estoque.CustoTotal()
print()

#Listando todos os produtos
print("Listando todos os produtos:")
estoque.ImprimirTodosProdutos()
print()

#Removendo produto_perecivel_especial 
print("Removendo produto_perecivel_especial:")
estoque.RetirarProduto(produto_perecivel_especial)
estoque.ImprimirTodosProdutos()
print()

#Cadastrando produto_perecivel_especial 
print("Cadastrando produto_perecivel_especial:")
estoque.CadastrarProduto(produto_perecivel_especial)
estoque.ImprimirTodosProdutos()
print()

#Removendo produto de codigo 1 
print("Removendo produto de codigo 1:")
estoque.RetirarProdutoCodigo(1)
estoque.ImprimirTodosProdutos()
print()
