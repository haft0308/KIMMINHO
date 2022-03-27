
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		int i = 0, j = 0;
		for (i = 0; i < 5; i++)
		{
			j++;
			a[i] = j;
			System.out.println("a["+i+"] = "+a[i]);
		}
		System.out.println();
		int[] b = new int[5];
		j = 1;
		for (i = 0; i < 5; i++)
		{
			b[i] = j;
			j += 3;
			System.out.println("b["+i+"] = "+b[i]);
		}
		System.out.println();
		int[] c = new int[5];
		j = 1;
		for (i = 0; i < 5; i++)
		{
			c[i] = j;
			j += 2;
			System.out.println("c["+i+"] = "+c[i]);
		}
		System.out.println();
		int[] d = new int[5];
		j = 2;
		for (i = 0; i < 5; i++)
		{
			d[i] = j;
			j += 2;
			System.out.println("d["+i+"] = "+d[i]);
		}
	}

}
