import java.util.ArrayList;
import java.util.List;

public class Book {
	
	String titlu;
	List<Author> a;
	List<Chapter> c;
	public Book(String titlu){
		this.a = new ArrayList<>();
		this.c = new ArrayList<>();
		this.titlu = titlu;
	}
	
	public void addAuthor(Author a1){
		a.add(a1);
	}
	
	public int createChapter(String chp){
		Chapter c0 = new Chapter(chp);
		c.add(c0);
		return c.indexOf(c0);
	}
	
	public Chapter getChapter(int indexChapter){
		return c.get(indexChapter);
	}
	
	public void print(){
		System.out.println(titlu);
		System.out.println("Authors: ");
		for(Author auth:a){
			auth.print(a);
		}
	}
}
