package shape;

public class TestShape {
	public static void main(String[] args) {
		Shape a = new Shape();
		Shape b = new Shape("blue", false);
		a.setColor("Purple");
		System.out.println(a.toString());
		if(b.isFilled()) {
			System.out.println(b.toString());
		}
		b.setFilled(true);
		if(b.isFilled()) {
			System.out.println(b.toString());
		}
	}
}
