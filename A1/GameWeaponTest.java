public class GameWeaponTest {
	GameWeapon gameWeaponTest=new GameWeapon("Test Weapon",100);

	public void getWeaponNameTest() {
		if(gameWeaponTest.getWeaponName().equals("Test Weapon")) {
			System.out.println("getWeaponNameTest-PASS");
		}
		else {
			System.out.println("getWeaponNameTest-FAIL");
		}
	}
	public void setWeaponNameTest() {
		gameWeaponTest.setWeaponName("New Test Weapon");
		if(gameWeaponTest.getWeaponName().equals("New Test Weapon")) {
			System.out.println("setWeaponNameTest-PASS");
		}
		else {
			System.out.println("setWeaponNameTest-FAIL");
		}
	}
	public void getWeaponValueTest() {
		if(gameWeaponTest.getWeaponValue()==100) {
			System.out.println("getWeaponValueTest-PASS");
		}
		else {
			System.out.println("getWeaponValueTest-FAIL");
		}
	}
	public void setWeaponValueTest() {
		gameWeaponTest.setWeaponValue(0);
		if(gameWeaponTest.getWeaponValue()==0) {
			System.out.println("setWeaponValueTest-PASS");
		}
		else {
			System.out.println("setWeaponValueTest-FAIL");
		}
	}

}
