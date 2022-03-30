
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] star = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
		};
		char[][] starT = new char[5][4];
		for (int i = 0; i < 5; i++)
		{
			for (int j = 3; j >= 0; j--)
			{
				starT[i][j] = star[j][i];
				System.out.print(starT[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
