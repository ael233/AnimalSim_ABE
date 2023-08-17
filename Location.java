public class Location {

	private int xCoord;
	private int yCoord;
	
	public Location() {
		xCoord = 0;
		yCoord = 0;
	}//end empty-argument constructor
	
	public Location(int x, int y){ 
		if(x < 0 || y < 0) {
			throw new InvalidCoordinateException("Coordinates must be positive!");
		}
		xCoord = x;
		yCoord = y;
	}//end preferred constructor
	
	public void update(int x, int y) {
		xCoord = x;
		yCoord = y;
	}//end update
	
	public int[] getCoordinates(){
		return new int[] {xCoord, yCoord};
	}//end getCoordinates
	
	@Override
	public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}//end toString
	
}//end class
