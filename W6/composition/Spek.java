package composition;

public class Spek {
	private int Android;
	private int RAM;
	private String Chipset;
	
	Spek(int Android, int RAM, String Chipset){
		this.Android = Android;
		this.RAM = RAM;
		this.Chipset = Chipset;
	}
	public String toString() {
		return String.format("Android : %s\nRAM : %d GB\nChipset : %s", this.Android, this.RAM, this.Chipset);
	}
}
