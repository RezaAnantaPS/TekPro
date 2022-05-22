package composition;

public class mainComposition {
	public static void main(String[] args) {
		System.out.println("Spesifikasi Handphone");
		Spek spek = new Spek(11, 16, "Snapdragon 888 5G");
		Handphone hp = new Handphone("ASUS ROG Phone 5",spek);
		System.out.println(hp);
		
		Spek spek1 = new Spek(11, 16, "Samsung Exynos 2100");
		Handphone hp1 = new Handphone("Samsung Galaxy S21 Ultra 5G",spek1);
		System.out.println(hp1);
	}
}
