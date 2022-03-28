
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[5][5];
		int i = 0, j = 0, k = 1;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = k;
				System.out.print(a[i][j]+"\t");
				k++;
			}
			System.out.println();
		}
	}

}
