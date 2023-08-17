public class BrownBear extends Animal implements Walkable, Swimmable{
	
	private enum SubSpecies{
		Alaskan,
		Asiatic,
		European,
		Grizzly,
		Kodiak,
		Siberian
	}
	
	private SubSpecies subSpecies;
	
	public BrownBear() {
		setSimID(0);
		location = new Location(0,0);
		setFull(false);
		setRested(true);
		setSubSpecies("Alaskan");
	}//end empty-argument constructor
	
	public BrownBear(int simID, Location l, String subSpecies) {
		try {
			SubSpecies validSubSpecies = SubSpecies.valueOf(subSpecies);
		}catch(IllegalArgumentException e) {
			throw new InvalidSubspeciesException("Invalid bear type!");
		}
		setSimID(simID);
		location = l;
		setSubSpecies(subSpecies);
		setFull(false);
		setRested(true);
	}//end preferred constructor

	public SubSpecies getSubSpecies() {
		return subSpecies;
	}//end getSubSpecies

	public void setSubSpecies(String subSpecies) throws InvalidSubspeciesException{
		try {
			SubSpecies validSubSpecies = SubSpecies.valueOf(subSpecies);
			this.subSpecies = validSubSpecies;
		}catch (IllegalArgumentException e) {
			throw new InvalidSubspeciesException("Invalid bear type!");
		}
		
	}//end setSubSpecies

	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString
	
	@Override
	public void walk(int direction) {
		int[] currentCoords = location.getCoordinates();
		int newX = currentCoords[0];
		int newY = currentCoords[1];
		
		if (direction == 0){ //North
			newY += 3;
		}else if(direction == 90){//East
			newX += 3;
		}else if(direction == 180){//South
			newY -= 3;
		}else if(direction == 270){//West
			newX -= 3;
		}
		location.update(newX, newY);
	}

	@Override
	public void swim(int direction) {
		int[] currentCoords = location.getCoordinates();
		int newX = currentCoords[0];
		int newY = currentCoords[1];
		
		if (direction == 0) { //North
			newY += 2;
		}else if(direction == 90){//East
			newX += 2;
		}else if(direction == 180){//South
			newY -= 2;
		}else if(direction == 270){//West
			newX -= 2;
		}
		location.update(newX, newY);
	}//end swim	
	
}//end class




