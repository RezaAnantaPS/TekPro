package Restaurant;

public class Restaurant {
		public static byte id=0;
		Food[] menu = new Food[10];
		public Restaurant() {
			
		}
		
		public void tambahMenuMakanan(String nama, double harga, int stok) {
			menu[id] = new Food(nama,harga,stok);
		}
		
		public void tampilMenuMakanan(){
			for(int i =0; i<= id;i++){
				if(menu[i].getstok() != 0){
					System.out.println(menu[i].getnama() +"["+menu[i].getstok()+"]"+"\tRp. "+menu[i].getharga());
				}
			}
		}
		
		public void Pemesanan(String nama, int jumlah){
			int id_temp = -1;
			for(int i = 0; i<= id;i++){
				if (nama.compareTo(menu[i].getnama()) == 0){
					id_temp = i;
				}
			}
			if(id_temp == -1){
				System.out.println("Nama Makanan tidak ditemukan!");
			}
			else if (menu[id_temp].getstok() < jumlah){
				System.out.println("Stok Makanan tidak tersedia sebanyak yang dipesan!");
			}
			else {
				System.out.println("Pemesanan Berhasil!");
				menu[id_temp].setstok(menu[id_temp].getstok()-jumlah);
			}
		}
		
		public double hitungHarga(String nama,int jumlah){
			double price = 0;
			int id_temp = -1;
			for(int i = 0; i<= id;i++){
				if (nama.compareTo(menu[i].getnama()) == 0){
					id_temp = i;
				}
			}
			if(id_temp != -1){
				price = menu[id_temp].getharga()*jumlah;
			}
			return price;
		}
		
		public void addstok(String nama,int jumlah){
			int id_temp = -1;
			for(int i = 0; i<= id;i++){
				if (nama.compareTo(menu[i].getnama()) == 0){
					id_temp = i;
				}
			}
			if(id_temp == -1){
				System.out.println("Nama Makanan tidak ditemukan!");
			}
			else{
				menu[id_temp].setstok(menu[id_temp].getstok()+jumlah);
				System.out.println("Stok berhasil ditambahkan!");
			}
		}
		
		public static void nextId(){
			id++;
		}
	}

	class Food{
		private String nama_makanan; 
		private double harga_makanan;
		private int stok;
		
		public Food(String nama, double harga, int stok){
			nama_makanan = nama;
			harga_makanan = harga;
			this.stok = stok;
		}
		
		public String getnama(){
			return nama_makanan;
		}
		public double getharga(){
			return harga_makanan;
		}
		public int getstok(){
			return stok;
		}
		public void setnama(String nama){
			nama_makanan = nama;
		}
		public void setharga(double harga){
			harga_makanan = harga;
		}
		public void setstok(int stok){
			this.stok = stok;
		}

}
