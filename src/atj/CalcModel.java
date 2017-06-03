package atj;

public class CalcModel {

	private String input="";
	private double firstNumber;
	private double secondNumber;
	private String operator;
	private boolean enabled = true;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}
	
	public void addInput(String addValue){
		input = new StringBuilder().append(input).append(addValue).toString();
	}
	
	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public boolean checkDot() {
		if (input.indexOf(".") != -1) return false;
		return true;
	}
	
	public void setCalculationMethod(String operator){
		if (!input.isEmpty()){
			this.firstNumber = Double.parseDouble(input);
			this.operator = operator;
			this.input = "";
		}
	}
	
	public void calculatePercentage(){
		if (operator == "+"){
			secondNumber = Double.valueOf(input);
			firstNumber = firstNumber*(1+(secondNumber)/100);
			input = String.valueOf(firstNumber);
		}
		if (operator == "*"){
			secondNumber = Double.valueOf(input);
			firstNumber = firstNumber*(1*(secondNumber)/100);
			input = String.valueOf(firstNumber);
		}
		if (operator == "/"){
			secondNumber = Double.valueOf(input);
			firstNumber = firstNumber*(1/(secondNumber)/100);
			input = String.valueOf(firstNumber);
		}
		if (operator == "-"){
			secondNumber = Double.valueOf(input);
			firstNumber = firstNumber*(1-(secondNumber)/100);
			input = String.valueOf(firstNumber);
		}
		operator = "";
	}
	
	public double getInputNumber(){
		return Double.parseDouble(input);
	}

	public void setResult() {
		
		if (operator == "/"){
			secondNumber = Double.valueOf(input);
			firstNumber = firstNumber/secondNumber;
			input = String.valueOf(firstNumber);
		}
		if (operator == "*"){
			secondNumber = Double.valueOf(input);
			firstNumber = firstNumber*secondNumber;
			input = String.valueOf(firstNumber);
		}
		if (operator == "+"){
			secondNumber = Double.valueOf(input);
			firstNumber = firstNumber+secondNumber;
			input = String.valueOf(firstNumber);
		}
		if (operator == "-"){
			secondNumber = Double.valueOf(input);
			firstNumber = firstNumber-secondNumber;
			input = String.valueOf(firstNumber);
		}
		operator = "";
	}
}
