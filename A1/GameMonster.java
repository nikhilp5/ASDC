public class GameMonster{

	private String name;
	private int hp;
	private int atk;

	public GameMonster(String name, int hp, int atk) {
		super();
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}

	public GameMonster() {
		super();
	}

	public String getMonsterName() {
		return name;
	}
	public void setMonsterName(String name) {
		this.name = name;
	}
	public int getMonsterHp() {
		return hp;
	}
	public void setMonsterHp(int hp) {
		this.hp = hp;
	}
	public int getMonsterAtk() {
		return atk;
	}
	public void setMonsterAtk(int atk) {
		this.atk = atk;
	}
	
}
