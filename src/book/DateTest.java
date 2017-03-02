package book;

import utilTools.DateFormatUtils;
import utilTools.NumberFormatUtils;

public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String dateString = "20161333";
		DateFormatUtils dateFormat = new DateFormatUtils();
		NumberFormatUtils numberFormat = new NumberFormatUtils();
		System.out.println(dateFormat.strToDateAll(dateString, "yyyyMMdd", false));
		System.out.println(dateFormat.strToDateShow(dateString, "yyyy-MM-dd", true));
		System.out.println(numberFormat.isIntegerNumber("123"));
		System.out.println(numberFormat.isBigDecimalNumber("123.5"));
	}
}
