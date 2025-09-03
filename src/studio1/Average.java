package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
		System.out.println("Value for the first of the two numbers that need to be averaged");
		int n1 = in.nextInt();
        System.out.println("Value for the second of the two numbers that need to be averaged");
        int n2 = in.nextInt();

        double isAveraged = (n1 + n2) / 2.0;

        System.out.println(isAveraged);

    }

}