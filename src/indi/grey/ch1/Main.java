package indi.grey.ch1;

import java.util.Calendar;
import java.util.Date;

public class Main {
	

	public static void main(String[] args) {
		
		System.out.println(User.getCountry());
		System.out.println("\\/ \n");
		System.out.printf("String is %s Number is %d\n", "abc",123);
		// System.out.println();
		System.out.println("end");


		// User bob = new User("bob",10);
		
		// bob.setName("Name");
		// bob.setAge(10);
		// System.out.println(bob.toString());

		// User adam = new User();
		// adam.setName("Adam");
		// adam.setAge(10);
		
		// System.out.println(adam.toString());


		Date d = new Date();

		Calendar c = Calendar.getInstance();
		


		int temp = 10;

		LOOP_1:
		for (int i = 0; i < temp; i++) {
			LOOP_2:
			for (int j = 0; j < temp; j++) {
				
				System.out.println("abc");
				if(j==i){
					break LOOP_1;
					// continue;
				}
			}
		}


		StringBuilder sb = new StringBuilder();

		String a = "123"+"456"+"67889";

		sb.append("123");
		sb.append("bxx\n");

		// error >0
		if (sb.length()>0 ){
			// send error message
			System.out.println(sb.toString());	
		}

		// System.out.println(sb.toString());


	}
}
