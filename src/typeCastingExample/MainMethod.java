package typeCastingExample;

public class MainMethod {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		System.out.println("Parent class ref referring parent class object");
		System.out.println(p1.a);
		p1.m1();
		
		System.out.println("Child class ref referring parent and child objects");
		System.out.println(c1.a);
		c1.m1(); //static/compile time polymorphism
		c1.m2();
		System.out.println(c1.b);
		
		Parent p2 = new Child(); // dynamic or run time polymorphism // upcasting
		System.out.println("Parent class ref referring child object");
		System.out.println(p2.a);
		//System.out.println(p2.b);  -- Not allowed to access methods of child class which are not overridden
		p2.m1(); // will call overridden m1 method
		
		//Child c2 = (Child) new Parent(); // will not give compile time error. will give run time error ClassCastException
		System.out.println("Child ref referring to upcasted parent ref");
		Child c2 = (Child) p2; // downcasting on an upcasted reference i.e p2
		System.out.println(c2.a);
		System.out.println(c2.b);
		c2.m1();
		c2.m2();
		c2.a = 45;
		p2.a = 95;
		System.out.println(c2.a);
		System.out.println(p1.a);
		System.out.println(p2.a);
		p1.a=55;
		System.out.println("********changing p1.a ********");
		System.out.println(c2.a);
		System.out.println(p1.a);
		System.out.println(p2.a);
		

	}

}
