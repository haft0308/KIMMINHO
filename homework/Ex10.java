
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10.
		int i = 0, j = 0;
		for (i = 1; i < 10; i++) 
		{
			for (j = 1; j < 10; j++)
			{
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
		System.out.println();
		//11.
		int x = 0;
		while (x < 5)
		{
			x++;
			for (i = 0; i < x; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
