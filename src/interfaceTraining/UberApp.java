package interfaceTraining;

import java.util.Scanner;

public class UberApp {

	public static void main(String[] args) {
		
		for(;;)
		{
			System.out.println(" G. To book UberGo\n X. To book UberXL\n P. To book UberPrime\n");
			System.out.println(" Enter your Choice below: ");
			Scanner sc = new Scanner (System.in);
			char ch = sc.next().charAt(0);
			switch(ch)
			{
				case 'G': BookVehicle b1 = new BookVehicle();
						  b1.bookvehicle(new UberGo());
						  break;
				case 'X': BookVehicle b2 = new BookVehicle();
						  UberXL uXL = new UberXL();
						  b2.bookvehicle(uXL);
						  break;
				case 'P': BookVehicle b3 = new BookVehicle();
		          		  //Prime p = new Prime();
		          		  b3.bookvehicle(new Prime());
		          		  break;
		        default : System.out.println("Invalid choice");
		                  //System.exit(0);
		                  break;
		        
				
			}
			
		}
		
	}

}
