import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persoana[] persoane = new Persoana[5];
		
		persoane[0] = new Persoana("Andrei", "Popescu", 13);
		persoane[1] = new Persoana("Razvan", "Curte", 21);
		persoane[2] = new Persoana("Feri", "Pop", 19);
		persoane[3] = new Persoana("Allison", "Minge", 18);
		persoane[4] = new Persoana("Robert", "Lewa", 16);
		
		
		for(Persoana p: persoane) {
			System.out.println(p.toString());
		}
	
		System.out.println();
		Arrays.sort(persoane);
		
		for(Persoana p: persoane) {
			System.out.println(p.toString());
		}
		
		
	}
}
