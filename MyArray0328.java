
public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int[][] stu;
		stu = new int[2][];
		stu[0] = new int[3];
		stu[1] = new int[2];       */
		
//		int[][] stu = new int[2][3];
//		
//		stu[0][0] = 100;
//		stu[0][1] = 50;
//		stu[0][2] = 20;
		
		int[][] stu = {
				{100, 50, 20}, //행
				{10, 40, 80}   //열
		};
		stu[1][1] = 90;
		//키, 신발사이즈, 형제수
//		int[] a = new int[10];
//		a[9] = 10;
		int[][] a = new int[10][3];
		int num = 0;
		for (int i = 0; i < 10; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					a[i][j] = num;
					num++;
				}	
			}
//		char[][] fruit = {
//				{'a', 'p', 'p', 'l', 'e'},
//				{'l', 'e', 'm', 'o', 'n'}
//		};

		String s = "apple";
		String l = "lemon";
		char[][] fruit = new char[2][5];
		for (int i = 0; i < 5; i++)
		{
			fruit[0][i] = s.charAt(i);
			fruit[1][i] = l.charAt(i);
		}
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				System.out.println("fruit ["+i+"]["+j+"] = "+fruit[i][j]);
			}
		}
		int[][] gu = new int[8][9];
		int val = 0, num1 = 2, num2 = 1;
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				val = num1*num2;
				gu[i][j] = val;
				System.out.print(num1+"*"+num2+"="+gu[i][j]+"\t");
				num2++;
			}
			num1++;
			num2 = 1;
			System.out.println();
		}
		int[][] score = new int[5][3];
		//가변배열
		int[][] matrix = new int[3][];
		matrix[0] = new int[4];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[0][3] = 4;
		
		matrix[1] = new int[2];
		matrix[1][0] = 5;
		matrix[1][1] = 6;
		
		matrix[2] = new int[3];
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
