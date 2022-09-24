public class GamePlayer{

	private String name;
	private int hp;

	public GamePlayer(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}

	public GamePlayer() {
		super();
	}

	public String getPlayerName() {
		return name;
	}
	public void setPlayerName(String name) {
		this.name = name;
	}
	public int getPlayerHp() {
		return hp;
	}
	public void setPlayerHp(int hp) {
		this.hp = hp;
	}
	
}
