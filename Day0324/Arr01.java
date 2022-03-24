
public class Arr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int sum = 0;
		for (i = 1; i<101; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
		
		int num = 0;
		int[] a = new int[] {2, 10, 8, 5, 3, 9};
		for (i = 0; i < 6; i++)
		{
			num = num+a[i];
		}
		System.out.println(num);
	}

}
