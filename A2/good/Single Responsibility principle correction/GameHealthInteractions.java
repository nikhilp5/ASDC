
public class GameHealthInteractions {
	public void playerAttacked(GamePlayer player,int damageReceived) {
		try {
			int updatedHp=player.getPlayerHp()-damageReceived;
			if(updatedHp<0) {
				GameWinLose winLose=new GameWinLose();	
				winLose.dead();
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
}
