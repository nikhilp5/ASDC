import java.util.Iterator;

// Building is the leaf node for the composite pattern, Square's can have MULTIPLE Buildings
// Buildings cannot have children.
public class Building extends BoardComponent
{
	private int buildingHealth;
	
	public Building()
	{
		super();
		buildingHealth = 2;
	}

	@Override
	public void Operation()
	{
		// Buildings just stand there, they don't do anything.
	}

	@Override
	public void Add(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}

	@Override
	public void Remove(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}

	public void update(Iterator<BoardComponent> iter) {
		buildingHealth-= 1;	
		if(buildingHealth==0) {
			GameBoard.Instance().DecrementBuildingCount();
			System.out.println("Building destroyed.");
			System.out.println(GameBoard.Instance().GetBuildingCount()+" building remaining");
			iter.remove();
			GameBoard.subjectInstance().detach((Observer)this.parent);
		}
	}
}