package buy;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer(); //Buyer타읩의 b변수에 Buyer의 메모리 할당
		
		Product[] p = new Product[3]; //Product타입의 index3을 가진 배열 생성
		p[0] = new TV(); //Product타입의 p배열 0번에 TV의 메모리 할당 업캐스팅
		p[1] = new Computer(); //Product타입의 p배열 1번에 Computer의 메모리할당 업캐스팅
		p[2] = new Audio(); //Product타입의 p배열 2번에 Audio의 메모리할당 업캐스팅
		
		for (int i = 0; i < 3; i++) 
		{
			b.buy(p[i]);   //p배열에 할당되어있는 각각의 price와 bonuspoint를 						   
		}				   //Buyer의 money와 bonuspoint에서 차감시킨다.
		b.print(); //Buyer의 money와 bonuspoint를 출력시키는 메소드 호출
	}

}
class Product
{
	int price;      //멤버변수 선언
	int bonusPoint; //멤버변수 선언
}

class TV extends Product  //class Product를 상속받는 class TV선언
{
	int channel; //자식 class Tv의 고유 멤버변수 선언
	int volume;  // 위와 동일
	TV()   //class TV의 생성자
	{
		price = 100;  //부모클래스 Product의 변수의 초기화 및 값 할당
		bonusPoint = 100;  //동일
	}
}
class Computer extends Product  //class Product를 상속받는 class Computer선언
{
	int cpu;  //자식 class Computer의 고유 멤버변수 선언
	int ram;  //위와 동일
	Computer() //class Computer의 생성자  
	{
		price = 200; //부모클래스 Product의 변수의 초기화 및 값 할당
		bonusPoint = 200; //동일
	}
}
class Audio extends Product  //class Product를 상속받는 class Audio선언
{
	int volume;  //class Audio의 고유 멤버변수 선언
	int speaker; //동일
	Audio()     //class Audio의 생성자
	{
		price = 50;  //부모클래스 Product의 변수 초기화 및 값 할당
		bonusPoint = 50;
	}
}
class Buyer  //Buyer 클래스 정의
{
	int money = 10000;  //고유 멤버변수 선언 및 값 할당
	int bonusPoint = 0; //동일
	
	void buy(Product p) //return값이 없고 Product타입의 p파라미터를 가진 buy메소드
	{
		money = money - p.price; //money에서 Product클래스의 price변수를 빼는 누적변수
		bonusPoint = bonusPoint + p.bonusPoint; //bonuspoint에서 Product클래스의 bonuspoint변수를 빼는 누적변수
	}
	
	void print() // money외 bonuspoint의 값을 출력해주는 메소드
	{
		System.out.println("money = "+ money);
		System.out.println("bonusPoint = "+ bonusPoint);
	}
}