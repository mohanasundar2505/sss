package april2;

public class UseFan {

	public static void main(String[] args) {
		
		Fan fan1=new Fan();
		
		fan1.brand="USHA";
		fan1.color="RED";
		fan1.price=2200;
		fan1.discount=200;
		fan1.noOfWings=3;
		fan1.isThreeWings=(fan1.noOfWings==3);
		fan1.netPrice=(fan1.price-fan1.discount);
		
		System.out.println("BRAND = "+fan1.brand+" COLOR = "+fan1.color+" PRICE = "+fan1.price+" NO OF WINGS = "+fan1.noOfWings+" ISTHREEWING = "+fan1.isThreeWings+" NETPRICE = "+fan1.netPrice);
		
		Fan fan2=new Fan();
		
		fan2.brand="ORIENT";
		fan2.color="BLUE";
		fan2.price=5500;
		fan2.discount=250;
		fan2.noOfWings=4;
		fan2.isThreeWings=(fan2.noOfWings==3);
		fan2.netPrice=(fan2.price-fan2.discount);
		
		System.out.println("BRAND = "+fan2.brand+"  COLOR = "+fan2.color+" PRICE = "+fan2.price+" NO OF WINGS = "+fan2.noOfWings+" ISTHREEWING = "+fan2.isThreeWings+" NETPRICE = "+fan2.netPrice);
	
		
	Fan fan3=new Fan();
	
	fan3.brand="BAJAJ";
	fan3.color="BLUE";
	fan3.price=4500;
	fan3.discount=250;
	fan3.noOfWings=3;
	fan3.isThreeWings=(fan3.noOfWings==3);
	fan3.netPrice=(fan3.price-fan3.discount);
	
	
	
System.out.println("BRAND = "+fan3.brand+" COLOR = "+fan3.color+" PRICE = "+fan3.price+" NO OF WINGS = "+fan3.noOfWings+" ISTHREEWING = "+fan3.isThreeWings+" NETPRICE = "+fan3.netPrice);
	
	
	
	int add=fan1.price+fan2.price+fan3.price;
	int addNetPrice=fan1.netPrice+fan2.netPrice+fan3.netPrice;
	
	int subUshaOrient=fan2.price-fan1.price;
	int subOrientBajaj=fan2.price-fan3.price;
	int subBajajUsha=fan3.price-fan1.price;
	
	
	System.out.println("THE DIFFERENCE OF AMOUNT BETWEEN USHA AND ORIENT IS "+subUshaOrient);
	System.out.println("THE DIFFERENCE OF AMOUNT BETWEEN ORIENT AND BAJAJ IS "+subOrientBajaj);
	System.out.println("THE DIFFERENCE OF AMOUNT BETWEEN USHA AND BAJAJ IS "+subBajajUsha);
	
	
	System.out.println("THE DIFFERENCE OF AMOUNT BETWEEN "+fan1.brand+" AND "+fan3.brand+" is "+subBajajUsha);
	
	
	
	
	
	
	
	}
}
