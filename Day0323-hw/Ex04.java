
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 1;
		int[] num = new int[5];
		for (i = 0; i < 5; i++)
		{
			num[i] = j;
			while (i < 5)
			{
				j = j * 10;
				break;
			}
			//num[i] = (int) Math.pow(10, j);
		}
		System.out.println("num[1] = "+num[1]);
		System.out.println("num[2] = "+num[2]);
		System.out.println("num[3] = "+num[3]);
		System.out.println("num[4] = "+num[4]);
		
		int[] numb = new int[6];
		int a = 0;
		for (i = 0; i < 6; i++)
		{
			numb[i] = 1;
			System.out.println("numb[" + i +"] = "+ numb[i]);
		}
		int[] number = new int[6];
		for (i = 0; i < 6; i++)
		{
			a++;
			number[i] = a;
			System.out.println("number["+i+"] = "+number[i]);
		}
	}

}
