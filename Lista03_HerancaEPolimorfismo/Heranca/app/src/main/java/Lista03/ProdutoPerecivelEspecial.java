package Lista03;

import java.time.LocalDate;

public class ProdutoPerecivelEspecial extends ProdutoPerecivel{

    public ProdutoPerecivelEspecial(int codigo, double preco_unitario, String descricao, int quantidade_estoque, LocalDate data_validade) {
        super(codigo, preco_unitario, descricao, quantidade_estoque,data_validade);
    }

    public void imprimirNotaControle(){
        System.out.println("===NOTA DE CONTROLE===");
        System.out.println("Codigo: "+this.codigo); 
        System.out.println("Descricao: "+this.descricao); 
        System.out.println("Quantidade em estoque: "+this.quantidade_estoque); 
        System.out.println("Data de validade: "+this.data_validade); 
        System.out.println("======================");

        return;
    }  
}

