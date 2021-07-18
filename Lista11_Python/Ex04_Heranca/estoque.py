from produto import *
from produto_perecivel import *
from produto_perecivel_especial import *

class Estoque:
    arrayProdutos = []

    def ImprimirTodosProdutos(self):

        print("----------------")
        for produto in self.arrayProdutos:
            print(produto)
            print("----------------")

    def CadastrarProduto(self, produto):

        def ConsultaProdutoInterno(codigo):
            for produto in self.arrayProdutos:
                if produto._codigo == codigo:
                    return False

            return True

        if (issubclass(type(produto), Produto) or type(produto) == Produto):
            codigo = produto.getCodigo()
            consulta = ConsultaProdutoInterno(codigo)
            if (consulta == True):
                self.arrayProdutos.append(produto)
                return True
            else:
                print("Código de produto repitido!")
                return False

        print("Produto inválido!")
        return False

    def ConsultarProduto(self, codigo):
        
        for produto in self.arrayProdutos:
            if produto._codigo == codigo:
                print("Produto de código "+str(codigo)+" encontrado!")
                print(produto)
                return produto

        print("Produto de código "+str(codigo)+" NÃO encontrado!")

        return None


    def RetirarProduto(self, produto):

        def ConsultaProdutoInterno(codigo):
            for produto in self.arrayProdutos:
                if produto._codigo == codigo:
                    return produto

            return None

        if (issubclass(type(produto), Produto) or type(produto) == Produto):
            codigo = produto.getCodigo()
            consulta = ConsultaProdutoInterno(codigo)
            if consulta != None:
                self.arrayProdutos.remove(produto)
                return
            else:
                print("Produto inexistente")
            return

        print("Produto inválido!")
        return None

    def RetirarProdutoCodigo(self, codigo):

        def ConsultaProdutoInterno(codigo):
            for produto in self.arrayProdutos:
                if produto._codigo == codigo:
                    return produto
            return None

        consulta = ConsultaProdutoInterno(codigo)
        if consulta != None:
            self.arrayProdutos.remove(consulta)
            return
        else:
            print("Produto inexistente")
            return 

        print("Produto inválido!")
        return



    def CustoTotal(self):

        custoTotal = 0
        for produto in self.arrayProdutos:
            custoTotal += produto._precoUnitario

        print("Custo total: "+str(custoTotal))

        return custoTotal
