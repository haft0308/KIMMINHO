import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0, max = 0, min = 100;
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++)
		{
			a = sc.nextInt();
			arr[i] = a;
			if (arr[i] > max)
			{
				max = arr[i];
			}
			if (arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("max = "+ max);
		System.out.println("min = "+ min);
		//6 
		int b, total = 0, avr = 0;
		int[] math = new int [5];
		for(int i = 0; i < 5; i++)
		{
			b = sc.nextInt();
			math[i] = b;
			total += math[i];
		}
		avr = total/5;
		System.out.println("총점 : " + total + "평균" + avr);
	}

}
