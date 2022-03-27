
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = new int[] {10, 11, 25, 38, 39, 44, 50, 90, 99, 100};
		int i = 0, j = 0; 
		for (i = 0; i < 10; i++)
		{
			if (b[i] == 100)
			{
				j = i;
			}
		}
		System.out.println("index = "+j);
		
		System.out.println();
		
//		String[] C = new String[] {"싸이", "트와이스", "소녀시대", "BTS", "아이유", "브레이브걸스", "로제", "에이핑크", "저스틴비버"};
//		System.out.println(C[j]);
	}

}
