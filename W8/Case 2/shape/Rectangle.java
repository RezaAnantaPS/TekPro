package shape;

public class Rectangle extends Shape {
	private double width;
	private double lenght;
	
	public Rectangle() {
		super();
		this.setWidth(1.0);
		this.setLenght(1.0);
	}
	public Rectangle(double width, double lenght) {
		this.setWidth(width);
		this.setLenght(lenght);
	}
	public Rectangle(double width, double lenght, String color, boolean filled) {
		super(color,filled);
		this.setWidth(width);
		this.setLenght(lenght);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
}
