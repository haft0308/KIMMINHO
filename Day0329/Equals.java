import java.lang.reflect.Method;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Minho";
		if (name.equals("Minho"))
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("wrong");
		}
		String[] arr = {"aaa", "bbb", "ccc", "ddd", "eee"};
		boolean flag = false;
		String str = "ccc";
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i].equals(str))
			{
				System.out.println((i+1)+"번째 요소"+arr[i]);
				flag = true;
			}
			if (flag == false)
			{
				System.out.println("검색값이 없음");
			}
		}
	}
	static int add(int a, int b, int d)
	{
		int c = a + b + d;
		return c;
	}
	float sub(float a)
	{
		return a;
	}
	public static void main() 
	{
		
	}
}
