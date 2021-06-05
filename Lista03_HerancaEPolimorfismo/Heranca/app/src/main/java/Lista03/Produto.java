package Lista03;

public class Produto{
    protected int codigo;
    protected double preco_unitario;
    protected String descricao;
    protected int quantidade_estoque;

    public Produto(int codigo, double preco_unitario, String descricao, int quantidade_estoque) {
        this.codigo = codigo;
        this.preco_unitario = preco_unitario;
        this.descricao = descricao;
        this.quantidade_estoque = quantidade_estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public int retiraProduto(int n, Estoque estoque) {
        
        if (this.quantidade_estoque >= n){
            this.quantidade_estoque -= n;
            return n;
        }

        int q = this.quantidade_estoque;
        this.quantidade_estoque = 0;

        return q;
    }
    
    public boolean adicionarProduto(int n) {
        this.quantidade_estoque += n;
        return true;
    }

    public void imprimirProduto() {

        System.out.println("--------------------");
        System.out.println("Produto "+this.codigo+", "+this.descricao+", custo de R$"+this.preco_unitario+", quantidade "+this.quantidade_estoque);
        System.out.println("--------------------");

        return;
    }

}
