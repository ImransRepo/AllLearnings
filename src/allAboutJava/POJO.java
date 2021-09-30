package allAboutJava;

import java.io.Serializable;

public class POJO implements Serializable {

	
	private int id;

//	private Timestamp timestamp;

	private double operandA;

	private double operandB;

	private String operation;

	private double result;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getOperandA() {
		return operandA;
	}

	public void setOperandA(double operandA) {
		this.operandA = operandA;
	}

	public double getOperandB() {
		return operandB;
	}

	public void setOperandB(double operandB) {
		this.operandB = operandB;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
}
