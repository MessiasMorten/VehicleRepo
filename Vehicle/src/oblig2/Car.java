package oblig2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Car extends Vehicle{
	
private static int power;

//Vehicle pt.2
static Calendar productionDate = new GregorianCalendar(2019, 1, 12);

public Car() {
	
}

public Car(String colour, String name, String serialNumber, int model, int price, int direction, int power, Calendar buyingDate){
setColour(colour); setName(name); setSerialNumber(serialNumber); setModel(model); setPrice(price); setDirection(direction); setPower(power);setProductionDate(buyingDate);
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

//Vehicle pt.3
public void accelerate(int speedFactor) {
	if (getSpeed() == 0) {
		double newspeed = 0.5*speedFactor;
		if (newspeed >= Driveable.MAX_SPEED_CAR) {
			setSpeed(250);
		}
		else if (newspeed < Driveable.MAX_SPEED_CAR) {
			setSpeed(newspeed);
		}
	}
	else if (getSpeed() != 0) {
		double newspeed = getSpeed()*speedFactor;
		if (newspeed >= Driveable.MAX_SPEED_CAR) {
			setSpeed(250);
		}
		else if (newspeed < Driveable.MAX_SPEED_CAR) {
			setSpeed(getSpeed()*speedFactor);
		}
	}
	System.out.println("Vehicle accelerated to: " + getSpeed() + " km/h");
}

public void breaks (int speedFactor) {
	setSpeed(getSpeed() / (speedFactor * 0.5));
	System.out.println("Vehicle slowed down to: " + getSpeed() + " km/h");
}

public String toString() {
	return "Name of vehicle: " + getName() + "\nColour: " + getColour() + " SerialNumber: " + getSerialNumber() + " Model: " + getModel() + " Price: "
+ getPrice() + " Direction: " + getDirection() + " Power: " + getPower() + "\n" + "Buying date: " + getBuyingDate() + "\n" ;}

@Override
public int compareTo(Vehicle obj) {
	if (getPrice() > obj.getPrice()) {
		return 1;
	}
	else if (getPrice() < obj.getPrice()) {
		return -1;
	}
	else {
		return 0;
	}
}

}