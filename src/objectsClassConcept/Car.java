package objectsClassConcept;

public class Car {
	
	private String name;
	private String colour;
	private double price;
	
	public Car(String name,String colour,double price )
	{
		this.name=name;
		this.colour=colour;
		this.price=price;
	}
	
	public String toString()
	{
		return "Name= "+this.name+" Colour= "+this.colour+" Price= "+this.price;
	}
	public int hashCode()
	{
		return 100;
	}
	public boolean equals(Object obj)
	{
		Car c = (Car) obj; // downcasting ->> First upcasting ---> Obj obj = new Car("Honda","Red","1500000") 
		return (this.name==c.name &&
				this.colour==c.colour&&
				this.price==c.price);
	}

}
