
public class Arr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, j = 1, sum = 0;
		/*		int[] num = new int[10];
		for (i = 0; i < 10; i++)
		{
			j *= 10;
			num[i] = j;
			sum += j;
		}
		if (num[0] > num[1])
		{
			System.out.println(0);
		}
		else if (num[0] == num[1])
		{
			System.out.println("같은 경우");
		}
		else
		{
			System.out.println(1);
		}
		int idx = 0;
		int max = -1;
		for (i = 0; i < 10; i++)
		{
			if (num[i]  > max)
			{
				max = num[i]; //1>-1 만족하면 max = 1
				idx = i; //max를 갱신하면 첨자를 백업해두자.
			}
			else
			{
				//max의 갑이 최대값이 맞아서 max의 값을 갱신하지 않음.
				//-1>-2
			}
			
		}
		System.out.println("["+i+"], "+max);
		int a = 10;
		int b = 15;
		int max2 = -1;
		
		if (a > max2)
		{
			max2 = a;
		}
		if (b > max2)
		{
			max2 = b;
		}
		int[] num3 = new int[] {5, 8, 2};
		int max3 = num3[0];
		for (i = 0; i < 3; i++)
		{
			if (num3[i] > max3) //max인줄 알았는데 배열안에 값이 더 큼
			{
				max3 = num3[i];//배열의 값을 max의 값으로 가져간다.
			}
			else 
			{
				//num3[i]가 max보다 작아서 max는 이름처럼 큰 값을 갖고 있으므로 아무것도 안한다.
			}
		}*/
		int[] num = new int[] {15, 8, 26};
		//가장 큰 값을 출력하시오.
		int max = num[0];
		for (i = 0; i < 3; i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
			else
			{
				
			}
		}
		System.out.println("max = "+max);
		int min = num[0];
		for (i = 0; i < 3; i++)
		{
			if (num[i] < min)
			{
				min = num[i];
			}
			else {
				
			}
		}
		System.out.println("min = "+min);
	}

}
