public class GamePlayerTest {
	
	GamePlayer gamePlayerTest=new GamePlayer("Test Player", 100);
	
	public void getPlayerNameTest() {
		if(gamePlayerTest.getPlayerName().equals("Test Player")) {
			System.out.println("getPlayerNameTest-PASS");
		}
		else {
			System.out.println("getPlayerNameTest-FAIL");
		}
	}
	
	public void setPlayerNameTest() {
		gamePlayerTest.setPlayerName("New Test Player");
		if(gamePlayerTest.getPlayerName().equals("New Test Player")) {
			System.out.println("setPlayerNameTest-PASS");
		}
		else {
			System.out.println("setPlayerNameTest-FAIL");
		}
	}
	
	public void getPlayerHpTest() {
		if(gamePlayerTest.getPlayerHp()==100) {
			System.out.println("getPlayerHpTest-PASS");
		}
		else {
			System.out.println("getPlayerHpTest-FAIL");
		}
	}
	
	public void setPlayerHpTest() {
		gamePlayerTest.setPlayerHp(0);
		if(gamePlayerTest.getPlayerHp()==0) {
			System.out.println("setPlayerHpTest-PASS");
		}
		else {
			System.out.println("setPlayerHpTest-FAIL");
		}

	}
	
}
