package interfaceTraining;

public class UberXL implements Uber {

	@Override
	public int price() {
		
		return 400;
	}

	@Override
	public String vehicleType() {
		
		return "Toyota";
	}

}
