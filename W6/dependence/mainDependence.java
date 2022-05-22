package dependence;

public class mainDependence {
	public static void main(String[] args) {
		Handphone apl = new Handphone("Mobile Legends");
		Person p = new Person("Reza");
		System.out.println("Aplikasi yang dibuka " + p.getname() + " : ");
		System.out.println(apl.getApl());
		p.changeApl(apl);
		System.out.println("Aplikasi yang dibuka " + p.getname() + " setelah changeApl : ");
		System.out.println(apl.getApl());
	}
}
