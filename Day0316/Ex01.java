import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int value = sc.next().charAt(0);
		if (value >=97 && value <= 122)
		{
			System.out.println("�빮�� : "+(char)(value-32));
		}
		else
		{
			System.out.println("�߸��� ���ڸ� �Է��߽��ϴ�");
		}
		
	}

}