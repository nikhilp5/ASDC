
public class PlayableCharacter implements PlayerActions{
	public void attack() {
		System.out.println("Player attacks");
	}
	public void heal() {
		System.out.println("Player heals");
	}
	public void assistPlayer() {
		//Not a valid action for playable character
	}
}
