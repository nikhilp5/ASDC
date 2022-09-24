public class GameWeapon{

	private String name;
	private int damage;

	public GameWeapon(String name, int damage) {
		super();
		this.name = name;
		this.damage = damage;
	}

	public GameWeapon() {
		super();
	}

	public String getWeaponName() {
		return name;
	}

	public void setWeaponName(String name) {
		this.name = name;
	}

	public int getWeaponValue() {
		return damage;
	}

	public void setWeaponValue(int damage) {
		this.damage = damage;
	}

}
