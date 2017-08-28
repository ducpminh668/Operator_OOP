package tinhtoan;

public class Main {

	public static void main(String[] args) throws NumberFormatException, Exception {
		Calculator calculator = new Calculator();
		
		calculator.addOperator("+", new Addition());
		calculator.addOperator("-", new Subtraction());
		calculator.addOperator("*", new Multiply());
		calculator.addOperator("/", new Division());
		
		
		System.out.println(calculator.calculate(args[1],Double.parseDouble(args[0]),Double.parseDouble(args[2])));
	}

}
