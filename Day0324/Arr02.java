
public class Arr02 {

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
			System.out.println("���� ���");
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
				max = num[i]; //1>-1 �����ϸ� max = 1
				idx = i; //max�� �����ϸ� ÷�ڸ� ����ص���.
			}
			else
			{
				//max�� ���� �ִ밪�� �¾Ƽ� max�� ���� �������� ����.
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
			if (num3[i] > max3) //max���� �˾Ҵµ� �迭�ȿ� ���� �� ŭ
			{
				max3 = num3[i];//�迭�� ���� max�� ������ ��������.
			}
			else 
			{
				//num3[i]�� max���� �۾Ƽ� max�� �̸�ó�� ū ���� ���� �����Ƿ� �ƹ��͵� ���Ѵ�.
			}
		}*/
		int[] num = new int[] {15, 8, 26};
		//���� ū ���� ����Ͻÿ�.
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
