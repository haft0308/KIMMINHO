import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b)
		{
			System.out.println(a);
		}
		else if (a == b)
		{
			System.out.println("Values are same");
		}
		else 
		{
			System.out.println(b);
		}
		int i = 0, j = 0;
		while (true)
		{
			i = sc.nextInt();
			j = sc.nextInt();
			if (i == j) 
			{
				System.out.println("Same");
				break;
			}
			else
			{
				System.out.println("Different");
			}
		}
	}

}
