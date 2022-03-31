
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int won = 2680;
		int[] unit = {500, 100, 50, 10};
		int[] num = new int[4];
		for (int i = 0; i < 4; i++)
		{
			num[i] = won/unit[i];
			won = won%unit[i];
			System.out.println(unit[i]+"동전의 갯수는"+num[i]);
		}
	}

}
