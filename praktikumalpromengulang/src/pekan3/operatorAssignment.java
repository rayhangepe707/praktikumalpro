package pekan3;

import java.util.Scanner;

public class operatorAssignment {
	public static void main(String[] args) {
		int A1;
		int A2;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Input angka-1: ");
		A1 = keyboard.nextInt();
		System.out.print("Input angka-2: ");
		A2 = keyboard.nextInt();
		keyboard.close();
		System.out.println("Assignment penambahan ");
        A1+=A2;// penambahan. sekarang A1 = 15
        System.out.println("Penambahan : " + A1);
        System.out.println("Assignment pengurangan ");
        A1 -= A2;// pengurangan, sekarang A1 = 10
        System.out.println("Pengurangan :" + A1);
        System.out.println("Assignment perkalian ");
        A1 *= A2;// perkalian, sekarang A1 = 50
        System.out.println("Perkalian : " + A1);
        System.out.println("Assignment hasil bagi");
        A1 /= A2;// hasil bagi, sekarang A1 = 10
        System.out.println("Pembagian : " + A1);
        System.out.println("Assignment sisa bagi ");
        A1 %= A2;// sisa bagi, sekarangA1 = 0
        System.out.println("Sisa Bagi: + A1");
	         }
	}
                                   

