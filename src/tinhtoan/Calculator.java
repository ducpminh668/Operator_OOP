package tinhtoan;

import java.util.HashMap;

public class Calculator{

	
	HashMap<String, Operator> listOperator = new HashMap<String, Operator>();
	
	public double calculate(String operatorName,double a,double b) throws Exception{
			
			
			Operator operator = listOperator.get(operatorName);
			if(operator == null) throw new Exception(operatorName + " is not supported");
			if(b == 0) throw new Exception("Devision By Zero");
			return operator.run(a, b);

		
		
	}
	
	public void addOperator(String operatorName,Operator operator) {
		listOperator.put(operatorName, operator);
	}
	
}
