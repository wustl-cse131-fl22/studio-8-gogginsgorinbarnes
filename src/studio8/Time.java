package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {
	private int hour;
	private int min;
	private Boolean isMilitary;
	
	/**
	 * @param h - hours
	 * @param m - minutes
	 * @param M - isMilitary
	 */
	public Time(int h, int m, Boolean M) {
		if (M==false && h>12){
			hour = h-12;
		}
		else {
			hour = h;
		}
		min = m;
	}
	
	public String toString() {
		if (min<10) {
			return hour + ":0" + min;
		}
		else {
			return hour + ":" + min;
		}
	}

	public static void main(String[] args) {
    	Time time = new Time(12, 43, true);
		Time time2 = new Time(12, 03, true);
		Time time3 = new Time(12, 03, true);
		Time time4 = new Time(14, 03, false);
		Time time5 = new Time(14, 53, false);
		LinkedList<Time> list = new LinkedList<Time>();
		list.add(time);
		list.add(time2);
		list.add(time3);
		list.add(time4);
		list.add(time5);
		System.out.println(list);
		
		HashSet<Time> set = new HashSet<Time>();
		set.add(time);
		set.add(time2);
		set.add(time3);
		set.add(time4);
		set.add(time5);
		System.out.println(set);
		
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, isMilitary, min);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && Objects.equals(isMilitary, other.isMilitary) && min == other.min;
	}

}