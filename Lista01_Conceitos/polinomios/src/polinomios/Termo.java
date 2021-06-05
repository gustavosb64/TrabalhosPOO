package polinomios;

public class Termo {
	private double coeficiente;
	private int grauTermo;

	public Termo(double coeficiente, int grau) {
		this.coeficiente = coeficiente;
		this.grauTermo = grau;
	}

	public double getCoeficiente() {
		return coeficiente;
	}
	
	public void setCoeficiente(double coeficiente) {
		this.coeficiente = coeficiente;
	}
	
	public int getGrauTermo() {
		return this.grauTermo;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this.getGrauTermo() == ((Termo) o).getGrauTermo()) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.getCoeficiente() + "X^" + this.getGrauTermo();
	}
}
