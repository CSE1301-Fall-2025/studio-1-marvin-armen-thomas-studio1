package studio1;

import java.util.Scanner;

public class leapyear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
		System.out.println("Year number?");
		int yearnumber = in.nextInt();
        boolean leapyear = (yearnumber % 4 == 0)&&(yearnumber / 100 != 0)||(yearnumber % 400 == 0);
        System.out.print(leapyear);
    }

}