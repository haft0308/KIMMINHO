import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		if (value >= 90)
		{
			System.out.println('A');
		}
		else if (value >= 80)
		{
			System.out.println('B');
		}
		else if (value >= 70)
		{
			System.out.println('C');
		}
		else if (value >= 60)
		{
			System.out.println('D');
		}
		else 
		{
			System.out.println('F');
		}
	}

}
