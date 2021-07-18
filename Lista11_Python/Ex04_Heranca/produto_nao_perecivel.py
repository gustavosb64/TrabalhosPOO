from produto import *

class ProdutoNaoPerecivel(Produto):

    def __init__(self, codigo, preco_unitario, descricao, qtd_estoque, dataGarantia):
        super().__init__(codigo, preco_unitario, descricao, qtd_estoque)
        self._dataGarantia = dataGarantia

    def getGarantia(self):
        return self._dataGarantia
