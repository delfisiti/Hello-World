import java.util.Scanner;
public class Makanan extends Barang{

	public String nama_makanan;
	public String berat;
	public String rasa;
	public String exp;
	public String no_fktr;
	public String nm_adm;
	public String kode_adm;

	public void inputmakanan()
	{


	Scanner masuk = new Scanner(System.in);
	System.out.println("==============================");
	System.out.println("Input Data Makanan");
 	System.out.println(" Nama Makanan : "); nama_makanan = masuk.nextLine();
 	System.out.println(" Berat : "); berat = masuk.nextLine();
 	System.out.println(" Expired : "); exp = masuk.nextLine();
 	System.out.println(" Rasa : "); rasa = masuk.nextLine();
 	System.out.println("==============================");
	System.out.println(" Faktur Transaksi Anda ");
 	System.out.println(" No Faktur : "); no_fktr = masuk.nextLine();
 	System.out.println("Nama Admin : Siti Delfi Nurhuda"); nm_adm = masuk.nextLine();
 	System.out.println("Kode Admin : 15111099"); kode_adm = masuk.nextLine();
 	System.out.println("Nama Makanan :"+ nama_makanan);
 	System.out.println("Beras Makanan :"+ berat);
 	System.out.println("Rasa :"+ rasa);
 	System.out.println("Expired :"+ exp);
 	
	}


	public static void main(String[] args) {
		Makanan cal = new Makanan();
		cal.susunbarang();
		cal.inputmakanan();
		cal.totalbarang();
	

	}
}