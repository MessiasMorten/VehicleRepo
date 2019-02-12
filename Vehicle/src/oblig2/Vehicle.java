package oblig2;

import java.util.Calendar;
import java.util.Scanner;

public abstract class Vehicle {
	
private String colour;
private String name;
private String serialNumber;

public Calendar getBuyingDate() {
	return buyingDate;
}

public void setBuyingDate(Calendar buyingDate) {
	this.buyingDate = buyingDate;
}
private int model;
private int price;
private static int direction;

private double speed;

//Vehicle pt.2
Calendar buyingDate = Calendar.getInstance();

Scanner input = new Scanner(System.in);

public Vehicle() {
	
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}
 
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSerialNumber() {
	return serialNumber;
}

public void setSerialNumber(String serialNumber) {
	this.serialNumber = serialNumber;
}

public int getModel() {
	return model;
}

public void setModel(int model) {
	this.model = model;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public static int getDirection() {
	return direction;
}

public void setDirection(int direction) {
	Vehicle.direction = direction;
}

public double getSpeed() {
	return speed;
}

public void setSpeed(double speed) {
	this.speed = speed;
}

public Vehicle(String colour, String name, String serialNumber, int model, int price, int direction) {
	this.colour = colour; this.name = name; this.serialNumber = serialNumber; this.model = model; this.price = price; Vehicle.direction = direction;
}


public void setAllFields() {

	System.out.println("Color: ");
	setColour(input.next()); 
	System.out.println("Name: ");
	setName(input.next()); 
	System.out.println("Serial Number: ");
	setSerialNumber(input.next()); 
	System.out.println("Model: ");
	setModel(input.nextInt()); 
	System.out.println("Price: ");
	setPrice(input.nextInt());
	setDirection(0);
	setSpeed(0);
	}

public abstract void turnLeft(int degrees);
public abstract void turnRight(int degrees);

}