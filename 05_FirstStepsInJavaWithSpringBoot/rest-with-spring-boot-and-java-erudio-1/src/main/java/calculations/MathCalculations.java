package calculations;

import main.exceptions.UnsuporthedMathOperationException;
import validations.ConvertTodouble;
import validations.IsNumeric;

public class MathCalculations {

	public static double sum(String numberOne, String numberTwo) throws Exception {

		if (!IsNumeric.isNumeric(numberOne) || !IsNumeric.isNumeric(numberTwo)) {

			throw new UnsuporthedMathOperationException("Please set a numeric value!");

		}

		return ConvertTodouble.convertToDouble(numberOne) + ConvertTodouble.convertToDouble(numberTwo);

	}

	public static double sub(String numberOne, String numberTwo) throws Exception {

		if (!IsNumeric.isNumeric(numberOne) || !IsNumeric.isNumeric(numberTwo)) {

			throw new UnsuporthedMathOperationException("Please set a numeric value!");

		}

		return ConvertTodouble.convertToDouble(numberOne) - ConvertTodouble.convertToDouble(numberTwo);

	}

	public static double mult(String numberOne, String numberTwo) throws Exception {

		if (!IsNumeric.isNumeric(numberOne) || !IsNumeric.isNumeric(numberTwo)) {

			throw new UnsuporthedMathOperationException("Please set a numeric value!");

		}

		return ConvertTodouble.convertToDouble(numberOne) * ConvertTodouble.convertToDouble(numberTwo);

	}

	public static double div(String numberOne, String numberTwo) throws Exception {

		if (!IsNumeric.isNumeric(numberOne) || !IsNumeric.isNumeric(numberTwo)) {

			throw new UnsuporthedMathOperationException("Please set a numeric value!");

		}

		return ConvertTodouble.convertToDouble(numberOne) / ConvertTodouble.convertToDouble(numberTwo);

	}

	public static double med(String numberOne, String numberTwo) throws Exception {

		if (!IsNumeric.isNumeric(numberOne) || !IsNumeric.isNumeric(numberTwo)) {

			throw new UnsuporthedMathOperationException("Please set a numeric value!");

		}

		return (ConvertTodouble.convertToDouble(numberOne) + ConvertTodouble.convertToDouble(numberTwo)) / 2;

	}

	public static double square(String number) throws Exception {

		if (!IsNumeric.isNumeric(number)) {

			throw new UnsuporthedMathOperationException("Please set a numeric value!");

		}

		return Math.sqrt(ConvertTodouble.convertToDouble(number));

	}

}
