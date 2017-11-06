class Laporan {
	public String no_lap;
	public String tgl_lap;
	public String jenis_lap;



	public void cetak() {
		this.no_lap = "9078KT";
		this.tgl_lap = "23 November 2001";
		this.jenis_lap = "keuangan";
		System.out.println(no_lap);
		System.out.println(tgl_lap);
		System.out.println(jenis_lap);
	}

	public void ubah_lap() {
		System.out.print("Silahkan Masukkan No Laporan yang akan di Ubah!!")
		no_lap = input.nextLine();
	}

	public void hapus_lap() {
		System.out.print("Silahkan Masukkan No Laporan yang akan di Hapus!!")
		no_lap = input.nextLine();
	}

	public void buat_lap() {
		this.no_lap = input.nextLine();

	}

	public boolean apakahHabis() {

		return true;
	}
}
