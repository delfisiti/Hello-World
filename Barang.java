import java.util.Scanner;
public class Barang extends Login {

	public String nama_barang;
	public String kode_barang;
	public String harga_barang;
	public String total_barang;
	public String jumlah_harga;

	public void susunbarang(){
		Login log = new Login();
		log.inputlogin();
	Scanner input = new Scanner(System.in);

 
 	System.out.print(" Kode barang : "); kode_barang = input.nextLine();
}

	public void totalbarang(){
	Scanner input = new Scanner(System.in); 
	System.out.print(" Harga Barang : "); int hb = input.nextInt();
 	System.out.print(" Total barang : "); int tb = input.nextInt();
 	System.out.print(" Total Harga : "+(hb*tb));
 	System.out.println(" ");

}

	
	

}