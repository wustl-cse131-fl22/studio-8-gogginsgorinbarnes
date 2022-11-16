package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;


public class Appointment {
	private Date date;
	private Time time;

	public Appointment(Time t, Date d) {
		d = date;
		t = time;
	}
	public static void main(String[] args) {
		//creating times
    	Time time = new Time(12, 43, true);
		Time time2 = new Time(12, 03, true);
		Time time3 = new Time(12, 03, true);
		Time time4 = new Time(14, 03, false);
		Time time5 = new Time(14, 53, false);
		
		//creating dates
    	Date today = new Date("November", 16, 2022, false);
    	Date tomorrow = new Date("November", 17, 2022, false);
    	Date thanksgiving = new Date("November", 24, 2022, true);
    	Date christmas = new Date("December", 31, 2022, true);
    	Date kaylasBirthday = new Date("September", 14, 2002, true);
    	Date notkaylasBirthday = new Date("September", 14, 2002, true);
    	
    	//creating appointments
    	Appointment hair = new Appointment(time2, kaylasBirthday);
    	Appointment ultrasound = new Appointment(time3, kaylasBirthday);
    	Appointment sitOnSantasLap = new Appointment(time5, christmas);
    	
    	HashSet<Appointment> set = new HashSet<Appointment>();
    	set.add(hair);
    	set.add(ultrasound);
    	set.add(sitOnSantasLap);
    	

	}
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

}
