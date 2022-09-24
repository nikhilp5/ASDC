import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		try {
			if(args.length>0 && args[0].equalsIgnoreCase("test")) {
				runTests();
			}else {
				Scanner sc=new Scanner(System.in);
				DbDetails dbMock=new DbMock();
				GamePlayer player=new GamePlayer();
				GameMonster monster=new GameMonster();
				GameFloor floor=new GameFloor();
				GameWeapon weapon=new GameWeapon();
				HashMap<String,String> floorData=dbMock.retrieveDataFromDb("floor");
				HashMap<String,String> monsterData=dbMock.retrieveDataFromDb("monster");
				HashMap<String,String> weaponData=dbMock.retrieveDataFromDb("weapon");
				String choice;
				boolean floorLoop=true;
				BaseGame towerGame=new BaseGame();
				System.out.println("--------------------------------------------------");
				System.out.println("Welcome to the Tower,Knight.May i know your name?");
				towerGame.initiailizePlayer(player,sc.nextLine());
				System.out.println("--------------------------------------------------");
				System.out.println("Hello "+player.getPlayerName()+"!\nYour mission is to rescue princess from top of the tower by defeating monsters on all of the floors.");
				boolean choiceLoop=true;
				while(choiceLoop) {
					System.out.println("Are you sure you want to take this mission? \n 1.Yes \n 2.Seems like you don't have any other choice");
					choice=sc.nextLine();
					System.out.println("--------------------------------------------------");
					if(choice.equals("1")) {
						choiceLoop=false;
					}
				}
				towerGame.initiailizeFloor(floorData,floor);
				towerGame.initiailizeMonster(monsterData,monster);
				towerGame.initiailizeWeapon(weaponData,weapon);
				System.out.println("--------------------------------------------------");
				System.out.println("Everytime you defeat a monster on the floor you progress to next floor,you heal yourself and gain a new weapon to counter the next floor boss");
				System.out.println("Make sure you don't DIE/RUN because there is no saving in this game amd the game ends ;-)");
				System.out.println("--------------------------------------------------");
				choiceLoop=true;
				towerGame.initiateFight(player, monster, floor, weapon);
				floorLoop=true;
				while(floorLoop) {
					System.out.println("--------------------------------------------------");
					System.out.println("1: Attack");
					System.out.println("2: Run");
					System.out.println("--------------------------------------------------");
					choice=sc.nextLine();
					switch(choice) {
					case "1":
						towerGame.attackAndProgress(player, monster, floor, weapon,floorData,monsterData,weaponData);
						if(monster.getMonsterHp()<1 && floor.getFloorNumber()==5) {
							floorLoop=false;
						}
						break;
					case "2":
						towerGame.runAway();
						floorLoop=false;
						break;
					default:
						System.out.println("Enter a valid option");
						break;
					}
				}
			}
		}
		catch(Exception e) {
			System.out.println("Exception in Main");
		}
	}

	public static void runTests() {
		BaseGameTest baseGameTest=new BaseGameTest();
		DbMockTest dbMockTest=new DbMockTest();
		GameFloorTest gameFloorTest=new GameFloorTest();
		GameMonsterTest gameMonsterTest=new GameMonsterTest();
		GamePlayerTest gamePlayerTest=new GamePlayerTest();
		GameWeaponTest gameWeaponTest=new GameWeaponTest();
		baseGameTest.initiailizePlayerTest();
		baseGameTest.initiailizeMonsterTest();
		baseGameTest.initiailizeFloorTest();
		baseGameTest.initiailizeWeaponTest();
		baseGameTest.initiateFightTest();
		baseGameTest.attackAndProgressTest();
		baseGameTest.healPlayerTest();
		baseGameTest.upgradeFloorTest();
		baseGameTest.upgradeWeaponTest();
		baseGameTest.upgradeMonsterTest();
		baseGameTest.gameWinTest();
		baseGameTest.deadTest();
		baseGameTest.runAwayTest();
		dbMockTest.retrieveDataFromDbTest();
		gameFloorTest.getFloorNameTest();
		gameFloorTest.setFloorNameTest();
		gameFloorTest.getFloorNumberTest();
		gameFloorTest.setFloorNumberTest();
		gameMonsterTest.getMonsterAtkTest();
		gameMonsterTest.setMonsterAtkTest();
		gameMonsterTest.getMonsterHpTest();
		gameMonsterTest.setMonsterHpTest();
		gameMonsterTest.getMonsterNameTest();
		gameMonsterTest.setMonsterNameTest();
		gamePlayerTest.getPlayerHpTest();
		gamePlayerTest.setPlayerHpTest();
		gamePlayerTest.getPlayerNameTest();
		gamePlayerTest.setPlayerNameTest();
		gameWeaponTest.getWeaponNameTest();
		gameWeaponTest.setWeaponNameTest();
		gameWeaponTest.getWeaponValueTest();
		gameWeaponTest.setWeaponValueTest();
	}
}
