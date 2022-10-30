
public class Calculator {
	public void calculate(String operation,int number1,int number2) {
		switch(operation.toLowerCase()) {
		  case "add":
		    new Add().operation(number1, number2);
		    break;
		  case "subtract":
			new Subtract().operation(number1, number2);
		    break;
		  default:
		    System.out.println("Not a Valid Operation");
		}
	}
}
