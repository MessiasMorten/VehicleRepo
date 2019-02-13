package oblig2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Car extends Vehicle{
	
private static int power;

//Vehicle pt.2
static Calendar productionDate = new GregorianCalendar(2019, 1, 12);

public Car() {
	
}

public Car(String colour, String name, String serialNumber, int model, int price, int direction, int power, Calendar productionDate){
setColour(colour); setName(name); setSerialNumber(serialNumber); setModel(model); setPrice(price); setDirection(direction); setPower(power);setProductionDate(productionDate);
}


public void setAllFields() {
	super.setAllFields();
	System.out.println("Power: ");
	power = (input.nextInt()); 
}

public static int getPower() {
	return power;
}



public void setProductionDate(Calendar productionDate) {
	Car.productionDate = productionDate;
}

public static String getProductionDate() {
return String.format("%tF", productionDate);
}

public void setPower(int power) {
	Car.power = power;
}

public void turnRight(int degrees) {
	if (getDirection() >0 && getDirection() < 360) {
		//Do nothing
	}
	else {
		setDirection(getDirection() + degrees);
		if (getDirection() >= 360) {
			setDirection(getDirection() - 360);
		}
	}
}

public void turnLeft(int degrees) {
	if (getDirection() >0 && getDirection() < 360) {
		//Do nothing
	}
	else {
		setDirection(getDirection() - degrees);
		if (getDirection() >= 360) {
			setDirection(getDirection() - 360);
		}
	}
}

public String toString() {
	return "Name of vehicle: " + getName() + "\nColour: " + getColour() + " SerialNumber: " + getSerialNumber() + " Model: " + getModel() + " Price: "
+ getPrice() + " Direction: " + getDirection() + " Power: " + getPower() + "\n" + "Buying date: " + getBuyingDate() + "\n" ;}

@Override
public int compareTo(Vehicle arg0) {


	
	return 0;
}

}