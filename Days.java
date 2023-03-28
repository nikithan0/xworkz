public class Days{
	
	NameOfDay dayName;
	static byte numberOfDays;
	String dayStartsFrom;
	byte dayOfHoliday;
	String weekend;
	char firstLetterOfDay;
    static int hoursPerDay;
	short totalHoursInAWeek;
	
	public static void main(String[] args){
	
	Days subject = new Days(NameOfDay.FRIDAY, "Sunday", (byte)1, "Saturday", 'F', (short)168);
	System.out.println(subject.dayName.Day);
	System.out.println(Days.numberOfDays);
	System.out.println(subject.dayStartsFrom);
	System.out.println(subject.dayOfHoliday);
	System.out.println(subject.weekend);
	System.out.println(subject.firstLetterOfDay);
	System.out.println(Days.hoursPerDay);
	System.out.println(subject.totalHoursInAWeek);
	}


public Days(NameOfDay dayName,String dayStartsFrom,byte dayOfHoliday,String weekend,char firstLetterOfDay,short totalHoursInAWeek){
	this.dayName = dayName;
	this.numberOfDays = numberOfDays;
	this.dayStartsFrom = dayStartsFrom;		
	this.dayOfHoliday = dayOfHoliday;
	this.weekend = weekend;
	this.firstLetterOfDay = firstLetterOfDay;
	this.hoursPerDay = hoursPerDay;
	this.totalHoursInAWeek = totalHoursInAWeek;

	}
}

enum NameOfDay{
	SUNDAY("sun"), MONDAY("mon"), TUESDAY("tuesday"), WEDNESDAY("wed"), THURSDAY("thu"), FRIDAY("fri"), SATURDAY("sat");
	 
	 String Day;
	NameOfDay(String Day){
		this.Day=Day;
	}
}	