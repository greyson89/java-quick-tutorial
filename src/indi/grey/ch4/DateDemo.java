package indi.grey.ch4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	

	public static void main(String[] args) {
		
		Date now = new Date();

		// DEPRECATED 不建議使用 建議使用Calendar
		// now.setMonth(0); 

		Calendar c = Calendar.getInstance();

		c.setTime(now);
		System.out.println(c.toString());

		// 取得特定欄位的值 例如每月第幾天
		c.get(Calendar.DAY_OF_MONTH); // 取得月份

		// 以下三個都可以修改 但影響不同
		// c.set(Calendar.DAY_OF_MONTH, 2); 
		// c.add(Calendar.DAY_OF_MONTH, 2);
		// c.roll(Calendar.DAY_OF_MONTH, 2);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(c.getTime()));
		


	}
}
