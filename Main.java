import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String karakter;

		
		Scanner aa = new Scanner(System.in);
		System.out.println("Tekan (E) untuk membeli barang Elektronik");
		System.out.println("Tekan (M) untuk membeli Makanan");
		System.out.println("Tekan (F) untuk membeli barang Furniture");
		System.out.println("Silahkan Pilih Daftar Pembelian dan Transaksi Anda");
        karakter = aa.next();

       	Login log = new Login();
       		  log.inputlogin();


        switch(karakter)
        {
            case "E":
                Elektronik electr = new Elektronik();
		electr.inputbarang();
                break;
                
            case "M":
                Makanan mak = new Makanan();
		mak.inputmakanan();
                break;

            case "F":
                Furniture furn = new Furniture();
		furn.inputfurniture();
                break;
                
            default:
                System.out.print("Anda salah memasukan inputan");
                break;
        }
        aa.close();
        

 }
}

