package pekan6;

import java.util.*;

//	Membuat program melempar 2 dadu sampai jumlahnya 7
public class TugasPekan6 {

	public static void main(String[] args) {
		// method
		Scanner scan = new Scanner (System.in);
		Random rand = new Random();
		
		//	loop utama pengulang permainan
		while (true) { 
			//	
			int tries = 0;
			
			//	tombol mulai
			System.out.print("Siap? (iya/tidak): ");
			String answer = scan.nextLine().trim().toLowerCase();
            if (answer.equals("tidak")) {
                System.out.println("cemen banget");
                break; // Tekan "tidak" maka Keluar dari loop utama dan mengakhiri program
            }
			
            // program untuk memastikan player memasukkan inputan yang sesuai, iya/tidak
            do { 
				if (!answer.equals("iya") && !answer.equals("tidak")) { 
					System.out.print("error : input iya/tidak");
					answer = scan.nextLine().trim().toLowerCase();
				} 
			} while (!answer.equals("iya") && !answer.equals("tidak")); // Ulangi jika input bukan "iya" atau "tidak"
			
			//	algoritma dadu
			while (true) {
				tries++; //increment
				int dadu1 = rand.nextInt(6) + 1; 
				int dadu2 = rand.nextInt(6) + 1; 
				System.out.println("\n" + dadu1 + " + " + dadu2 + " = " + (dadu1 + dadu2)); //output jumlah dadu
				
				//	kondisi player menang:
				if (dadu1 + dadu2 == 7) {
					System.out.println("Menang di percobaan ke-" + tries + "!"); //jumlah percobaan
					System.out.println(tries == 1 ? "Hoki" : " Keren! "); //perbedaan output untuk yg sekali menang dan yg tidak
					break; //keluar dari loop dadu
				}

				//	lanjut meminta konfirmasi player jika kondisi diatas tidak memenuhi
				System.out.print("Kamu belum beruntung!\nacak lagi ? (iya/tidak): "); 
				
				do { // program untuk memastikan player memasukkan inputan yang sesuai
					answer = scan.nextLine().trim().toLowerCase(); // Menghilangkan spasi tambahan dan membuat huruf kecil
					if (!answer.equals("iya") && !answer.equals("tidak")) System.out.print("eror : input iya/tidak");
				} while (!answer.equals("iya") && !answer.equals("tidak")); // Ulangi jika input bukan "iya" atau "tidak"
				
				//	tombol menyerah
				if (answer.equalsIgnoreCase("tidak")) {
					System.out.println("cemen"); 
					break; //jika player menginput "tidak" maka dadu berhenti
				}
			}
			
			// konfirmasi reply
            System.out.print("\nMain lagi? (iya/tidak): ");
            String replay = scan.nextLine().trim().toLowerCase();
            if (replay.equals("tidak")) {
                System.out.println("Okay, see u next time");
                break; // Keluar dari loop utama dan mengakhiri program
            }
            do { // program untuk memastikan player memasukkan inputan yang sesuai, iya/tidak
            	if (!replay.equals("iya") && !replay.equals("tidak")) { 
            		System.out.print("eror : input iya/tidak ");
            		replay = scan.nextLine().trim().toLowerCase();
            	} 
            } while (!replay.equals("iya") && !replay.equals("tidak")); // Ulangi jika input bukan "iya" atau "tidak"
		}	
	}

}