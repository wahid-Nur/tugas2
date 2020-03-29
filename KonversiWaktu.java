import java.util.Scanner;
public class KonversiWaktu{

	public static void main (String[] args){	
	Scanner input = new Scanner(System.in);
	int detik, menit, jam, sisa1, sisa2;
		System.out.println("Masukkan besaran detik : "); 
	detik = input.nextInt();

	jam = detik/3600;
	sisa1 = detik%3600;

	menit = (int) sisa1/60;
	sisa2 = sisa1%60;

		System.out.println("Hasil Konversi : " + detik + " Detik = " + jam + " Jam : " + menit + " Menit : " + sisa2 + " Detik");
	}
}