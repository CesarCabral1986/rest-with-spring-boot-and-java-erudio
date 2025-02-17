package validations;

public class ConvertTodouble {

	public static Double convertToDouble(String strNumber) {
		if (strNumber == null)
			return 0D;
		String number = strNumber.replaceAll(",", ".");

		IsNumeric isNumeric = new IsNumeric();

		if (isNumeric.isNumeric(number))
			return Double.parseDouble(number);

		return 0D;
	}

}
