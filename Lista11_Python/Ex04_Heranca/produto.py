from abc import ABC, abstractmethod

class Produto(ABC):

    def __init__(self, codigo, precoUnitario, descricao, qtdEstoque):
        self._codigo = codigo
        self._precoUnitario = float(precoUnitario)
        self._descricao = descricao
        self._qtdEstoque = qtdEstoque

    def __str__(self):
        string = "Produto: "+str(self._codigo)+", "+self._descricao+", custo de R$"+str(self._precoUnitario)+", quantidade "+str(self._qtdEstoque)
        return string

    def getPreco(self):
        return self.preco

    def setPreco(self, preco):
        self._precoUnitario = preco

    def getDescricao(self):
        return self._descricao

    def setDescricao(self, descricao):
        self._descricao = descricao

    def getCodigo(self):
        return self._codigo

    def getEstoque(self):
        return self._qtdEstoque

    def retiraEstoque(self, qtd_retirada):
        self._qtdEstoque -= qtd_retirada
        if self._qtdEstoque < 0:
            retorno = qtd_retirada + self._qtdEstoque
            self._qtdEstoque = 0
            return (retorno)
        else:
            return qtd_retirada

    def acrescentaEstoque(self, qtd_acrescentada):
        self._qtdEstoque += qtd_acrescentada
