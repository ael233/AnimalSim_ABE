import java.util.*;

public abstract class Animal {
	protected int simID; //should be int > 0, need to catch and handle InvalidSimIDException
	protected Location location; //location object that encapsulates the animal's x and y coords
	protected boolean full; //if animal has eaten
	protected boolean rested;//if animal has slept
	
	public Animal() {
		setSimID(0);
		location = new Location(0,0);
		setFull(false);
		setRested(true);
		
	}//end empty-argument constructor
	
	public Animal(int simID, Location l) {
		setSimID(simID);
		this.location = l;
		setFull(false);
		setRested(true);
	}//end preferred constructor
	
	public boolean eat() {
		double randNum = Math.random();
		if (randNum > 0.50) {
			setFull(true);
		}else {
			setFull(false);
		}
		return full;
	}//end eat
	
	public boolean sleep() {
		double randNum = Math.random();
		if (randNum > 0.50) {
			setRested(true);
		}else {
			setRested(false);
		}
		return rested;
	}//end sleep

	public int getSimID() {
		return simID;
	}//end getSimID

	public void setSimID(int simID) {
		if(simID < 0) {
			throw new InvalidSimIDException("SimID must be greater than zero!");
		}
		this.simID = simID;
	}//end setSimID

	public Location getLocation() {
		return location;
	}//end getLocation

	public void setLocation(Location location) {
		this.location = location;
	}//end setLocation

	public boolean isFull() {
		return full;
	}//end isFull

	public void setFull(boolean full) {
		this.full = full;
	}//end setFull

	public boolean isRested() {
		return rested;
	}//end isRested

	public void setRested(boolean rested) {
		this.rested = rested;
	}//end setRested

	@Override
	public String toString() {
		return "Animal [simID=" + simID + ", location=" + location + ", full=" + full + ", rested=" + rested + "]";
	}
	
	
	
}//end class
