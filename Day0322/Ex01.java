import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int a = 0;
		while (true)
		{
			System.out.println("1-10사이의 숫자를 입력하세요. 0을 입력하면 종료합니다.");
			i = sc.nextInt();
			if (i > 0 && i <= 10)
			{
			a++;
				continue;
			}
			if (i == 0)
				System.out.println(a + "번 입력받았습니다.");
				break;
		}
		
	}

}
