from produto import *
import datetime

class ProdutoPerecivel(Produto):

    def __init__(self, codigo, preco_unitario, descricao, qtd_estoque, dataValidade):

        #checa se dataValidade é do tipo data
        if (type(dataValidade) != datetime.datetime):
            print("Data inválida!")
            return

        super().__init__(codigo, preco_unitario, descricao, qtd_estoque)
        self._dataValidade = dataValidade

    def __str__(self):
        string = super().__str__()
        string += ", validade: "+str(self._dataValidade.strftime("%d/%m/%Y"))
        return string

    def getDataValidade(self):
        return self._dataValidade

    def setDataValidade(self, dataValidade):
        self._dataValidade = dataValidade

    def retiraEstoque(self, qtd_retirada, dateNow):

        dateNow += datetime.timedelta(days = 30)
        if (dateNow < self._dataValidade):
            return super().retiraEstoque(qtd_retirada)
        else:
            estoqueAtual = super().getEstoque()
            super().retiraEstoque(estoqueAtual)
            return 0
    def acrescentaEstoque(self, qtd_acrescimo):

        estoqueAtual = super().getEstoque()
        if estoqueAtual == 0:
            super().acrescentaEstoque(qtd_acrescimo)
            return True
        else:
            return False
