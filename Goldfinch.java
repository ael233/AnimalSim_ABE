public class Goldfinch extends Animal implements Walkable, Flyable{
	
	private double wingSpan;
	
	public Goldfinch() throws InvalidCoordinateException {
		simID = 0;
		location = new Location(0,0);
		setFull(false);
		setRested(true);
		wingSpan = 9.0;		
		
	}//end empty-argument constructor
	
	public Goldfinch(int simID, Location l, double wingSpan) {
		if(wingSpan < 5.0 || wingSpan > 11.0) {
			throw new InvalidWingspanException("Wingspan must be between 5.0 and 11.0 cm!");
		}
		
		this.simID = simID;
		location = l;
		this.wingSpan = wingSpan;		
		
	}//end preferred constructor

	public double getWingSpan() {
		return wingSpan;
	}//end getWingSpan

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}//end setWingSpan	

	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString	

	@Override
	public void walk(int direction) {
		int[] currentCoords = location.getCoordinates();
		int newX = currentCoords[0];
		int newY = currentCoords[1];
			
		if (direction == 0){ //North
			newY += 1;
		}else if(direction == 90){//East
			newX += 1;
		}else if(direction == 180){//South
			newY -= 1;
		}else if(direction == 270){//West
			newX -= 1;
		}
		location.update(newX, newY);
	}//end walk

	@Override
	public void fly(Location l) {
		location = l;
		int[] currentCoords = location.getCoordinates();
	}//end fly
		
}//end class
