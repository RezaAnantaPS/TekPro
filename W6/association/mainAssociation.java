package association;

import java.util.ArrayList;
import java.util.List;

public class mainAssociation {
	public static void main(String[] args) throws Exception{
		Author author = new Author();
		author.setAutname("Hiro Mashima");
		
		Manga manga1 = new Manga();
		manga1.setname("Fairy Tail");
		Manga manga2 = new Manga();
		manga2.setname("Edens Zero");
		
		List<Manga> list = new ArrayList<Manga>();
		list.add(manga1);
		list.add(manga2);
		
		author.setAuthor(list);
		
		System.out.println(author.getManga() + " merupakan manga/komik karya " + author.getAutname());
	}
}
