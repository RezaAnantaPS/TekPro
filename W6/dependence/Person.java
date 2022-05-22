package dependence;

public class Person {
	private String name;
	
	Person(String name){
		this.name = name;
	}
	public String getname() {
		return name;
	}
	
	public void changeApl (Handphone apl) {
		apl.setApl("PuBG");
	}
}
