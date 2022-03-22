
public final class Gugudan4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0,j = 0, res = 0;
		for (i = 1; i <= 9; i++)
		{
			for (j = 2; j <= 9; j++)
			{
				res = i * j;
				System.out.print(j + "*" + i + "=" + res + "\t");
			}
			System.out.println();
		}
	}

}
