package oblig2;

import java.util.Calendar;

public class Bicycle extends Vehicle {

	private static int gears;
	
	//Vehicle pt.2
	Calendar productionDate = Calendar.getInstance();
	
	
public Bicycle() {
	
}

public Bicycle(String colour, String name, String serialNumber, int model, int price, int direction, int gears) {
	
	setColour(colour); setName(name); setSerialNumber(serialNumber); setModel(model); setPrice(price); setDirection(direction); setGears(gears);

}
	
	
public Calendar getProductionDate() {
	return productionDate;
}

public void setProductionDate(Calendar productionDate) {
	this.productionDate = productionDate;
}

@Override
public void setAllFields() {
	super.setAllFields();
	System.out.println("Gears: ");
	gears = (input.nextInt()); 
}	
	
	

	public static int getGears() {
	return gears;
}

public void setGears(int gears) {
	Bicycle.gears = gears;
}

	@Override
	public void turnLeft(int degrees) {
		setDirection(degrees);
		System.out.println("The bike was turned " + degrees + " to the left.");
		
	}

	@Override
	public void turnRight(int degrees) {
		setDirection(degrees);
		System.out.println("The bike was turned " + degrees + " to the right.");
		
	}

	public String toString() {
		return "Name of vehicle: " + getName() + "\nColour: " + getColour() + " SerialNumber: " + getSerialNumber() + " Model: " + getModel() + " Price: "
	+ getPrice() + " Direction: " + getDirection() + " Gears: " + getGears() + "\n" ;}
	
}
