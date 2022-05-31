package april2;

public class UseStudent {
	
	public static void main(String[] args) {
		
		Student student1=new Student();
		
		student1.name="DORA";
		student1.id=22;
		student1.rollNo=202203022l;
		student1.marks=450;
		student1.isPass=true;
		
		System.out.println("NAME = "+student1.name+", ID = "+student1.id+", ROLLNO = "+student1.rollNo+", MARKS = "+student1.marks+", ISPASS = "+student1.isPass);
		
		
		Student student2=new Student();
		student2.name="RAM";
		student2.id=24;
		student2.rollNo=202203024l;
		student2.marks=370;
		student2.isPass=(300<=student2.marks);
		
		System.out.println("NAME = "+student2.name+", ID = "+student2.id+", ROLL NO = "+student2.rollNo+", MARKS = "+student2.marks+", ISPASS = "+student2.isPass);
		
		
		Student student3=new Student();
		student3.name="KRISH";
		student3.id=24;
		student3.rollNo=202203021;
		student3.marks=260;
		student3.isPass=false;
		
		System.out.println("NAME = "+student3.name+", ID = "+student3.id+", ROLLNO = "+student3.rollNo+", MARKS = "+student3.marks+", ISPASS = "+student3.isPass);
		
		
		int total=student1.marks+student2.marks+student3.marks;
		System.out.println("TOTAL MARKS OF THREE STUDENTS IS "+total);
		
		int average=total/3;
		System.out.println("AVERAGE MARKS OF THREE STUDENTS IS "+average);
			
		
		
	}

}
