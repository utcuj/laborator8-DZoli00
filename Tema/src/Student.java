
public class Student implements Cloneable{
	private String nume;
	private String prenume;
	private Masina msn;
	
	public Student(String nume, String prenume){
		this.nume = nume;
		this.prenume = prenume;
	}
	
	public Student(String nume, String prenume, Masina msn){
		this.nume = nume;
		this.prenume = prenume;
		this.msn = msn;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public Masina getMsn() {
		return msn;
	}

	public void setMsn(Masina msn) {
		this.msn = msn;
	}
	
	public String toString() {
		if( msn == null) {
		return "Nume: " + nume + " Prenume: " + prenume + " Masina: " + msn;
		} else {
			return "Nume: " + nume + " Prenume: " + prenume + " Masina: " + msn.toString();
		}
	}
	
	//PENTRU SHALLOW COPY
	/*protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}*/
	
	//DEEP COPY
	protected Object clone() throws CloneNotSupportedException {
	    Student cloned = (Student)super.clone();
	    cloned.setMsn((Masina)cloned.getMsn().clone());   
	    return cloned;
	}
	
}
