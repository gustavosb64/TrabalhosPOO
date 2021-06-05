package Lista03;

public class ProdutoNaoPerecivel extends Produto{
    int tempoGarantia;

    public ProdutoNaoPerecivel(int codigo, double preco_unitario, String descricao, int quantidade_estoque, int tempoGarantia) {
        super(codigo, preco_unitario, descricao, quantidade_estoque);
        this.tempoGarantia = tempoGarantia;
    }

    public int getTempoGarantia() {
        return tempoGarantia;
    }
}

