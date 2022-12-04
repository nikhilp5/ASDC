
public abstract class ShieldDecorator extends Shield{

    protected BoardComponent decoratedObject;
 
    public ShieldDecorator(BoardComponent decoratedObject)
    {
        this.decoratedObject = decoratedObject;
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

}
