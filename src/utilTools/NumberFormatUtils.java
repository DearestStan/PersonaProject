package utilTools;

public class NumberFormatUtils {
	public boolean isIntegerNumber(String number) {
		try {
			Integer.valueOf(number);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean isBigDecimalNumber(String number) {
		try {
			Double.parseDouble(number);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
