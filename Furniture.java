import java.util.Scanner;
public class Furniture extends Barang{

	public String nama_barang;
	public String merk;
	public String jenis;
	public String size;
	public String nam_adm;
	public String no_fktur;
	public String kode_adm;

	public void inputfurniture()
	{


	Scanner masuk = new Scanner(System.in);
	System.out.println("==============================");
	System.out.println("Input Barang Furniture");
 	System.out.println(" Nama Barang : "); nama_barang = masuk.nextLine();
 	System.out.println(" merk : "); merk = masuk.nextLine();
 	System.out.println(" Ukuran : "); size = masuk.nextLine();
 	System.out.println(" Jenis Barang : "); jenis= masuk.nextLine();
 	System.out.println("==============================");
 	System.out.println(" Faktur Transaksi Anda ");
 	System.out.println(" No Faktur : "); no_fktur = masuk.nextLine();
 	System.out.println("Nama Admin : Siti Delfi Nurhuda"); nam_adm = masuk.nextLine();
 	System.out.println("Kode Admin : 15111099"); kode_adm = masuk.nextLine();
 	System.out.println("Nama Barang :"+ nama_barang);
 	System.out.println("Merk :"+ merk);
 	System.out.println("Jenis :"+ jenis);
 	System.out.println("Size :"+ size); 
 	
 	
	}

	

	public static void main(String[] args) {

		Furniture cal = new Furniture();
		cal.susunbarang();
		cal.inputfurniture();
		cal.totalbarang();
	}

}