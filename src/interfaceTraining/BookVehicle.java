package interfaceTraining;

public class BookVehicle {

	public void bookvehicle(Uber u) // u is interface type
	{
		System.out.println("Your Price ="+ u.price());
		System.out.println("Your Vehicle ="+ u.vehicleType());
	}

}
