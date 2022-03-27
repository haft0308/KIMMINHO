import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a >= 25)
		{
			System.out.println("얼음물");
		}
		else
		{
			System.out.println("뜨거운물");
		}
		int b = sc.nextInt();
		if (b % 2 == 1)
		{
			System.out.println("홀수");
		}
		else
		{
			System.out.println("짝수");
		}
	}

}
