

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		//Creeam obiectul student
		Student ana = new Student("Ana", "Pop");
		
		//afisam datele despre obiect
		System.out.println(ana.toString());
		
		//creeam obiectul masina
		Masina msn = new Masina("Negru", "Audi");
		
		//afisam datele despre obiectul de ti[ masina
		System.out.println(msn.toString());
		
		//obiectului student ii setam masina
		ana.setMsn(msn);
		
		//afisam datele despre student
		System.out.println(ana.toString());
		
		//facem shallow copy de student
		Student anacpy = (Student) ana.clone();
		
		//afisam datele desprie clone
		System.out.println(anacpy.toString());
		
		//schimbam culaorea la masina
		ana.getMsn().setClr("Alb");
		
		
		//daca in clasa Student methoda clone este de shallow copy atunci
		//daca facem modificare in obiectul original se face modificarea si in copie si invers
		//insa daca methoda clone() este de deep copy atunci NU!!
		System.out.println(ana.toString());
		
		System.out.println(anacpy.toString());
		
		anacpy.getMsn().setClr("Gri");
		
		System.out.println(ana.toString());
		
		System.out.println(anacpy.toString());
		
	}

}
