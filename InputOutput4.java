import java.util.Scanner;

public class InputOutput4 {
public static void main (String [] args)
{
Scanner input = new Scanner (System.in);
	String nama;
	char jenisKelamin;
	int tinggiBadan;
	boolean menikah;

System.out.print("Masukkan Nama : ");
nama = input.nextLine();
System.out.print("Masukkan Jenis Kelamin : ");
jenisKelamin = input.next().charAt(0);
System.out.print("Masukkan Tinggi Badan : ");
tinggiBadan = input.nextInt();
System.out.print("Masukkan Status Menikah : ");
menikah = input.nextBoolean();
}
}