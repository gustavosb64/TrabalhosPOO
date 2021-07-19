package pack;

public class Email implements Comparable<Email>{
	
	private String titulo;
	private String corpo;
	private Status status;

	@Override
	public int compareTo(Email o) {
		if(this.status.getValor() > o.getStatus().getValor()) 
			return 1;
		if(this.status.getValor() < o.getStatus().getValor())
			return -1;
		return 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		String email = this.status.toString() + "\n" + this.titulo + "\n" + this.corpo + "\n\n";
		return email;
	}

}
