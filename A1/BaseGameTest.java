import java.util.HashMap;

public class BaseGameTest {

	BaseGame testGame=new BaseGame();

	public void initiailizePlayerTest() {
		GamePlayer player=new GamePlayer("BeforeInitialize",0);
		testGame.initiailizePlayer(player, "TestSubject");
		if(player.getPlayerHp()==100 && player.getPlayerName().equals("TestSubject")) {
			System.out.println("initiailizePlayerTest-PASS");
		}
		else {
			System.out.println("initiailizePlayerTest-FAIL");
		}
	}

	public void initiailizeMonsterTest() {
		HashMap<String,String> monsterData=new HashMap<String,String>();
		monsterData.put("10", "TestMonster");
		GameMonster monsterSet=new GameMonster();
		testGame.initiailizeMonster(monsterData,monsterSet);
		if(monsterSet.getMonsterHp()==100 && monsterSet.getMonsterAtk()==10 && monsterSet.getMonsterName().equals(monsterData.get("10"))) {
			System.out.println("initiailizeMonsterTest-PASS");
		}
		else {
			System.out.println("initiailizeMonsterTest-FAIL");
		}
	}

	public void initiailizeFloorTest() {
		HashMap<String,String> floorData=new HashMap<String,String>();
		floorData.put("1", "Test Floor");
		GameFloor floorSet=new GameFloor();
		testGame.initiailizeFloor(floorData, floorSet);
		if(floorSet.getFloorName().equals("Test Floor") && floorSet.getFloorNumber()==1) {
			System.out.println("initiailizeFloorTest-PASS");
		}
		else {
			System.out.println("initiailizeFloorTest-FAIL");
		}
	}

	public void initiailizeWeaponTest() {
		HashMap<String,String> weaponData=new HashMap<String,String>();
		weaponData.put("10", "TestWeapon");
		GameWeapon weapon=new GameWeapon();
		testGame.initiailizeWeapon(weaponData, weapon);
		if(weapon.getWeaponName().equals("TestWeapon") && weapon.getWeaponValue()==10) {
			System.out.println("initiailizeWeaponTest-PASS");
		}
		else {
			System.out.println("initiailizeWeaponTest-FAIL");
		}

	}

	public void initiateFightTest() {
		GamePlayer testPlayer=new GamePlayer("TestPlayer",100);
		GameMonster testMonster=new GameMonster("TestMonster",100,100);
		GameFloor testFloor=new GameFloor(1,"TestFloor");
		GameWeapon weapon=new GameWeapon("TestWeapon",100);
		testGame.initiateFight(testPlayer, testMonster, testFloor, weapon);
		System.out.println("initiateFightTest-PASS");
	}

	public void attackAndProgressTest() {
		GamePlayer player=new GamePlayer("TestPlayer",50);
		GameMonster monster=new GameMonster("TestMonster",50,10);
		GameFloor floor=new GameFloor(2,"TestFloor");
		GameWeapon weapon=new GameWeapon("TestWeapon",10);
		HashMap<String,String> floorData=new HashMap<String,String>();
		HashMap<String,String> monsterData=new HashMap<String,String>();
		HashMap<String,String> weaponData=new HashMap<String,String>();
		floorData.put("3", "3 TestFloor");
		monsterData.put("20", "20TestMonster");
		weaponData.put("20", "20TestWeapon");
		testGame.attackAndProgress(player, monster, floor, weapon, floorData, monsterData, weaponData);
		if(player.getPlayerHp()==40 && monster.getMonsterHp()==40) {
			monster.setMonsterHp(10);
			testGame.attackAndProgress(player, monster, floor, weapon, floorData, monsterData, weaponData);
			if(floor.getFloorNumber()==3 && floor.getFloorName().equals("3 TestFloor")
					&& monster.getMonsterAtk()==20 && monster.getMonsterName().equals("20TestMonster")
					&& weapon.getWeaponValue()==20 && weapon.getWeaponName().equals("20TestWeapon")
					&& player.getPlayerHp()==100) {
				System.out.println("attackAndProgressTest-PASS");
			}
			else {
				System.out.println("attackAndProgressTest-FAIL");
			}
		}
		else {
			System.out.println("attackAndProgressTest-FAIL");
		}
	}

	public void healPlayerTest() {
		GamePlayer player=new GamePlayer();
		player.setPlayerHp(0);
		testGame.healPlayer(player);
		if(player.getPlayerHp()==100) {
			System.out.println("healPlayerTest-PASS");
		}
		else {
			System.out.println("healPlayerTest-FAIL");
		}
	}

	public void upgradeFloorTest() {
		HashMap<String,String> floorData=new HashMap<String,String>();
		floorData.put("2", "Test Floor");
		GameFloor floorSet=new GameFloor();
		floorSet.setFloorNumber(1);
		testGame.upgradeFloor(floorData,floorSet);
		if(floorSet.getFloorName().equals("Test Floor") && floorSet.getFloorNumber()==2) {
			System.out.println("upgradeFloorTest-PASS");
		}
		else {
			System.out.println("upgradeFloorTest-FAIL");
		}
	}

	public void upgradeWeaponTest() {
		HashMap<String,String> weaponData=new HashMap<String,String>();
		weaponData.put("20", "Test Weapon");
		GameWeapon weapon=new GameWeapon();
		weapon.setWeaponValue(10);
		testGame.upgradeWeapon(weaponData, weapon);
		if(weapon.getWeaponName().equals("Test Weapon") && weapon.getWeaponValue()==20) {
			System.out.println("upgradeWeaponTest-PASS");
		}
		else {
			System.out.println("upgradeWeaponTest-FAIL");
		}

	}

	public void upgradeMonsterTest() {
		HashMap<String,String> monsterData=new HashMap<String,String>();
		monsterData.put("20", "Test Monster");
		GameMonster monsterSet=new GameMonster();
		monsterSet.setMonsterAtk(10);
		testGame.upgradeMonster(monsterData, monsterSet);
		if(monsterSet.getMonsterName().equals("Test Monster") && monsterSet.getMonsterAtk()==20) {
			System.out.println("upgradeMonsterTest-PASS");
		}
		else {
			System.out.println("upgradeMonsterTest-FAIL");
		}

	}

	public void gameWinTest() {
		testGame.gameWin();
		System.out.println("gameWinTest-PASS");
	}

	public void deadTest() {
		testGame.dead();
		System.out.println("deadTest-PASS");
	}

	public void runAwayTest() {
		testGame.runAway();
		System.out.println("runAwayTest-PASS");
	}

}
