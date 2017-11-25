import java.util.Scanner;
public class Elektronik extends Barang{

	public String namabarang;
	public String Kd_barang;
	public String type;
	public String merk;
	public String no_faktur;
	public String nm_adm;
	public String kode_adm;

	public void inputbarang()
	{


	Scanner input = new Scanner(System.in);
	System.out.println("==============================");
	System.out.println("Input Barang Elektronik");
	System.out.println("Kode Barang : "); Kd_barang = input.nextLine();
 	System.out.println(" Nama Barang : "); namabarang = input.nextLine();
 	System.out.println(" type : "); type = input.nextLine();
 	System.out.println(" merk : "); merk = input.nextLine();
 	System.out.println("==============================");
	System.out.println(" Faktur Transaksi Anda ");
 	System.out.println(" No Faktur : "); no_faktur = input.nextLine();
 	System.out.println("Nama Admin : Siti Delfi Nurhuda"); nm_adm = input.nextLine();
 	System.out.println("Kode Admin : 15111099"); kode_adm = input.nextLine();
 	System.out.println(" KOde Barang : "+ Kd_barang);
 	System.out.println("Nama Barang :"+ namabarang);
 	System.out.println("Type :"+ type);
 	System.out.println("Merek :"+ merk);

 	
	}

	
		public static void main(String[] args) {
		Elektronik nik = new Elektronik();
		nik.susunbarang();
		nik.inputbarang();
		nik.totalbarang();

		}



	
	

}