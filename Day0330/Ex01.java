import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
//		int[] arr = new int[10];
//		for (i = 0; i < 10; i++)
//		{
//			arr[i] = i + 1;
//		}
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int[] arr1 = new int[5];
		for (int j = 0; j < 5; j++)
		{
			a = sc.nextInt();
			arr1[j] = a;
		}
		System.out.println(Arrays.toString(arr1));
		int emp[] = new int[1];
		emp[0] = arr1[0];
		arr1[0] = arr1[1];
		arr1[1] = emp[0];
		System.out.println(Arrays.toString(arr1));
	}

}
