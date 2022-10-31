package javaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		String str = "My 7phone8 number9 is 123456543";
		StringBuffer num = new StringBuffer();
		ArrayList<Character> arrint = new ArrayList<>();
		for (int i = 0; i <= str.length() - 1; i++) {
			if (Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));
			}
		}
		for (int i = 0; i <= num.length() - 1; i++) {
			arrint.add(num.charAt(i));
		}
		Collections.sort(arrint, Collections.reverseOrder());
		System.out.println(arrint + " Third largest number is " + arrint.get(2));
	}
}
