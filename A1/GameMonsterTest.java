public class GameMonsterTest {
	
	GameMonster gameMonsterTest=new GameMonster("Test Monster",50,10);

	public void getMonsterNameTest() {
		if(gameMonsterTest.getMonsterName().equals("Test Monster")) {
			System.out.println("getMonsterNameTest-PASS");
		}
		else {
			System.out.println("getMonsterNameTest-FAIL");
		}
	}
	public void setMonsterNameTest() {
		gameMonsterTest.setMonsterName("New Test Monster");
		if(gameMonsterTest.getMonsterName().equals("New Test Monster")) {
			System.out.println("setMonsterNameTest-PASS");
		}
		else {
			System.out.println("setMonsterNameTest-FAIL");
		}
	}
	public void getMonsterHpTest() {
		if(gameMonsterTest.getMonsterHp()==50) {
			System.out.println("getMonsterHpTest-PASS");
		}
		else {
			System.out.println("getMonsterHpTest-FAIL");
		}
	}
	public void setMonsterHpTest() {
		gameMonsterTest.setMonsterHp(0);
		if(gameMonsterTest.getMonsterHp()==0) {
			System.out.println("setMonsterHpTest-PASS");
		}
		else {
			System.out.println("setMonsterHpTest-FAIL");
		}
	}
	public void getMonsterAtkTest() {
		if(gameMonsterTest.getMonsterAtk()==10) {
			System.out.println("getMonsterAtkTest-PASS");
		}
		else {
			System.out.println("getMonsterAtkTest-FAIL");
		}
	}
	public void setMonsterAtkTest() {
		gameMonsterTest.setMonsterAtk(0);
		if(gameMonsterTest.getMonsterAtk()==0) {
			System.out.println("setMonsterAtkTest-PASS");
		}
		else {
			System.out.println("setMonsterAtkTest-FAIL");
		}
	}

}
