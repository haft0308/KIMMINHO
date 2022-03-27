import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하시오(cm)");
		int tall = sc.nextInt();
		System.out.println("체중을 입력하시오(kg)");
		int kg = sc.nextInt();
		double bmi = kg/((tall*0.01)*(tall*0.01));
		System.out.printf("bmi = %1.2f",bmi);
		if (bmi < 18.5)
		{
			System.out.println("마름");
		}
		else if (bmi >= 18.5 && bmi < 25)
		{
			System.out.println("보통");
		}
		else if (bmi >= 25 && bmi < 30)
		{
			System.out.println("가벼운 비만");
		}
		else 
		{
			System.out.println("심한 비만");
		}
	}

}
