package bukatutupjalan;

/**
 * @author Reza Ananta Permadi Supriyo
 * @since 2022-02-11
 */

import java.util.Scanner;

public class BukaTutupJalan {
	public static void main(String[] args) {
		// input plat nomor ke 4 mobil
		Scanner input = new Scanner(System.in);
		
        String a = input.nextLine();
        String[] b = a.split(" ");
        String result = "";
        // looping untuk setiap elemen di array b, dimasukan ke variable x
        for (String x : b){
            result += x;
        }
        // convert dari string ke long
        long plat = Long.parseLong(result);
        // kondisi dimana 4 mobil berhenti/jalan
        if ((plat - 999999)%5 == 0){
        	System.out.println("berhenti");
        }else {
        	System.out.println("jalan");
        }
	}
}