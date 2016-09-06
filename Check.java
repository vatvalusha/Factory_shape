package HW;

import java.util.Scanner;

public class Check {
	boolean check(Scanner scanner){
		while(!scanner.hasNextLine()){
			System.out.println("Incorrect fomal");
			System.out.println("Repeat please: ");
			scanner.next();
		}
		return true;
	}
	boolean check2(Scanner scanner){
		while(scanner.nextInt()==0){
			System.out.println("Negetive forma");
			System.out.println("Repeat please: ");
			scanner.next();
		}
		return true;
	}
}
