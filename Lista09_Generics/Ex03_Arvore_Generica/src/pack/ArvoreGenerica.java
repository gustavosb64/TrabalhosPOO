package pack;

public class ArvoreGenerica <T extends Comparable>{
	
	private ElementoGenerico<T> raiz;
	
	public ArvoreGenerica(ElementoGenerico<T> raiz) {
		this.raiz = raiz;
	}
	
	public void adicionar(T valor){
        ElementoGenerico<T> novoElemento = new ElementoGenerico<T>(valor);
        if (raiz == null){
            this.raiz = novoElemento;
        }else{
            ElementoGenerico<T> atual = this.raiz;
            while(true){
                if (novoElemento.getValorElemento().compareTo(atual.getValorElemento()) == -1){
                    if (atual.getEsquerda() != null){
						atual = atual.getEsquerda();
                    }else{
                        atual.setEsquerda(novoElemento);
                        break;
                    }
                }else{ //se for maior ou igual
                    if (atual.getDireita() != null){
                        atual = atual.getDireita();
                    }else{
                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }
        }
    }
	
	public void emOrdem(ElementoGenerico<T> atual){
        if (atual != null){
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getValorElemento());
            emOrdem(atual.getDireita());
        }        
    }
	
	public ElementoGenerico<T> getRaiz(){
		return this.raiz;
	}

}
