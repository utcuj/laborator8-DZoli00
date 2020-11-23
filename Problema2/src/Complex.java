
public class Complex implements Numeric {
	private double parteReala;
	private double parteImaginara;
	
	public Complex(double a, double b) {
	this.parteReala = a;
	this.parteImaginara = b;
	}
	
	public Numeric adunare(Numeric x) {
		if( x instanceof Complex) {
			this.parteReala += ((Complex) x).parteReala;
			this.parteImaginara += ((Complex) x).parteImaginara;
		} else {
			this.parteReala += ((Fractie)x).getFractie();
		}
		return this;
	}
	
	public double getParteReala() {
		return parteReala;
	}

	public void setParteReala(int parteReala) {
		this.parteReala = parteReala;
	}

	public double getParteImaginara() {
		return parteImaginara;
	}

	public void setParteImaginara(int parteImaginara) {
		this.parteImaginara = parteImaginara;
	}

	public Numeric scadere(Numeric x) {
		if( x instanceof Complex) {
			this.parteReala -= ((Complex) x).parteReala;
			this.parteImaginara -= ((Complex) x).parteImaginara;
		} else {
			this.parteReala -= ((Fractie)x).getFractie();
		}
		return this;
	}
	
	public String toString() {
		if(this.parteImaginara > 0) {
			return this.parteReala + "+" + this.parteImaginara+"i";
		}
		return this.parteImaginara + " " + this.parteImaginara+"i";
	}
	

}
