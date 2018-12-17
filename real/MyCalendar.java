package real;

public class MyCalendar {
	public String leapYear(String year) {
		String res = "";
		int leapyear = Integer.parseInt(year);
		if(leapyear %4==0 && leapyear %100 != 0 || leapyear %400 ==0 ) {
			res = "윤년";
		}else {
			res = "평년";
		}
		return res;
		
	}
}
