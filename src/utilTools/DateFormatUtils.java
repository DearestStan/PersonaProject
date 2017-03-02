package utilTools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtils {
	//日期格式1
	private final static String DATE_FORMAT_1 = "yyyy/MM/dd";
	//日期格式2
	private final static String DATE_FORMAT_2 = "yyyy-MM-dd";
	//日期格式1
	private final static String DATE_FORMAT_3 = "yyyyMMdd";
	//日期
	private Date date;
	
	/*
	 * 
	 */
	public Date strToDateAll(String dateString, String dateFormat, Boolean lenient) {
		if (dateString.length() != 8) {
			return null;
		}
		if ((dateFormat == null || dateFormat.isEmpty()) && dateFormat.equals(DATE_FORMAT_1) 
				&& dateFormat.equals(DATE_FORMAT_2) && dateFormat.equals(DATE_FORMAT_3)) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		sdf.setLenient(lenient);
		if (dateFormat.equals(DATE_FORMAT_1)) {		
			try {
				date = sdf.parse(dateString.substring(0, 4) + "/" + dateString.substring(4,6) + "/" + dateString.substring(6,8));
			} catch (ParseException e) {
				return null;
			}
		}
		if (dateFormat.equals(DATE_FORMAT_2)) {
			try {
				date = sdf.parse(dateString.substring(0, 4) + "-" + dateString.substring(4,6) + "-" + dateString.substring(6,8));
			} catch (ParseException e) {
				return null;
			}
		}
		if (dateFormat.equals(DATE_FORMAT_3)) {
			try {
				date = sdf.parse(dateString);
			} catch (ParseException e) {
				return null;
			}
		}
		return date;
	}
	
	public String strToDateShow(String dateString, String dateFormat, Boolean lenient) {
		if (dateString.length() != 8) {
			return null;
		}
		if ((dateFormat == null || dateFormat.isEmpty()) && dateFormat.equals(DATE_FORMAT_1) 
				&& dateFormat.equals(DATE_FORMAT_2) && dateFormat.equals(DATE_FORMAT_3)) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		sdf.setLenient(lenient);
		if (dateFormat.equals(DATE_FORMAT_1)) {		
			try {
				date = sdf.parse(dateString.substring(0, 4) + "/" + dateString.substring(4,6) + "/" + dateString.substring(6,8));
			} catch (ParseException e) {
				return null;
			}
		}
		if (dateFormat.equals(DATE_FORMAT_2)) {
			try {
				date = sdf.parse(dateString.substring(0, 4) + "-" + dateString.substring(4,6) + "-" + dateString.substring(6,8));
			} catch (ParseException e) {
				return null;
			}
		}
		if (dateFormat.equals(DATE_FORMAT_3)) {
			try {
				date = sdf.parse(dateString);
			} catch (ParseException e) {
				return null;
			}
		}
		return sdf.format(date);
	}
}
