import java.util.Scanner;
public class BiodataSaya {

    public static void main(String[] args) {
       
        String nama, nim, jurusan, fakultas ;    
       
	Scanner input = new Scanner(System.in);
		System.out.println("Identitas Saya");
        	System.out.print("Nama	: ");
        nama = input.nextLine();
        	System.out.print("Nim     : ");
        nim = input.nextLine();
        	System.out.print("Jurusan : ");
        jurusan = input.nextLine();
        	System.out.print("Fakultas: ");
        fakultas = input.nextLine();
      
	System.out.println("------------------------------");
        System.out.println("Nama    : " + nama);
        System.out.println("Nim     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Fakultas: " + fakultas);
    }

}