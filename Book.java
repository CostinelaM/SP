import java.util.List;

public class Book {
	private String title;
	private List<Author> authors = null;
	private List<Chapter> chapters;
	public Book(String title) {
		this.title=title;
	}
	
	public Book(String title, List<Author> authors) {
		this.title = title;
		this.authors = authors;
	}
	
	public Book(String title, List<Author> authors, List<Chapter> chapters) {
		this.title = title;
		this.authors = authors;
		this.chapters = chapters;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void addAuthor(Author author) {
		authors.add(author);
	}
	
	public int createChapter(String title) {
		Chapter chapter = new Chapter(title);
		chapters.add(chapter);
		return chapters.indexOf(chapter);
	}
}
