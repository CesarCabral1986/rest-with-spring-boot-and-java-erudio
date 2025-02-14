package calculations;

import main.exceptions.UnsuporthedMathOperationException;
import validations.ConvertTodouble;
import validations.IsNumeric;

public class MathCalculations {

	public double sum(String numberOne, String numberTwo) throws Exception {

		IsNumeric isNumeric = new IsNumeric();

		if (!isNumeric.isNumeric(numberOne) || !isNumeric.isNumeric(numberTwo)) {

			throw new UnsuporthedMathOperationException("Please set a numeric value!");

		}

		ConvertTodouble convertDouble = new ConvertTodouble();

		return convertDouble.convertToDouble(numberOne) + convertDouble.convertToDouble(numberTwo);

	}

	public double sub(String numberOne, String numberTwo) throws Exception {

		IsNumeric isNumeric = new IsNumeric();

		if (!isNumeric.isNumeric(numberOne) || !isNumeric.isNumeric(numberTwo)) {

			throw new UnsuporthedMathOperationException("Please set a numeric value!");

		}

		ConvertTodouble convertDouble = new ConvertTodouble();

		return convertDouble.convertToDouble(numberOne) - convertDouble.convertToDouble(numberTwo);

	}

	public double mult(String numberOne, String numberTwo) throws Exception {

		IsNumeric isNumeric = new IsNumeric();

		if (!isNumeric.isNumeric(numberOne) || !isNumeric.isNumeric(numberTwo)) {

			throw new UnsuporthedMathOperationException("Please set a numeric value!");

		}

		ConvertTodouble convertDouble = new ConvertTodouble();

		return convertDouble.convertToDouble(numberOne) * convertDouble.convertToDouble(numberTwo);

	}
	
	public double div(String numberOne, String numberTwo) throws Exception {

		IsNumeric isNumeric = new IsNumeric();

		if (!isNumeric.isNumeric(numberOne) || !isNumeric.isNumeric(numberTwo)) {

			throw new UnsuporthedMathOperationException("Please set a numeric value!");

		}

		ConvertTodouble convertDouble = new ConvertTodouble();

		return convertDouble.convertToDouble(numberOne) / convertDouble.convertToDouble(numberTwo);

	}
	
	public double med(String numberOne, String numberTwo) throws Exception {

		IsNumeric isNumeric = new IsNumeric();

		if (!isNumeric.isNumeric(numberOne) || !isNumeric.isNumeric(numberTwo)) {

			throw new UnsuporthedMathOperationException("Please set a numeric value!");

		}

		ConvertTodouble convertDouble = new ConvertTodouble();

		return (convertDouble.convertToDouble(numberOne) + convertDouble.convertToDouble(numberTwo)) / 2;

	}
	
	public double square(String number) throws Exception {

		IsNumeric isNumeric = new IsNumeric();

		if (!isNumeric.isNumeric(number)){

			throw new UnsuporthedMathOperationException("Please set a numeric value!");

		}

		ConvertTodouble convertDouble = new ConvertTodouble();

		return Math.sqrt(convertDouble.convertToDouble(number));

	}

}
