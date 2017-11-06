class Transaksi {
	public String no_transaksi;
	public String tgl_transaksi;
	



	public void membuat_transaksi() {
		System.out.println("Silahkan Masukkan No Transaksi Anda		: ");
		no_transaksi = input.nextLine();
		System.out.println("Silahkan Masukkan Tanggal Transaksi Anda	: ");
		tgl_transaksi = input.nextLine();
	}

	public void ubah() {
		System.out.print("Silahkan Masukkan No Transaksi yang akan di Ubah!!");
		no_transaksi = input.nextLine();
	}

	public void hapus() {
		System.out.print("Silahkan Masukkan Tanggal Transaksi yang akan di Hapus!!");
		tgl_transaksi = input.nextLine();
	}

	public boolean apakahHabis() {

		return true;
	}
}