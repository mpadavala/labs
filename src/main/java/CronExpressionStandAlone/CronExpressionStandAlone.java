package CronExpressionStandAlone;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;

import org.springframework.scheduling.support.CronTrigger;

public class CronExpressionStandAlone {

	/*
	private static final HashMap<String,String> timezoneCache = new HashMap<String,String>();
	private static final String DEFAULT_FORMAT = "MMM dd, yyyy hh:mm aa zzz";
	private static final int NO_OF_INTERVALS = 2;

	*/
	
	public static void main(String[] args) {
		
		
		/*
		try {
			
			if (args.length > 2 || args.length == 1 || args.length == 0) {
				throw new RuntimeException("Please pass 2 arguments, first parameter is cron expression and second is timezone ");
			}
			System.out.println("Parameter passed through command line : first one " + args[0] +" second one " + args[1]);

			String cronInput=args[0] ;
			String timeZoneInput=args[1];
			timezoneCache.put("R001",timeZoneInput);

			Date nextExecutionTime = getNextExecutionTime(cronInput, "R001");
			java.sql.Timestamp nextExecutionTime1 = new java.sql.Timestamp(nextExecutionTime.getTime());
			System.out.println("nextExecutionTime  in GMT "+nextExecutionTime1);
			System.out.println("nextExecutionTime  in PST"+getDateinTZ(nextExecutionTime1, timeZoneInput));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
	}
	
	
	/*
	public static Date getNextExecutionTime(String cronExpression,
			String entityId) throws Exception {

		SimpleDateFormat formatter = new SimpleDateFormat(
				"MMM dd, yyyy hh:mm:ss a");
		CronTrigger cronTrigger = new CronTrigger();
		cronTrigger.setCronExpression(cronExpression);
		TimeZone timeZone = getTimeZone(entityId);
		cronTrigger.setTimeZone(timeZone);

		String todayDate = formatter.format(getDate(entityId));
		Date formattedDate = formatter.parse(todayDate);
		System.out.println("formatted Date as per time zone during getting next execution time    "
				+ timeZone.getDisplayName() + "    " + formattedDate);
		Date nextExecutionTime = cronTrigger.getFireTimeAfter(formattedDate);

		return nextExecutionTime;
	}
		
	public static Date getDate(final String entityId) throws ParseException {
		
		Date tempDate = null;
		String tempEntityId = entityId;

		if ((timezoneCache.get(tempEntityId)) != null) {
			String timeZone = timezoneCache.get(tempEntityId).toString();
			TimeZone zone = TimeZone.getTimeZone(timeZone);
			DateFormat format = DateFormat.getDateTimeInstance();
			format.setTimeZone(zone);
			SimpleDateFormat formatter1 = new SimpleDateFormat(
					"MMM dd, yyyy hh:mm:ss a");
			tempDate = formatter1.parse(format.format(new Date()));

		} else {
			tempDate = new Date();
		}
	
		return tempDate;
	}
	public static TimeZone getTimeZone(String entityId) {
		if (timezoneCache.get(entityId) != null) {
			String timeZone = timezoneCache.get(entityId);
			return TimeZone.getTimeZone(timeZone);
		} else {
			return TimeZone.getTimeZone("");
		}
	}
	


	private static String getDateinTZ(Date date, String tz) throws ParseException {
		DateFormat pstFormat = new SimpleDateFormat(DEFAULT_FORMAT);
		TimeZone pstTime = TimeZone.getTimeZone(tz);
		pstFormat.setTimeZone(pstTime);
		return pstFormat.format(date);
	}
	
	
	private static List<String> getNextIntervalList(String cronExpression,
			String timeZone) throws ParseException {
		
		System.out.println("cronExpression="+cronExpression+": timeZone="+timeZone);
		Date nextInterval = null;
		List<String> list = new ArrayList<String>();
		//CronExpression exp = new CronExpression(cronExpression);
		DateFormat pstFormat = new SimpleDateFormat(DEFAULT_FORMAT);
		pstFormat.setTimeZone(TimeZone.getTimeZone("PST"));

		String output= getDateinTZ(new Date(),"America/Los_Angeles");
		System.out.println("output is ="+output);
		Date nextExecutionTime = pstFormat.parse(output);
		System.out.println("nextExecutionTime="+output);
		//nextInterval = exp.getNextValidTimeAfter(nextExecutionTime);
		System.out.println("nextInterval from API="+nextInterval);

		String nextIntervalTz= getDateinTZ(nextInterval,"America/Los_Angeles");
		System.out.println("nextIntervalTz="+nextIntervalTz);

		Date nextExecutionTimeTz = pstFormat.parse(nextIntervalTz);
		System.out.println("nextExecutionTimeTz="+nextExecutionTimeTz);

		TimeZone pstTime = TimeZone.getTimeZone(timeZone);
		pstFormat.setTimeZone(pstTime);
		list.add(pstFormat.format(nextExecutionTimeTz));

		int i = 0;
		while (i < NO_OF_INTERVALS) {
			//nextInterval = exp.getNextValidTimeAfter(nextExecutionTimeTz);
			nextIntervalTz= getDateinTZ(nextInterval,"America/Los_Angeles");
			nextExecutionTimeTz = pstFormat.parse(nextIntervalTz);
			i++;
			list.add(pstFormat.format(nextExecutionTimeTz));
		}
		System.out.println("list"+list);
		return list;

	}
 */
}
