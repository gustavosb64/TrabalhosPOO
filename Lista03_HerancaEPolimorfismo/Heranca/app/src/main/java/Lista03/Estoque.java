package Lista03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
    List<Produto> listaProdutos = new ArrayList<Produto>();

    public void cadastrarProduto(Produto p){
        this.listaProdutos.add(p);
        return;
    }

    public void retirarEstoque(Produto p){
        Produto c = this.consultarProduto(p.getCodigo());

        if (c == null){
            System.out.println("Produto nao encontrado");
            return;
        }

        this.listaProdutos.remove(c);

        return;
    }

    public Produto consultarProduto(int codigo){

        for (Produto p : listaProdutos){
            if (p.getCodigo() == codigo) return p;
        }

        return null;
    } 

    public double custoTotal(){
        double precoTotal = 0.0;
        
        for (Produto p : listaProdutos){
            precoTotal += p.getPreco_unitario();
        }

        return precoTotal;
    }

    public void imprimirTodosProdutos(){
        for (Produto p : listaProdutos){
	        System.out.println("Codigo: "+p.codigo); 
	        System.out.println("Descricao: "+p.descricao); 
	        System.out.println("Quantidade em estoque: "+p.quantidade_estoque); 
	        System.out.println("======================");
        }
    }

}

