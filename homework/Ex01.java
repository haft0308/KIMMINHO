
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, j = 1;
		int[] numbe = new int[6];
		for (i = 0; i < 6; i++)
		{
			numbe[i] = j;
			j = j + 2;
			System.out.println("numbe["+i+"] = "+numbe[i]);
		}
		int[] nu = new int[6];
		int a = 0;
		for (i = 0; i < 6; i++)
		{
			a = a+10;
			nu[i] = a;
			System.out.println("nu["+i+"] = "+nu[i]);
		}
		int[] n = new int[10];
		int b = 0;
		for (i = 0; i < 10; i++)
		{
			b = i*i;
			n[i] = b;
			if(i%2 == 1)
			{
				System.out.println("n["+i+"] = "+n[i]);
			}	
		}
	}

}
