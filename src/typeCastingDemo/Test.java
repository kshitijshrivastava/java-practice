package typeCastingDemo;

class Test1 {
	int x = 10;

}

class Demo{
	public void m1()
	{
		Test1 t = new Test1();
		System.out.println("first value of t.x = " +t.x);
		m2(t);
		System.out.println("Value of t.x after m2 = "+t.x);
	}
	public void m2(Test1 y)
	{
		System.out.println("Value of x inside m2 function = "+y.x);
		y.x=100;
	}
}

class Test
{
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Test1 t1 = new Test1();
		d1.m1();
		System.out.println("value of x after Demo = " +t1.x);
	}
}
