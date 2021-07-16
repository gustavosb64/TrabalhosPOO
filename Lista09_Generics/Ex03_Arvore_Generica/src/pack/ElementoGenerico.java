package pack;

public class ElementoGenerico <T> implements Comparable<T>{
	
	private T valorElemento;
	private ElementoGenerico<T> esquerda;
	private ElementoGenerico<T> direita;
	
	public ElementoGenerico(T valorElemento){
		this.valorElemento = valorElemento;
		esquerda = null;
		direita = null;
	}

	public T getValorElemento() {
		return valorElemento;
	}

	public void setValorElemento(T valorElemento) {
		this.valorElemento = valorElemento;
	}

	public ElementoGenerico<T> getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(ElementoGenerico<T> esquerda) {
		this.esquerda = esquerda;
	}

	public ElementoGenerico<T> getDireita() {
		return direita;
	}

	public void setDireita(ElementoGenerico<T> direita) {
		this.direita = direita;
	}

	@Override
	public int compareTo(T o) {
		return 0;
	}

}
