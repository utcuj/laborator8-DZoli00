
public class Masina implements Cloneable{
	private String clr;
	private String marca;
	
	public Masina(String clr,String marca){
		this.clr = clr;
		this.marca = marca;
	}

	public String getClr() {
		return clr;
	}

	public void setClr(String clr) {
		this.clr = clr;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String toString() {
		return "Marca: " + marca + " culoare: " + clr;
	}
	
	protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}
}
