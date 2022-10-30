
public class NonPlayableCharacter implements PlayerActions{
	public void attack() {
		//Not a valid action for non-playable character
	}
	public void heal() {
		//Not a valid action for non-playable character
	}
	public void assistPlayer() {
		System.out.println("Assists Player");
	}
}
