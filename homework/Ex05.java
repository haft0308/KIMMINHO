import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int[] num = new int[5];
		for (i = 0; i < 5; i++) 
		{
			System.out.println("숫자를 입력하세요.");
			int a = sc.nextInt();
			num[i] = a;
		}
		for (i = 0; i < 5; i++)
		{
			System.out.println("num["+i+"] = "+num[i]);
		}
	}

}
