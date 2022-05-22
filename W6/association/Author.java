package association;

import java.util.List;

public class Author {
	private String Autname;
	List<Manga> manga;
	
	public String getAutname() {
		return Autname;
	}
	
	public void setAutname(String Aut) {
		this.Autname = Aut;
	}
	
	public List<Manga> getManga(){
		return manga;
	}
	
	public void setAuthor(List<Manga> manga) {
		this.manga = manga;
	}
}
