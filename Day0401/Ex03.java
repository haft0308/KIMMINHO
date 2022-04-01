
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2, 3, 4, 5};
		int max = 0;
		int sum = 0;
		float avg = 0.0f;
		
		max = makeMax(arr1);
		System.out.println(max);
		
		sum = makeSum(arr1);
		System.out.println(sum);
		
		avg = makeAvg(arr1);
		System.out.println(avg);
	}
	static int makeMax(int[] arr)
	{
		int max = 0;
		for (int i = 0; i < 5; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	static int makeSum(int[] arr)
	{
		int sum = 0;
		for(int i = 0; i < 5; i++)
		{
			sum += arr[i];
		}
		return sum;
	}
	static float makeAvg(int[] arr)
	{
		int avg, sum = 0;
		for (int i = 0; i < 5; i++)
		{
			sum += arr[i];
		}
		avg = sum/5;
		return avg;
	}
}
