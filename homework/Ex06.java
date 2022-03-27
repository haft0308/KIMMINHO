import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i = 0, max = 0;
/*		System.out.println("정수 10개를 입력하시오");
		for (i = 0; i < 10; i++)
		{
			int[] a = new int[10];
			num = sc.nextInt();
			a[i] = num;
			if (a[i] > max)
			{
				max = a[i];
			}
			else
			{
				
			}
		}
		System.out.println("최댓값 : "+max);
		
		System.out.println();
		
		int score = 0,total = 0, avr = 0;
		for (i = 0; i < 5; i++) 
		{
			System.out.println("점수를 입력하세요");
			int[] math = new int[5];
			score = sc.nextInt();
			math[i] = score;
			total += math[i];
			avr = total/5;
		}
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ avr);
		
		System.out.println(); */
		
		System.out.println("숫자를 입력하시오");
		int find = sc.nextInt(), j = 0;
		int[] ott = new int[10];
		for(i = 1; i <= 10; i++)
		{
			ott[j] = i;
			if (ott[j] == find)
			{
				break;
			}
		}
		System.out.println("find. ott["+j+"] = "+ott[j]);
	}

}
