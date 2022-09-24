public class GameFloor {
	
	private int floorNumber;
	private String floorName;

	public GameFloor(int floorNumber,String floorName) {
		super();
		this.floorNumber = floorNumber;
		this.floorName = floorName;
	}

	public GameFloor() {
		super();
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public String getFloorName() {
		return floorName;
	}

	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}
	
}
