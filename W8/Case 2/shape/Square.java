package shape;

public class Square extends Rectangle {
	public Square() {
		super();
	}
	public Square(double side) {
		 super(side, side); // Call superclass Rectangle(double, double)
	}
	public Square(double side, String color, boolean filled) {
		super(side,side,color,filled);
	}
	public double getSide() {
		return super.getWidth();
	}
	public void setSide(double side) {
		super.setWidth(side);
		super.setLenght(side);
	}
	public void setWidth(double side) {
		setSide(side);
	}
	public void setLenght(double side) {
		setSide(side);
	}
	public String toString() {
		return "A Square with side= " + getSide() + ", which is a subclass of " + super.toString();
	}
}
