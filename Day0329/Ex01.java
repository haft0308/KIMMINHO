
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, j = 0, k = 1;
/*		int[][] a = new int[5][5];
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = k;
				System.out.print(a[i][j]+"\t");
			}
			k++;
			System.out.println();
		}
		System.out.println();
		int[][] b = new int[5][5];
		for (i = 0; i < 5; i++)
		{
			for(j = 0; j < 5; j++)
			{
				b[i][j] = j+1;
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] c = new int[5][5];
		for (i = 0; i < 5; i++)
		{
			int n = 0;
			for (j = 0; j < 5; j++)
			{
				c[i][j] = i + 1 + n;
				n = n + 5;
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		} */
		System.out.println();
		int e = 1, x = 0;
		int[][] d = new int[5][5];
		for (i = 0; i < 5; i++)
		{
			x = i ;
			for (j = 0; j < 5; j++)
			{
				d[i][x] = e;
				System.out.print("d["+i+"]["+x+"] = "+d[i][x]+"\t");
				e++;
				x++;
				if ( x > 4)
				{
					break;
				}
			}
			System.out.println();
		}
		int f = 2, g = 0;
		int[][] num = new int[5][5];
		for (i = 0; i < 5; i++)
		{
			g = i;
			for (j = 0; j < 5; j++)
			{
				num[i][g] = f;
				System.out.print("num["+i+"]["+g+"] = "+num[i][g]+"\t");
				f += 2;
				g++;
				if (g > 4)
				{
					break;
				}
			}
			System.out.println();
		}
		int a = 1, b = 0; 
		int[][] ar = new int[5][5];
		for (i = 0; i < 5; i++)
		{
			b = 0;
			for (j = 0; j < 5; j++)
			{
				ar[i][b] = a;
				System.out.print("ar["+i+"]["+b+"] = "+ar[i][b]+"\t");
				a++;
				b++;
				if (b > i)
				{
					break;
				}
			}
			System.out.println();
		}
	}

}
