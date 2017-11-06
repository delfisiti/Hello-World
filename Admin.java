class Admin {
	public String nama_admin;
	public String alamat_admin;
	


	public void input_admin() {
		System.out.println("Masukkan Nama Admin  	: ");
		nama_admin = input.nextLine();
		System.out.println("Masukkan Alamat Admin  	: ");
		alamat_admin = input.nextLine();

	}

	public void update_admin() {
		System.out.print("Silahkan Masukkan Nama Admin yang akan di Update!!");
		nama_admin = input.nextLine();

	}

	public void hapus_admin()  {
		System.out.print("Silahkan Masukkan Nama Admin yang akan di Hapus!!");
		nama_admin = input.nextLine();

	}

	public boolean apakahHabis() {

		return true;
	}
}