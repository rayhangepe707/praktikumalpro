package pekan6;

import java.util.Scanner;

public class PerulanganWhile1 {

	public static void main(String[] args) {
		
		int counter = 0;
		String jawab;
		boolean running = true;
		//deklarasi scanner
		Scanner scan = new Scanner(System.in);
		while(running) {
			counter++;
			System.out.println("Jumlah = " + counter);
			System.out.print("Apakah lanjut  (Ya / Tidak ?)");
			jawab = scan.nextLine();
			//cek jawab = tidak, perulangan berhenti
			if (jawab.equalsIgnoreCase("tidak")) {
				running = false;
			}
		}scan.close(); 
	
		System.out.println("Anda sudah melakukan perulangan sebanyak " +counter + " kali");

	}

}