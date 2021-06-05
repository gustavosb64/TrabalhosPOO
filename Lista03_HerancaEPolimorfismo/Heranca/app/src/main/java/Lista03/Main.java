package Lista03;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        //Declarando produdutos
        ProdutoPerecivel p1 = new ProdutoPerecivel(1, 1.99, "perecivel", 10, LocalDate.of(2021,05,12));
        ProdutoPerecivelEspecial p2 = new ProdutoPerecivelEspecial(3, 29.9, "perecivel_especial", 48, LocalDate.of(2022,06,14));
        ProdutoNaoPerecivel p3 = new ProdutoNaoPerecivel(2, 9.9, "nao_perecivel1", 20, 3);

        Estoque estoque = new Estoque();

        //Adicionando ao estoque
        estoque.cadastrarProduto(p1);
        estoque.cadastrarProduto(p2);
        estoque.cadastrarProduto(p3);

        //Retirando um produto que vencerá nos próximos 30 dias
        p1.retiraProduto(1, LocalDate.of(2021,05,20));

        //Realizando testes
        Produto consultaProduto = estoque.consultarProduto(1);
        if (consultaProduto != null){
            System.out.println("Resultado da busca: ");
            consultaProduto.imprimirProduto();
        }
        else{
            System.out.println("Produto nao encontrado!");
        }

        estoque.imprimirTodosProdutos();

        return;
    }
}
