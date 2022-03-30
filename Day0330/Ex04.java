import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8
		Scanner sc = new Scanner(System.in);
		int a, b  = 0;
		int[][] score = new int[3][4];
		for (int i = 0; i < 3; i++)
		{
			System.out.println(i + "번째 사람의 점수 입력");
			for(int j = 0; j < 3; j++)
			{
				a = sc.nextInt();
				score[i][j] = a;
				b += score[i][j];
				score[i][3] = b;
			}
			b = 0;
		}
		System.out.println("국어\t영어\t수학\t총점");
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				System.out.print(score[i][j]+ "\t");
			}
			System.out.println();
		}
	}

}
