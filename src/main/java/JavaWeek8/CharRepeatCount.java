package JavaWeek8;

import java.util.Scanner;

public class CharRepeatCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//Getting the input string
		System.out.println("Enter the input string:");
		String company = scan.nextLine();
		
		//Getting the input character
		System.out.println("Enter the input char:");
		char chr = scan.next().charAt(0);
		
		char[] characters = company.toCharArray();
		
		int count = 0;
		for (char compare : characters) {
			if(compare==chr) {
				count = count+1;
			}
			
		}
		System.out.println("The number of characters repeated are: "+count);

	}

}
