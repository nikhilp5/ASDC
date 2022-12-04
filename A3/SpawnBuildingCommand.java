
public class SpawnBuildingCommand extends Command{

	public SpawnBuildingCommand(Object receiver, String[] args) {
		super(receiver, args);
		GameBoard.Instance().IncrementBuildingCount();
	}

	@Override
	public void Execute() {
		// The receiver for the SpawnAsteroidCommand is the Square to spawn the asteroid in.
		Square square = (Square) receiver;
		// The args for SpawnAsteroidCommand are the X,Y coordinate for the asteroid
		// used by the factory, and the height of the asteroid.
		IAsteroidGameFactory factory = GameBoard.Instance().GetFactory();
		System.out.println("Spawning building at (" + args[0] + "," + args[1]+") ");
		square.Add(factory.MakeBuilding());
	}
}
