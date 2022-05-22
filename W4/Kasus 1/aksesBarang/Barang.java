package aksesBarang;

public class Barang {
		String kode_barang;
		String nama_barang;
		private int stok; // stok menggunakan modifier private agar tidak bisa dimanipulasi langsung dari luar
		public Barang(String kode, String nama, int stk) { 
		kode_barang = kode;
		nama_barang = nama; 
		stok = stk;
		}
		public int getStok() {
			return stok;
		}
		// method untuk penambahan stok
		public void addStok(int stokBarang) {
			this.stok += stokBarang;
		}
}
