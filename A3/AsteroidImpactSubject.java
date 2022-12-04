import java.util.ArrayList;
import java.util.List;

public class AsteroidImpactSubject implements Subject{
	private List<Observer> observers;

	public AsteroidImpactSubject(){
		this.observers=new ArrayList<>();
	}
	@Override
	public void attach(Observer component) {
		if(!observers.contains(component)) {
			observers.add(component);
		}
	}

	@Override
	public void detach(Observer component) {
		observers.remove(component);		
	}

	@Override
	public void notifyObservers(Observer component) {
		if(observers.contains(component)) {
			component.update();
		}
	}
}
