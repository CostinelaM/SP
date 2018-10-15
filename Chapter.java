import java.util.ArrayList;
import java.util.List;

public class Chapter {

	String titlu;
	List<SubChapter>s;
	public Chapter(String titlu){
		this.s = new ArrayList<>();
		this.titlu = titlu;
	}
	
	public int createSubChapter(String s0)
	{
		SubChapter s1 = new SubChapter(s0);
		s.add(s1);
		return s.indexOf(s1);
	}
	
	public SubChapter getSubChapter(int indexSubChapter)
	{
		return s.get(indexSubChapter);
	}
}
