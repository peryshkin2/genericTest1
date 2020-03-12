package test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class IntegerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		
		try {
			//int c = Math.addExact(a,b);
			Exception c = null;
			System.out.println(c);
		
			LocalDateTime now = LocalDateTime.now(); // 1
			System.out.println(now.toLocalTime());
			
			Calendar cal = Calendar.getInstance();
			System.out.println(cal.getTime());  // 2
			
			System.out.println(new Date()); // 3
			
			Calendar cc =  Calendar.getInstance(); // 4
			cc.setTime(new Date());
			System.out.println(cc.getTime());
			
		
			SimpleDateFormat form2 = new SimpleDateFormat("dd-MMM-yyyy");
			System.out.println(form2.parseObject("02-03-2015"));
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		} catch ( ParseException ex) {
			ex.printStackTrace();
	}
	}
}
