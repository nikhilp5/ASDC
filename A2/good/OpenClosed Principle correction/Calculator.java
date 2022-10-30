
public class Calculator {
	public void calculate(Operation operation,int number1,int number2) {
		try {
			operation.operationTask(number1, number2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
