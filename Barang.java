class Barang {
	public String kode_barang;
	public String nama_barang;
	public String harga_barang;
	public String jumlah;
	public String supplier;



	public void tambah() {
		System.out.print("Masukkan Kode Barang  	: ");
		kode_barang = input.nextLine();
		System.out.print("Masukkan Kama Barang  	: ");
		nama_barang = input.nextLine();
		System.out.print("Masukkan Harga Barang  	: ");
		harga_barang = input.nextLine();
		System.out.print("Jumlah  	: ");
		jumlah = input.nextLine();
		System.out.print("Masukkan Supplier  	: ");
		supplier = input.nextLine();

	}

	public void ubah() {
		System.out.print("Silahkan Masukkan Kode Barang yang akan di Ubah!!")
		kode_barang = input.nextLine();
	}

	public void hapus() {
		System.out.print("Silahkan Masukkan Kode Barang yang akan di Hapus!!")
		kode_barang = input.nextLine();

	}

	public void return() {
		System.out.print("Silahkan Masukkan Kode Barang yang akan di Return!!")
		kode_barang = input.nextLine();

	}

	public boolean apakahHabis() {

		return true;
	}
}