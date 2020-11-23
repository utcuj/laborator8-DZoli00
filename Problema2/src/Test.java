
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numeric a = new Complex(1,2);
		Numeric b = new Fractie(2.86);
		Numeric c = new Complex(2,3);
		
		Numeric  d = new Fractie(4.75);
		a.adunare(b);
		
		System.out.println(a.toString());
		
		a.adunare(c);
		
		System.out.println(a.toString());
		
		b.adunare(d);
		System.out.println(b.toString());
		
		Numeric[][] mat1 = new Numeric[3][3];
		Numeric[][] mat2 = new Numeric[3][3];
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; ++j) {
				mat1[i][j] = new Complex(2.2,2.2);
				mat2[i][j] = new Fractie(3);
			}
		}
		
		Matrice a1 = new Matrice(mat1);
		Matrice b1 = new Matrice(mat2);
		
		a1.adunare(b1);
		
		a1.afisare();
		
		
	}

}
