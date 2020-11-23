
public class Matrice {

	private Numeric[][] matrix = new Numeric[3][3];

	public Matrice(Numeric[][] a) {
		this.matrix = a;
	}

	public Numeric getElement(int i, int j) {

		return this.matrix[i][j];
	}

	public void adunare(Matrice a) {
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				this.matrix[i][j].adunare(a.getElement(i, j));
			}
		}
	}

	public void scadere(Matrice a) {
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				this.matrix[i][j].scadere(a.getElement(i, j));
			}
		}
	}

	public Numeric[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(Numeric[][] matrix) {
		this.matrix = matrix;
	}

	public void afisare() {
		for (int i = 0 ; i <3 ; ++i) {
			for(int j=0; j<3 ; ++j) {
				System.out.print(this.matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
