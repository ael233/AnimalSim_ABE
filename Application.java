import java.util.*;


public class Application {

	public static void main(String[] args) {
		
		
		//*********************************************

	    //Location Tests

	    //*********************************************
		System.out.println("********************");
		System.out.println("Location Tests");
		System.out.println("********************");
		Location testLoc = new Location();
		System.out.println(testLoc.toString());
		Location testLoc2 = new Location(1,4);
		System.out.println("Initial location: " + testLoc2.toString());
		testLoc2.update(2, 2);
		testLoc2.getCoordinates();
		System.out.println("Updated location: " + testLoc2.toString());
		
	      
		//*********************************************

	    //Animal Tests

	    //*********************************************
		System.out.println("********************");
		System.out.println("Animal Tests");
		System.out.println("********************");
	    /*
	     * Cannot instantiate Animal since it is abstract.
	     * Animal testAnimal = new Animal();
	     *^^^ the above code would cause an error prohibiting compilation of code
	     */
	    BrownBear animal1 = new BrownBear(1440,new Location(2,4), "European");
	    System.out.println("Has animal eaten? " + animal1.eat());
		System.out.println("Has animal slept? " + animal1.sleep());
	    System.out.println("Animal simID: " + animal1.getSimID());
	    
	    /*
	     * The below code would throw an InvalidSimIDException:
	     * animal1.setSimID(-1550);
	     */
	    
	    animal1.setSimID(1550);
	    System.out.println("Updated simID: " + animal1.getSimID());
	    System.out.println("Animal location: " + animal1.getLocation());
	    animal1.setLocation(new Location(4,8));
	    System.out.println("Animal updated location: " + animal1.getLocation());
	    animal1.setFull(false);
	    System.out.println("Animal is full? " + animal1.isFull());
	    animal1.setRested(true);
	    System.out.println("Animal is rested? " + animal1.isRested());
	    System.out.println(animal1.toString());
		
		//*********************************************

	    //Goldfinch Tests

	    //*********************************************
		System.out.println("********************");
		System.out.println("Goldfinch Tests");
		System.out.println("********************");
	    Goldfinch goldilox = new Goldfinch(8176, new Location(3,3), 5.6);
		System.out.println(goldilox.toString());
		/*
		 * The below code will throw the InvalidWIngspanException.
		 * Goldfinch wrongBird = new Goldfinch(6000, new Location(8,8), 3.2);
		 */
		goldilox.setWingSpan(9.9);
		System.out.println("Updated goldilox wingspan: " + goldilox.getWingSpan());
		goldilox.walk(90);
		System.out.println("Goldilox has walked to the right! New location: " + goldilox.getLocation());
		goldilox.fly(new Location(9,9));
		System.out.println("Goldilox has flown! New location: " + goldilox.getLocation());
		//*********************************************

	    //BrownBear Tests

	    //*********************************************
		System.out.println("********************");
		System.out.println("BrownBear Tests");
		System.out.println("********************");
		BrownBear winnie = new BrownBear(2234, new Location(7,7), "Grizzly");
		System.out.println(winnie.toString());
		System.out.println(winnie.getSubSpecies());
		
		/*
		 * The below code would throw an InvalidSubspeciesException:
		 * winnie.setSubSpecies("Teddy");
		 */
		winnie.setSubSpecies("Kodiak");
		System.out.println("Winnie's new subspecies is: " + winnie.getSubSpecies());
		
		winnie.walk(0);
		System.out.println("Winnie walked! The bear is now at: " + winnie.location.toString());
		winnie.swim(270);
		System.out.println("Winnie swam to the left! The bear is now at: " + winnie.location.toString());
		
		//*********************************************

	    //Generics Tests
		System.out.println("********************");
		System.out.println("Generics Tests");
		System.out.println("********************");
		
		ArrayList<Animal> zooList = new ArrayList<>();
		zooList.add(new BrownBear());
		zooList.add(new Goldfinch());
		zooList.add(winnie);
		zooList.add(goldilox);
		System.out.println(zooList.toString()); //prints entire ArrayList
		Animal zooAnimal1 = zooList.get(0);
		Animal zooAnimal2 = zooList.get(1);
		Animal zooAnimal3 = zooList.get(2);
		Animal zooAnimal4 = zooList.get(3);
		System.out.println(zooAnimal1.toString());
		System.out.println(zooAnimal2.toString());
		System.out.println(zooAnimal3.toString());
		System.out.println(zooAnimal4.toString());

	    //*********************************************	
	
	
	}

}
