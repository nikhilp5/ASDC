import java.util.ArrayList;

public class Shield extends Square implements Observer{

	private int shieldHealth;

	public Shield()
	{
		super();
		shieldHealth = 2;
		GameBoard.subjectInstance().attach((Observer)this);
	}
	
	@Override
	public void Operation() {
		
	}

	@Override
	public void Add(BoardComponent child) {
		
	}

	@Override
	public void Remove(BoardComponent child) {
		
	}

	@Override
	public void update() {
		shieldHealth-= 1;
		if(shieldHealth==0) {
			for(ArrayList<BoardComponent> boardComponents :GameBoard.Instance().GetBoard()) {
				if(boardComponents.contains(this)) {
					ShieldSquareDecorator decoratedShield=(ShieldSquareDecorator)this;
					decoratedShield.getSquare().SetParent(null);
					boardComponents.set(boardComponents.indexOf(this),decoratedShield.getSquare());
					GameBoard.subjectInstance().detach(decoratedShield);
					System.out.println("Shield destroyed.");
					break;
				}
			}
		}
	}
}
