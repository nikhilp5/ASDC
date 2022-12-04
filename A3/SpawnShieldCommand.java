import java.util.ArrayList;

public class SpawnShieldCommand extends Command{

	public SpawnShieldCommand(Object receiver, String[] args) {
		super(receiver, args);
	}

	@Override
	public void Execute() {
		Square square = (Square) receiver;
		Shield decoratedSquare=new ShieldSquareDecorator(square);
		square.SetParent(decoratedSquare);
		for(ArrayList<BoardComponent> boardComponents :GameBoard.Instance().GetBoard()) {
			if(boardComponents.contains(square)) {
				boardComponents.set(boardComponents.indexOf(square), decoratedSquare);
				break;
			}
		}
		System.out.println("Spawning shield at (" + args[0] + "," + args[1]+") ");
	}

}
