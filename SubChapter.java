import java.util.ArrayList;
import java.util.List;

public class SubChapter {

	String titlu;
	List<Paragraph> p;
	List<Image> i;
	List<Table> t;
	
	public SubChapter(String titlu)
	{
		this.p = new ArrayList<>();
		this.i = new ArrayList<>();
		this.t = new ArrayList<>();
		this.titlu = titlu;
	}
	
	public void createNewParagraph(String s)
	{
		Paragraph p0 = new Paragraph(s);
		p.add(p0);

	}
	
	public void createNewImage(String s)
	{
		Image i0 = new Image(s);
		i.add(i0);
	}
	
	public void createNewTabel(String s)
	{
		Table t0 = new Table(s);
		t.add(t0);
	}
}


