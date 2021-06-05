package jogo;

public class Main {
	public static void main(String[] args) {

        //DECLARANDO DOS PODERES
        //  categorias podem ser agua, terra, fogo, ar ou raio;
        //  ataques de estilo defensivo incrementam o escudo extra da personagem em valor equivalente a sua intensidade de ataque;
        Superpoder rajadaFogo = new Superpoder("Rajada de fogo", 50, Categoria.FOGO, Estilo.OFENSIVO);
        Superpoder relampago = new Superpoder("Relampago", 90, Categoria.RAIO, Estilo.OFENSIVO);
        Superpoder vendaval = new Superpoder("Vendaval", 50, Categoria.AR, Estilo.OFENSIVO);
        Superpoder chicoteAgua = new Superpoder("Chicote de Agua", 65, Categoria.AGUA, Estilo.OFENSIVO);
        Superpoder muralhaFogo = new Superpoder("Muralha de Fogo", 50, Categoria.FOGO, Estilo.DEFENSIVO);
        Superpoder escudoTerra = new Superpoder("Escudo de Terra", 100, Categoria.TERRA, Estilo.DEFENSIVO);

        //ERROS DE TESTE
        Super escudoTerra = new Superpoder("Escudo de Terra", 100, Categoria.TERRA, Estilo.DEFENSIVO);
        prin();

        //CRIANDO PERSONAGENS
		Personagem heroi = new SuperHeroi("Zuko", 100, Categoria.FOGO);
        heroi.adicionarPoder(rajadaFogo);
        heroi.adicionarPoder(relampago);
        heroi.adicionarPoder(muralhaFogo);

		Personagem vilao = new SuperHeroi("Aang", 100, Categoria.AR);
        vilao.adicionarPoder(vendaval);
        vilao.adicionarPoder(chicoteAgua);
        vilao.adicionarPoder(escudoTerra);

        //LACO COM USO DE ATAQUES ALEATORIOS
        while (heroi.getVida() > 0 && vilao.getVida() > 0){
            if(Math.random() > 0.5){
                if(Math.random() > 0.5) heroi.atacar(rajadaFogo, vilao);
                else heroi.atacar(relampago, vilao);
                if (vilao.getVida() <= 0) break;
            }
            else heroi.atacar(muralhaFogo, vilao);

            if(Math.random() > 0.5){
                if(Math.random() > 0.5) vilao.atacar(vendaval, heroi);
                else vilao.atacar(chicoteAgua, heroi);
            }
            else vilao.atacar(escudoTerra, heroi);
        }

	    System.out.println();
	    System.out.println("---------------------------------------");

        if(heroi.getVida() > 0) System.out.println(heroi.getNome() + " ganhou!!");
        else System.out.println(vilao.getNome() + " ganhou...");
	}
}
