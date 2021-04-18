package Unit8Class;
/**
 * This class provides an alternate implementation of Time2 in the textbook
 * It represents the time internally as the number of seconds since midnight
 * Same public methods are provided
 * @author Lu Chen
 *
 */
public class Time2 {
	private int secondAfterMid;
	
	//Time2 constructor: hour, minute, second
	public Time2(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}else if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-60");
		}else if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-60");
		}else { //the input is valid, set the time
			secondAfterMid = hour * 3600 + minute * 60 + second;
		}
	}
	
	//no arg constructor
	public Time2() {
		this (0, 0, 0);
	}
	
	//constructor with hour
	public Time2(int hour) {
		this(hour, 0, 0);
	}
	
	//constructor with hour, minute
	public Time2(int hour, int min) {
		this(hour, min, 0);
	}
		
	//constructor with another Time object
	public Time2(Time2 time) {
		secondAfterMid = time.secondAfterMid;
	}
	
	//set hour
	public void setHour(int hour) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}else {
			//subtract the original hour, add the new one
			secondAfterMid -= getHour() * 3600;
			secondAfterMid += hour * 3600;
		}
	}	
	
	//set minute
	public void setMinute(int minute) {
		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-60");
		}else {
			secondAfterMid -= getMinute() * 60;
			secondAfterMid += minute * 60;
		}
	}
	
	//set second
	public void setSecond(int second) {
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-60");
		}else {
			secondAfterMid -= getSecond();
			secondAfterMid += second;
		}
	}
	
	//set time
	public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}else if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-60");
		}else if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-60");
		}else { //the input is valid, set time
			secondAfterMid = hour * 3600 + minute * 60 + second;
		}
	}
	
	//get hour
	public int getHour() {
		return secondAfterMid / 3600;
	}
	
	//get minute
	public int getMinute() {
		int remainder = secondAfterMid - getHour() * 3600; //get the num of second left after subtracting hour
		return remainder / 60;
	}
	
	//get second
	public int getSecond() {
		int remainder = secondAfterMid - getHour() * 3600;
		remainder -= getMinute() * 60; //get the number of second left
		return remainder;
	}
	
	//to universal string
	public String toUniversalString() {
		String str = String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
		return str;
	}
	
	//to string, overrides the method provided in Object
	public String toString() {
		int hour = (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12;
		String postFix = getHour() < 12 ? "AM" : "PM";
		String str = String.format("%02d:%02d:%02d %s", hour, getMinute(), getSecond(), postFix);
		return str;
	}
	
}
