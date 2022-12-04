import java.util.ArrayList;
import java.util.Iterator;

// Square is a composite, making up the Composite pattern (contains components)
public class Square extends BoardComponent implements Observer
{
	private final ArrayList<BoardComponent> children;
	private BoardComponent parent;
	
	public Square()
	{
		super();
		children = new ArrayList<BoardComponent>();
		GameBoard.subjectInstance().attach((Observer)this);
	}

	@Override
	public void Operation()
	{
		ArrayList<BoardComponent> childrenCopy = new ArrayList<BoardComponent>(children);
		for (int i = 0; i < childrenCopy.size(); i++)
		{
			BoardComponent child = childrenCopy.get(i);
			child.Operation();
		}
	}

	@Override
	public void Add(BoardComponent child)
	{
		// I am now this child's parent.
		children.add(child);
		child.SetParent(this);
	}

	@Override
	public void Remove(BoardComponent child)
	{
		children.remove(child);
	}

	public ArrayList<BoardComponent> getChildren() {
		return children;
	}

	@Override
	public void SetParent(BoardComponent parent)
	{
		this.parent = parent;
	}
	
	@Override
	public void update() {
		if(parent==null) {
			Iterator<BoardComponent> iter = this.getChildren().iterator();
			while(iter.hasNext()) {
				BoardComponent child=iter.next();
				if(child instanceof Building) {
					((Building) child).update(iter);
				}
			}
		}
		else {
			GameBoard.subjectInstance().notifyObservers((Observer)parent);
		}
	}
}