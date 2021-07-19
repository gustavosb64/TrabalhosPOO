package pack;

public class Generica <T extends Comparable<T>> {
	
	private T listaElementos[] = null;
	
	public Generica() {};
	
	public Generica(T[] listaEleentos) {
		this.listaElementos = listaEleentos;
	}

	public T[] getListaElementos() {
		return listaElementos;
	}

	public void setListaElementos(T[] listaElementos) {
		this.listaElementos = listaElementos;
	}
	
	public T[] sort() {
		if(listaElementos == null)
			return listaElementos;
		
		for(int i = 1; i < listaElementos.length; i++) {
			T aux = listaElementos[i];
			int j = i - 1;
			while((j > -1) && listaElementos[j].compareTo(aux) > 0) {
				listaElementos[j+1] = listaElementos[j];
				j = j-1;
			}
			listaElementos[j+1] = aux;
		}
		return listaElementos;
	}
	
	@Override
	public String toString() {
		String lista[] = new String[listaElementos.length];
		for(int i = 0; i < listaElementos.length; i++) {
			lista[i] = listaElementos[i].toString() + "\n";
		}
		
		String cadeiaElementos = "";
		for (int i = 0; i < lista.length; i++) {
			cadeiaElementos = cadeiaElementos + lista[i];
		}
		return cadeiaElementos;
	}

}
