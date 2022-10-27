
package indi.grey.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Main
 */
public class Regex {

	public static void main(String[] args) {
		
	

		Pattern p = Pattern.compile("(Address)+=([\\d\\w\\s]+)");

		String a ="name=Tom,Address=TW,abc=333";

		Matcher m = p.matcher(a);
		String result = m.replaceAll("TEST");
		System.out.println(result);

		String r2 = a.replaceAll("(Address)+=([\\d\\w\\s]+)", "$1=TEST");
		System.out.println(r2);

		

	
	
	}
	
}
