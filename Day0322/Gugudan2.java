import java.util.Scanner;

public class Gugudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0, j = 0;
		for (i = 1; i <= 9; i++)
		{
			j = num * i;
			System.out.println(num + "*" + i + "=" + j);
		}
	}

}
