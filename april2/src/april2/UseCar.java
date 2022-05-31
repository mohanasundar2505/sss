package april2;

public class UseCar {
	
	public static void main(String []args) {
		
		Car car1=new Car();
		
		car1.brand="AUDI";
		car1.color="BLACK";
		car1.price=300000;
		
		System.out.println("BRAND = "+car1.brand+", COLOR = "+car1.color+", PRICE = "+car1.price);
		
		Car car2=new Car();
		car2.brand="TOYOTO";
		car2.color="RED";
		car2.price=100000;
		
		System.out.println("BRAND = "+car2.brand+", COLOR = "+car2.color+", PRICE = "+car2.price);
		
		
		Car car3=new Car();
		car3.brand="BMW";
		car3.color="BLUE";
		car3.price=200000;
		
		System.out.println("BRAND = "+car3.brand+", COLOR = "+car3.color+", PRICE = "+car3.price);
		
		int total=car1.price+car2.price+car3.price;
		System.out.println("TOTAL PRICE OF CAR IS "+total);
		
		int total1=car1.price-car3.price;
		System.out.println("DIFFERENCE OF AUDI AND BMW IS "+total1);
		
		
		
		

		
		
		
		
		
	}

}
