package indi.grey.ch1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ch1 {

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

		BigDecimal b = new BigDecimal(a.toString());
		b = b.add(BigDecimal.ONE);

		System.out.println(b.toString());

		b.subtract(BigDecimal.ONE);
		b.multiply(BigDecimal.ZERO);
		b.divide(BigDecimal.ONE);

		System.out.println(
			b.divide(new BigDecimal("2"),3,RoundingMode.HALF_UP  ));

	}

}
