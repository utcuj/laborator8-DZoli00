
public class Fractie implements Numeric{
	private double fractie;
	
	public Fractie(double fractie) {
		this.fractie = fractie;
	}

	@Override
	public Numeric adunare(Numeric x) {
		if( x instanceof Complex) {
			Complex c = new Complex(fractie+((Complex) x).getParteReala(),0);
			return c;
		} else {
			this.fractie += ((Fractie)x).getFractie();
			return this;
		}
	}

	@Override
	public Numeric scadere(Numeric x) {
		// TODO Auto-generated method stub
		if( x instanceof Complex) {
			Complex c = new Complex(fractie-((Complex) x).getParteReala(),0);
			return c;
		} else {
			this.fractie -= ((Fractie)x).getFractie();
			return this;
		}
	}

	public double getFractie() {
		return fractie;
	}

	public void setFractie(double fractie) {
		this.fractie = fractie;
	}
	
	public String toString() {
		return this.fractie + "";
	}
	

}
