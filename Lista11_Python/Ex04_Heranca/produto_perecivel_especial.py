from produto import *
from produto_perecivel import *
import datetime

class ProdutoPerecivelEspecial(ProdutoPerecivel):

    def __str__(self):
        string = "Produto perecível especial:\n"
        string += super().__str__()
        string += ", validade: "+str(self._dataValidade.strftime("%d/%m/%Y"))
        return string
