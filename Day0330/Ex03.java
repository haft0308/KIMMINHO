import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[10];
		System.out.println("검색할 값(1~10)을 입력하시오.");
		for (int i = 0; i < 10; i++)
		{
			arr[i] = (int)(Math.random()*10+1);
			if (arr[i] == a)
			{
				System.out.println("인덱스"+i+"에서 검색");
			}
		}
		System.out.println(Arrays.toString(arr));
		//7-1
		int[] arr1 = new int[45];
		int[] ran = new int[1];
		for (int i = 0; i < 45; i++)
		{
			arr1[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr1));
		for (int i = 0; i < 10; i++)
		{
			int b = (int)(Math.random()*44);
			int c = (int)(Math.random()*44);
			ran[0] = arr1[b];
			arr1[b] = arr1[c];
			arr1[c] = ran[0];
		}
		System.out.println(Arrays.toString(arr1));
	}	

}
