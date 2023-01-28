package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import utilities.SeleniumUtility;

public class date extends SeleniumUtility{

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, +6);
		Date d1=new Date(cal.getTimeInMillis());
		SimpleDateFormat s=new SimpleDateFormat("dd/MM/YYYY");
		System.out.println(s.format(d1));
*/	
	SeleniumUtility c=new SeleniumUtility();
	System.out.println(c.getRequiredDateBasedOnNumberOfMonths("dd/MM/YY", +6));
	System.out.println(c.getRequiredDateBasedOnNumberOfYears("dd/MM/yy", +6));
	
	
	
	
	}

}
