package april2;

public class UseMarker {

	public static void main(String[] args) {
		
		Marker m1=new Marker();
		
		m1.brand="Reynolds";
		m1.color="Blue";
		m1.price=25;
		m1.isWaterProof=true;
		
		System.out.println(m1.brand+" "+m1.color+" "+m1.price+" "+m1.isWaterProof);
		
		
		Marker m2=new Marker();
		
		m2.brand="Rorito";
		m2.color="Black";
		m2.price=50;
		m2.isWaterProof=true;
		
		
		System.out.println(m2.brand+" "+m2.color+" "+m2.price+" "+m2.isWaterProof);
		
		Marker m3=new Marker();
		m3.brand="camel";
		m3.color="Red";
		m3.price=50;
		m3.isWaterProof=true;
		
		
		System.out.println(m3.brand+" "+m3.color+" "+m3.price+" "+m3.isWaterProof);
		
		
		
		
	}
}
