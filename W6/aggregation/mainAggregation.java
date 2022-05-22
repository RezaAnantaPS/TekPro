package aggregation;

public class mainAggregation {
	public static void main(String[] args) {
		Village vill = new Village("Konoha", "Hokage");
		
		Shinobi shinobi1 = new Shinobi("Naruto", "Uzumaki", "Genin");
		Shinobi shinobi2 = new Shinobi("Sasuke", "Uchiha", "Genin");
		Shinobi shinobi3 = new Shinobi("Sakura", "Haruno", "Jonin");
		Shinobi shinobi4 = new Shinobi("Kakashi", "Hatake", "Jonin");
		
		System.out.println("Desa " + vill.getname() + " yang dipimpin oleh " + vill.getgokage() + " memiliki sejumlah shinobi yaitu: ");
		System.out.println(" - " + shinobi1.getname() + " dari klan " + shinobi1.getclan() + " yang merupakan ninja tingkat " + shinobi1.getrank());
		System.out.println(" - " + shinobi2.getname() + " dari klan " + shinobi2.getclan() + " yang merupakan ninja tingkat " + shinobi2.getrank());
		System.out.println(" - " + shinobi3.getname() + " dari klan " + shinobi3.getclan() + " yang merupakan ninja tingkat " + shinobi3.getrank());
		System.out.println(" - " + shinobi4.getname() + " dari klan " + shinobi4.getclan() + " yang merupakan ninja tingkat " + shinobi4.getrank());
	}
}
