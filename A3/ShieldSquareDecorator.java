
public class ShieldSquareDecorator extends ShieldDecorator{

	public ShieldSquareDecorator(Square decoratedSquare) {
		super(decoratedSquare);
	}

	@Override
	public void Operation() {
		Square square=(Square)decoratedObject;
		square.Operation();
	}
	
	public Square getSquare() {
		return (Square) decoratedObject;
	}
}
