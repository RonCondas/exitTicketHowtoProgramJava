/*Ronald Noriega-Valdeolla
 * ITSE 2371
 * 9/06/2023
 The perimeter of a rectangle is twice the rectangle’s length plus twice the rectangle's width.
  Write a program that asks for the length and width of two rectangles. 
  The program should tell the user which rectangle has the greater perimeter, or if the perimeters are the same. */

package exit_ticket;

import java.util.Scanner;

public class perimeter {

	public static void main(String[] args) {
	
		
		//1.Variables
		
		double length1 = 0; 
		
		double width1 = 0;
		
		double length2 = 0;
		
		double width2 = 0;
		
		double perimeter1 = 0;
		
		double perimeter2 = 0;
		
		// 2.Talk to the user
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("PLease enter length and width for rectangle 1 (Example 22 32)");
		
		// 3. Store
		length1 = kb.nextDouble();
		width1 = kb.nextDouble();
		
		// 2.Talk to the user
		System.out.println("PLease enter length and width for rectangle 2 (Example 22 32)");
		// 3. Store
		length2 = kb.nextDouble();
		width2 = kb.nextDouble();
		
		
		// 4. Calculation or logic
		perimeter1 =length1 * width1;
		
		perimeter2 =length2 * width2;
		// 5. Display 
		
		
		if (perimeter1 > perimeter2) {
			
			System.out.printf("Rectangle 1 has a perimeter of %.2f and is the bigest triangle.", perimeter1 );
		}else if(perimeter1 < perimeter2){
			
			System.out.printf("Rectangle 2 has a perimeter of %.2f and is the bigest triangle.", perimeter2);
			
	}else {
	
		System.out.printf("Both rectangles %.2f and %.2f have the same perimeter.", perimeter1, perimeter2);
		
	}
		
		kb.close();
		
		
		

	}

}
