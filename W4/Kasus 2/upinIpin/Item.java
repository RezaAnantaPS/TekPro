package upinIpin;

public class Item {
	private String name;
	// constructor private yang digunakan untuk mengubah name menjadi "ipin"
	private Item() {
	name = "Ipin";
	}
	public Item(String name) { 
	this();// untuk memanggil constructor
	System.out.println(this.name);
	}
}
