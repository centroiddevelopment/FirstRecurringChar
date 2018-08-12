package pkg;

import java.util.Hashtable;

public class FirstRecurringChar {

	public static void main(String[] args) {
		String testStrings[] = {"ABCA", "BCABA", "ABC", "DBCABA"};
		String tempStr = null;
		char tempChar;
		char returnChar = 0;
		Hashtable<Character, Integer> counts = new Hashtable();
		for(int i = 0; i < testStrings.length; i++) {
			System.out.println(testStrings[i]);
			tempStr = testStrings[i];
			returnChar = 0;
			for(int j = 0; j < tempStr.length(); j++) {
				tempChar = tempStr.charAt(j);
				if(counts.containsKey(tempChar)) {
					returnChar = tempChar;
					break;
				} else {
					counts.put(tempChar, 1);
				}
			}
			if(returnChar != 0) {
				System.out.println(returnChar);
			} else {
				System.out.println("null");
			}
			counts.clear();
		}
	}
}
