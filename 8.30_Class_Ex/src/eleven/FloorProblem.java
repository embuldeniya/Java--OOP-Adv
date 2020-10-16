package eleven;

import java.util.Scanner;

public class FloorProblem {
	
	private static void floorTravesal(String pattern) {
				
		//Initial position 
		int pos = 1 ;
		int ground = 1;
		for (int i = 0; i < pattern.length()-1 ; i++) {
			
			if (pattern.charAt(i)== '^') {
				pos++;
			}
			else {
				pos--;				
			}
			/*else if (pattern.charAt(i) == 'v' ) {
				pos -=1;
			}*/
			if (pos == 1) {
				ground++;
			}
		}
		System.out.println("Target Floor is: "+ pos + " Ground Floor Visits: " + ground);
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the pattern");
		String pattern = scan.nextLine();
		
		floorTravesal(pattern);
		
		scan.close();
	}
}
