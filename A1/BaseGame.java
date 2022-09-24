import java.util.HashMap;

public class BaseGame {

	public void initiailizePlayer(GamePlayer player,String name) {
		try {
			player.setPlayerHp(100);
			player.setPlayerName(name);
		}
		catch(Exception e) {
			System.out.println("Exception in initiailizePlayer");
		}
	}

	public void initiailizeMonster(HashMap<String,String> monsterData,GameMonster monsterSet) {
		try {
			for (String key : monsterData.keySet()) {
				if(Integer.parseInt(key)/10==1) {
					monsterSet.setMonsterHp(100);
					monsterSet.setMonsterAtk(Integer.parseInt(key));
					monsterSet.setMonsterName(monsterData.get(key));
				}
			}
		}
		catch(Exception e) {
			System.out.println("Exception in initiailizeMonster");
		}
	}

	public void initiailizeFloor(HashMap<String,String> floorData,GameFloor floorSet) {
		try {
			for (String key : floorData.keySet()) {
				if(key.equals("1")) {
					floorSet.setFloorNumber(Integer.parseInt(key));
					floorSet.setFloorName(floorData.get(key));
				}
			}
		}
		catch(Exception e) {
			System.out.println("Exception in initiailizeFloor");			
		}
	}

	public void initiailizeWeapon(HashMap<String,String> weaponData,GameWeapon weapon) {
		try {
			for (String key : weaponData.keySet()) {
				if(key.equals("10")) {
					weapon.setWeaponName(weaponData.get(key));
					weapon.setWeaponValue(Integer.parseInt(key));
				}
			}
		}
		catch(Exception e) {
			System.out.println("Exception in initiailizeWeapon");
		}
	}

	public void initiateFight(GamePlayer player,GameMonster monster,GameFloor floor,GameWeapon weapon) {
		try {
			System.out.println("--------------------------------------------------");
			System.out.println(floor.getFloorName()+" entered");
			System.out.println("You encounter "+monster.getMonsterName()+" || Damage ("+monster.getMonsterAtk()+")");
			System.out.println("Your weapon "+weapon.getWeaponName()+" || Damage ("+weapon.getWeaponValue()+")");
			System.out.println("Choose an option to take on "+monster.getMonsterName());
			System.out.println("--------------------------------------------------");
		}
		catch(Exception e) {
			System.out.println("Exception in initiateFight");
		}
	}

	public void attackAndProgress(GamePlayer player,GameMonster monster,GameFloor floor,GameWeapon weapon,HashMap<String,String> floorData,
			HashMap<String,String> monsterData,HashMap<String,String> weaponData) {
		try {
			if(player.getPlayerHp()>0) {
				System.out.println("--------------------------------------------------");
				System.out.println("You attacked "+monster.getMonsterName()+" and damaged him for "+weapon.getWeaponValue()+" damage");
				if((monster.getMonsterHp()-weapon.getWeaponValue())<0) {
					monster.setMonsterHp(0);
				}
				else {
					monster.setMonsterHp(monster.getMonsterHp()-weapon.getWeaponValue());
				}
				System.out.println(monster.getMonsterName()+" HP: "+monster.getMonsterHp());
				System.out.println("--------------------------------------------------");
			}
			else {
				dead();
			}
			if(monster.getMonsterHp()<=0) {
				if(floor.getFloorNumber()==5) {
					gameWin();
				}
				else {
					System.out.println("You defeated "+monster.getMonsterName());
					System.out.println("--------------------------------------------------");
					healPlayer(player);
					upgradeFloor(floorData,floor);
					upgradeWeapon(weaponData,weapon);
					System.out.println("You gained "+weapon.getWeaponName());
					System.out.println("--------------------------------------------------");
					upgradeMonster(monsterData,monster);
					initiateFight(player, monster, floor, weapon);
				}
			}
			else {
				System.out.println("--------------------------------------------------");
				System.out.println("The "+monster.getMonsterName()+" attacked you and damaged you for " + monster.getMonsterAtk() + " damage");
				if((player.getPlayerHp()-monster.getMonsterAtk())<0) {
					player.setPlayerHp(0);
				}
				else {
					player.setPlayerHp(player.getPlayerHp()-monster.getMonsterAtk());
				}
				System.out.println(player.getPlayerName()+" HP: " + player.getPlayerHp());
				System.out.println("--------------------------------------------------");
			}
		}
		catch(Exception e) {
			System.out.println("Exception in attackAndProgress");
		}
	}

	public void healPlayer(GamePlayer player) {
		try {
			player.setPlayerHp(100);
		}
		catch(Exception e) {
			System.out.println("Exception in healPlayer");
		}
	}

	public void upgradeFloor(HashMap<String,String> floorData,GameFloor floorSet) {
		try {
			Integer currentFloor=floorSet.getFloorNumber()+1;
			for (String key : floorData.keySet()) {
				if(key.equals(currentFloor.toString())) {
					floorSet.setFloorNumber(Integer.parseInt(key));
					floorSet.setFloorName(floorData.get(key));
				}
			}
		}
		catch(Exception e) {
			System.out.println("Exception in upgradeFloor");
		}
	}

	public void upgradeWeapon(HashMap<String,String> weaponData,GameWeapon weapon) {
		try {
			Integer currentWeapon=weapon.getWeaponValue()+10;
			for (String key : weaponData.keySet()) {
				if(key.equals(currentWeapon.toString())) {
					weapon.setWeaponName(weaponData.get(key));
					weapon.setWeaponValue(Integer.parseInt(key));
				}
			}
		}
		catch(Exception e) {
			System.out.println("Exception in upgradeWeapon");
		}
	}

	public void upgradeMonster(HashMap<String,String> monsterData,GameMonster monsterSet) {
		try {
			Integer currentMonster=monsterSet.getMonsterAtk()+10;
			for (String key : monsterData.keySet()) {
				if(key.equals(currentMonster.toString())) {
					monsterSet.setMonsterHp(100);;
					monsterSet.setMonsterAtk(Integer.parseInt(key));
					monsterSet.setMonsterName(monsterData.get(key));
				}
			}
		}
		catch(Exception e) {
			System.out.println("Exception in upgradeMonster");
		}
	}

	public void gameWin() {
		System.out.println("--------------------------------------------------");
		System.out.println("You have successfully cleared all levels and rescued the princess");
		System.out.println("Congrats on your win!");
		System.out.println("--------------------------------------------------");
	}

	public void dead() {
		System.out.println("--------------------------------------------------");
		System.out.println("You are dead");
		System.out.println("GAME OVER");
		System.out.println("--------------------------------------------------");
	}

	public void runAway() {
		System.out.println("--------------------------------------------------");
		System.out.println("You ranaway");
		System.out.println("GAME OVER");
		System.out.println("--------------------------------------------------");
	}
}
