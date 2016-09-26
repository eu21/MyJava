/* Improved class MilkPayDay3
 * to help me count how many liters of milk I bought
 *
 *It takes two parameters
 *
 *	    int StartDayOfMonth = 17; 
	    int StartLiters = 5;
	    
 */


import java.util.Calendar;

public class MilkPayDay3
{
	public static void main(String[] args)
	{
		
	
		Calendar calendar = Calendar.getInstance(); //calendar1 = REAL CALENDAR
		Calendar calendar2 = Calendar.getInstance(); // calendar2 = VIRTUAL CALENDAR
		System.out.println("Date today: "+ calendar.getTime());
		System.out.println("month for January is 0 (ZERO)");

		int curDay = calendar.get(calendar.DAY_OF_MONTH); //real day like int = 26
		int count = 0;
	    int StartDayOfMonth = 17; // The day ( when I write down ) 
	    int StartLiters = 5; // The liters I already bought  ( when I write down )
	    int StartMonth = 8; //The month ( when I write down ) like "May"
	    int StartYear = 2015; //The month ( when I write down ) like "May"
		int curMonth = calendar.get(calendar.MONTH); //real month for January it's 0, for May it's 4, for September it's 8...
		int curYear = calendar.get(calendar.YEAR); //real month for January it's 0, for May it's 4, for September it's 8...
		System.out.println("curYear: "+ curYear + " ");
		System.out.println("curMonth: "+ curMonth + " though you think it should be +1");
		
	    StartDayOfMonth++; // Correction to skip one day ( already counted day of the week )

	    for (int y = StartYear;  y <= curYear;  y++) {
	    	calendar2.set(Calendar.YEAR, y);
	    
	    for (int m = StartMonth;  m <= curMonth;  m++) {
	    	calendar2.set(Calendar.MONTH, m);
	        
			    for (int d = StartDayOfMonth;  d <= curDay;  d++) {
			    	calendar2.set(Calendar.DAY_OF_MONTH, d);
			    	
			        int dayOfWeek = calendar2.get(Calendar.DAY_OF_WEEK);
			        if ((Calendar.TUESDAY == dayOfWeek) ||(Calendar.THURSDAY == dayOfWeek) ||(Calendar.SATURDAY == dayOfWeek)) {
			            count++;
			            System.out.println("MilkDay: "+ calendar2.getTime());
			        }
			        StartDayOfMonth =1;
			    }
			    StartMonth = 0;
	    }
	    }

	    int SumLiters =  count + StartLiters;
	    System.out.println("Start liters: "+ StartLiters);
	    System.out.println("Liters bought: "+ count);
	    System.out.println("Liters together: "+ SumLiters);
	}
	
}

/*
Calendar calendar1 = Calendar.getInstance();
System.out.println("DATE: " + calendar1.getTime());
System.out.println("ERA: " + calendar1.get(calendar1.ERA));
System.out.println("YEAR: " + calendar1.get(calendar1.YEAR));
System.out.println("MONTH: " + calendar1.get(calendar1.MONTH));
System.out.println("HOUR: " + calendar1.get(calendar1.HOUR));
System.out.println("MINUTE: " + calendar1.get(calendar1.MINUTE));
System.out.println("SECOND: " + calendar1.get(calendar1.SECOND));
System.out.println("MILLISECOND: " + calendar1.get(calendar1.MILLISECOND));
System.out.println("DAY_OF_YEAR: " + calendar1.get(calendar1.DAY_OF_YEAR));
System.out.println("DAY_OF_MONTH: " + calendar1.get(calendar1.DAY_OF_MONTH));
System.out.println("DAY_OF_WEEK: " + calendar1.get(calendar1.DAY_OF_WEEK));
System.out.println("DAY_OF_WEEK_IN_MONTH: " + calendar1.get(calendar1.DAY_OF_WEEK_IN_MONTH));
System.out.println("WEEK_OF_MONTH: " + calendar1.get(calendar1.WEEK_OF_MONTH));
System.out.println("WEEK_OF_YEAR: " + calendar1.get(calendar1.WEEK_OF_YEAR));
System.out.println("AM_PM: " + calendar1.get(calendar1.AM_PM));
*/
//calendar.set(Calendar.DAY_OF_WEEK, 4);  //3 make it a Tuesday (crucial)
//optionally set the month you want here
//calendar.set(Calendar.MONTH, 4); //May
//int maxDayInMonth=calendar.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH); //for this month (what you want)
//int Maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK_IN_MONTH); //for any month (not so useful)
