package composition;

public class Handphone {
	private String name;
	private Spek spek;
	
	Handphone(String name, Spek spek){
		this.name = name;
		this.spek = spek;
	}

	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String toString() {
		return String.format("Merek : %s\n%s\n", this.name, this.spek);
	}
}
