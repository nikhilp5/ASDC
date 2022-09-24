public class GameFloorTest {
	
	GameFloor gameFloorTest=new GameFloor(1,"Test Floor");

	public void getFloorNumberTest() {
		if(gameFloorTest.getFloorNumber()==1) {
			System.out.println("getFloorNumberTest-PASS");
		}
		else {
			System.out.println("getFloorNumberTest-FAIL");
		}
	}

	public void setFloorNumberTest() {
		gameFloorTest.setFloorNumber(2);
		if(gameFloorTest.getFloorNumber()==2) {
			System.out.println("setFloorNumberTest-PASS");
		}
		else {
			System.out.println("setFloorNumberTest-FAIL");
		}
	}

	public void getFloorNameTest() {
		if(gameFloorTest.getFloorName().equals("Test Floor")) {
			System.out.println("getFloorNameTest-PASS");
		}
		else {
			System.out.println("getFloorNameTest-FAIL");
		}
	}

	public void setFloorNameTest() {
		gameFloorTest.setFloorName("New Test Floor");
		if(gameFloorTest.getFloorName().equals("New Test Floor")) {
			System.out.println("setFloorNameTest-PASS");
		}
		else {
			System.out.println("setFloorNameTest-FAIL");
		}
	}
	
}
