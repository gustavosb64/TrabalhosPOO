from produto import *

class ProdutoPerecivel(Produto):

    def __init__(self, codigo, preco_unitario, descricao, qtd_estoque, data_validade):
        self.codigo = codigo
        self.preco_unitario = preco_unitario
        self.descricao = descricao
        self.qtd_estoque = qtd_estoque
        self.data_validade = data_validade
