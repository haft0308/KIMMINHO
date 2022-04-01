
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4, b = 6;
		System.out.println(add(a, b));
		print();
		System.out.println(retInt());
		int c = 5;
		noRet(c);
	}
	static int add(int a, int b)
	{
		int c;
		c = a+b;
		return c;
	}


	static void print()
	{
		System.out.println("before return");
	System.out.println("after return");
		return;
	}
	static int retInt()
	{
		int x = 10;
		return x;
	}
	static void noRet(int x)
	{
		System.out.println("x = "+x);
	}
}
