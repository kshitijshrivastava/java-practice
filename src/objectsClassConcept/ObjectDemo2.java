package objectsClassConcept;

public class ObjectDemo2 {

	public static void main(String[] args) {
		Car c1= new Car("Honda", "Red", 1500000);
		Car c2= new Car("Honda", "Red", 1500000);
		Car c3= new Car("Maruti", "Black", 450000);
		
		System.out.println(c1.toString()); //Name= Honda Colour= Red Price= 1500000.0
		System.out.println(c2.toString()); //Name= Honda Colour= Red Price= 1500000.0
		System.out.println(c3.toString()); //Name= Maruti Colour= Black Price= 450000.0
		
		System.out.println(c1.equals(c2)); //true
		System.out.println(c1.equals(c3)); //false

	}

}
