package action.com;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Classjava {

	public static void main(String[] args) throws ParseException {
	
		/*Date date = new Date();
	System.out.println(date.toString());
	Format ft =new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	
	System.out.println("Current date" +ft.format(date));
	*/
		//comparing the time by converting the time format into a specific date format
		/* String time1= "16:00:00";
		String time2= "19:00:00";
		
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date date1=format.parse(time1);
		Date date2 = format.parse(time2);
		long difference= date2.getTime() - date1.getTime();
		System.out.println(difference); */
		
		//compare date 1 with date 2. compare 2 time period. time coming on the website same as compared to time on the system.
		
		/* Date date3 = new Date();
		Date date4 = new Date();
		int cmp=date3.compareTo(date4);
		System.out.println(cmp); */
		
		
		/* Calendar calender= new GregorianCalendar();
		int year =calender.get(Calendar.YEAR);
		int month =calender.get(Calendar.MONTH);
		int dayOfMonth =calender.get(Calendar.DAY_OF_MONTH);
		int weekOfMonth =calender.get(Calendar.WEEK_OF_MONTH);
		System.out.println(year+" " +month+" " +dayOfMonth+" "+weekOfMonth);     */
		
		Calendar calender= new GregorianCalendar();
		int dayOfMonth =calender.get(Calendar.DAY_OF_MONTH);
		System.out.println("day of month" +dayOfMonth);
		calender.add(Calendar.DAY_OF_MONTH, 1);
		int dayOfMonthUpdated = calender.get(Calendar.DAY_OF_MONTH);
		System.out.println("New day "+dayOfMonthUpdated);
		
		
		
	}
}
