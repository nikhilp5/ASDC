
public class GamePlayer{

	private String name;
	private int hp;

	public GamePlayer(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
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
	
	public void playerAttacked(GamePlayer player,int damageReceived) {
		try {
			int updatedHp=player.getPlayerHp()-damageReceived;
			if(updatedHp<0) {
				this.dead();
			}
			else {
				player.setPlayerHp(updatedHp);
			}
		}
		catch(Exception e) {
			System.out.println("Exception in playerAttacked");
		}
	}
	
	public void playerHealed(GamePlayer player,int healingAmount) {
		int updatedHp=player.getPlayerHp()+healingAmount;
		try {
			if(updatedHp>100) {
				player.setPlayerHp(100);
			}
			else {
				player.setPlayerHp(updatedHp);
			}
		}
		catch(Exception e) {
			System.out.println("Exception in playerHealed");
		}
	}
	
	public void gameWin() {
		System.out.println("Game Won");
	}

	public void dead() {
		System.out.println("GAME OVER");
	}
}
