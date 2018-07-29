package SiemensInterview;

import java.io.IOException;

public class ExceptionsDemo {
	

	public static void main(String[] args) {
	m1();

	}
	
	public static void m1()
	{
		m2();
	}
	public static void m2()
	{
		new IOException("can not open connection");
	}

}
