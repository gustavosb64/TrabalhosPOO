package Lista03;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto{
    protected LocalDate data_validade; 

    public ProdutoPerecivel(int codigo, double preco_unitario, String descricao, int quantidade_estoque, LocalDate data_validade) {
        super(codigo, preco_unitario, descricao, quantidade_estoque);
        this.data_validade = data_validade;
    }

    public LocalDate getData_validade() {
        return this.data_validade;
    }

    public void setData_validade(LocalDate data_validade) {
        this.data_validade = data_validade;
    }

    public int retiraProduto(int n, LocalDate dataAtual) {

        dataAtual = dataAtual.plusDays(30);

        if(dataAtual.isAfter(this.data_validade)){
            System.out.println("Este produto esta fora do prazo. Zerando estoque.");
            this.quantidade_estoque = 0;
            return 0;
        }
        
        if (this.quantidade_estoque >= n){
            this.quantidade_estoque -= n;
            return n;
        }

        int q = this.quantidade_estoque;
        this.quantidade_estoque = 0;

        return q;
    }
 
    @Override
    public boolean adicionarProduto(int n) {
        if (this.quantidade_estoque == 0){
            super.adicionarProduto(n);
            System.out.println("Produto adicionado!");
            return true;
        }
        System.out.println("Nao da para adicionar! Ainda ha estoque.");
        return false;
    }

}

