
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6.
		int i = 1, j = 0;;
		while (i < 101)
		{
			j += i;
			i++;
		}
		System.out.println(j);
		//7.
		int a = 0, b = 0;
		for (i = 1; i < 101; i++)
		{
			a = i*i;
			b += a;
		}
		System.out.println(b);
		//8.
		int c = 1, d = 0, e = 0;
		while (c < 101)
		{
			d = d + c;
			e = e + d;
			c++;
		}
		System.out.println(e);
		
	}

}
