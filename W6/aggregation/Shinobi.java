package aggregation;

public class Shinobi {
	private String name;
	private String clan;
	private String rank;
	
	public Shinobi(String name, String clan, String rank) {
		this.name = name;
		this.clan = clan;
		this.rank = rank;
	}
	
	public String getname() {
		return name;
	}
	
	public String getclan() {
		return clan;
	}
	
	public String getrank() {
		return rank;
	}
}
