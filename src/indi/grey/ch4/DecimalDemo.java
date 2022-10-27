package indi.grey.ch4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalDemo {

	public static void main(String[] args) {

		// short
		// int
		// long L

		// float F
		// double D

		short s = 1;
		int i = 1;
		long l = 1;
		l = 21474836471L;

		i++;

		System.out.println("i = " + i);

		Integer a = 9547;

		// new BigDecimal時建議使用string 
		BigDecimal b = new BigDecimal(a.toString());
		
		System.out.println(b.toString());
		
		// +-*/ 注意 做完運算會回傳值 要接才行
		b = b.add(BigDecimal.ONE);
		b.subtract(BigDecimal.ONE);
		b.multiply(BigDecimal.ZERO);
		
		// 遇到無窮小數會掛掉,記得用三個參數的方法
		b.divide(BigDecimal.ONE); 

		System.out.println(
			b.divide(new BigDecimal("2"),3,RoundingMode.HALF_UP  ));

	}

}
