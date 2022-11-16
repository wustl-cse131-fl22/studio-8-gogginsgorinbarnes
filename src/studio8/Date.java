package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private String month;
	private int day;
	private int year;
	private Boolean isHoliday;
	
	/*/
	 * Creates object type "Date" given month, day (1-31), and year
	 */
	public Date(String m, int d, int y, Boolean h) {
		month = m;
		day = d;
		year = y;
		isHoliday = h;
	}
	
	/*/
	 * return string version of the date
	 */
	public String toString() {
		return (String) month + " " + day + ", " + year;
	} 
	


    public static void main(String[] args) {
    	Date today = new Date("November", 16, 2022, false);
//    	System.out.println(today.toString());
    	Date tomorrow = new Date("November", 17, 2022, false);
//    	System.out.println(tomorrow.toString());
    	Date thanksgiving = new Date("November", 24, 2022, true);
    	Date christmas = new Date("December", 31, 2022, true);
    	Date kaylasBirthday = new Date("September", 14, 2002, true);
    	Date notkaylasBirthday = new Date("September", 14, 2002, true);
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(kaylasBirthday);
    	list.add(notkaylasBirthday);
    	list.add(kaylasBirthday);
    	list.add(christmas);
    	list.add(thanksgiving);
    	list.add(tomorrow);
    	list.add(today);
    	System.out.println(list); // adds kaylas bday 3 times
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(kaylasBirthday);
    	set.add(notkaylasBirthday);
    	set.add(kaylasBirthday);
    	System.out.println(set); // only prints kaylas bday once
    	}
    

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && Objects.equals(month, other.month) && year == other.year;
	}

}
