package oblig2;


/*TestVehicles oppretter Bicycle og Car objekter, legger disse i et ArrayList
 * Lar bruker manipulere data i arrayet på forskjellige måter
 */


import java.util.*;
import java.io.*;

public class VehicleTest {
	
	 public ArrayList<Vehicle> arr=new ArrayList<Vehicle>();

	 public static void main(String[] args) {	  
	   
  VehicleTest vtest = new VehicleTest();
   try {
      vtest.menuLoop();
    } catch(IOException e) {
      System.out.println("IO Exception!");
      System.exit(1);
    } catch(CloneNotSupportedException e) {
      System.out.println("CloneNotSupportedException");
      System.exit(1);
    }
  
  }

  private void menuLoop() throws IOException, CloneNotSupportedException {
    Scanner scan = new Scanner(System.in);

    arr.add(new Car("Black","Volvo","1010-11",2010,85000,163,120));
    arr.add(new Bicycle("Yellow","Scott Spark 290","BC100",2018,38000,10,11));
    arr.add(new Car("Red","Ferrari Testarossa","A112", 1993,1200000,350,340));
    arr.add(new Bicycle("Pink","DBS","F11/42",1994,5000,10,21)); 

    while(true) {
      System.out.println("1...................................New car");
      System.out.println("2...............................New bicycle");
      System.out.println("3......................Find vehicle by name");
      System.out.println("4..............Show data about all vehicles");
      System.out.println("5.......Change direction of a given vehicle");
      System.out.println("6..............................Exit program");
      System.out.println("...............................Your choice?");
      int choice = scan.nextInt();

      switch (choice) {
      case 1:
    	 Vehicle vehicle = new Car();
    	  vehicle.setAllFields();  
    	  arr.add(new Car(vehicle.getColour(), vehicle.getName(),vehicle.getSerialNumber(), vehicle.getModel(), vehicle.getPrice(),Car.getDirection(),Car.getPower()));
    	  
        break;
      case 2:
    	  Vehicle bike = new Bicycle();
    	  bike.setAllFields();  
    	  arr.add(new Bicycle (bike.getColour(), bike.getName(),bike.getSerialNumber(), bike.getModel(), bike.getPrice(),Bicycle.getDirection(),Bicycle.getGears()));
        break;
      case 3:
    	  System.out.println("Input vehicle name: ");
    	  String inputname = scan.next();
    	  
    	  //I concidered using hashmap, but found this to be the simplest solution
    	  Iterator<Vehicle> iter = arr.iterator();
    	  while (iter.hasNext()) {
    		  Vehicle v = iter.next();
    		  if (inputname.equals(v.getName())) {
    			 int resultIndex =  arr.indexOf(v);
    			 System.out.println(arr.get(resultIndex));
    		  }
    	  }
    	  
        break;
      case 4:
    	  
    	  //None of the elements have a specified index, yet this works because a default index is always applied when adding a new element
    	  for (int i = 0; i<arr.size(); i++) {
    		  System.out.println(arr.get(i));
    	  }
        break;
      case 5:
    	  String vDirChange;
    	  int degrees = 0;
        System.out.println("Which vehicle would you like to change direction?");
        vDirChange = scan.next();
        System.out.println("1.................................Left turn");
        System.out.println("2................................Right turn");
        int newchoice = scan.nextInt();

        switch (newchoice) {
        case 1:
        	
        System.out.println("How many degrees would you like the vehicle to turn?");
        degrees = scan.nextInt();
        Iterator<Vehicle> iterr = arr.iterator();
      	while (iterr.hasNext()) {
        Vehicle v = iterr.next();
        if (vDirChange.equals(v.getName())) {
      	v.turnLeft(degrees);
      	int resultIndex =  arr.indexOf(v);
      	System.out.println(arr.get(resultIndex));
      		  }
      	  }	
      	 
      	break;
      	  
        case 2:
        	
        System.out.println("How many degrees would you like the vehicle to turn?");
        degrees = scan.nextInt();
        Iterator<Vehicle> iterrr = arr.iterator();
        while (iterrr.hasNext()) {
        Vehicle v = iterrr.next();
        if (vDirChange.equals(v.getName())) {
        v.turnRight(degrees);
        int resultIndex =  arr.indexOf(v);
        
        arr.set(resultIndex, v);
        System.out.println(arr.get(resultIndex));	

        
          } 
        }
          	
        break;
        }
      case 6:
      	scan.close();
        System.exit(0);
        break;
      default:
        System.out.println("Wrong input!");
      }
    }
  }
}
