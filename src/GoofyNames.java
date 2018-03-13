/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
String b=JOptionPane.showInputDialog("Type in your name");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.

goofyName.toUpperCase();
		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
for(int i=0;i<b.length();i++){
	char d= b.charAt(i);
	System.out.println(d);
			// 4. Create a String variable to store the next character of the name
			String o=""+b.charAt(i);
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.
if(i%2==0) {
	goofyName+= o.toLowerCase();
}else{
	goofyName+= o.toUpperCase();
}
			
			// 6. ADD this String  (containing 1 char) to the goofyName String




}
	
		// 7. Use pop-up to show user their Goofy name
JOptionPane.showMessageDialog(null, goofyName);

	}
}

