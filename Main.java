
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book discoTitanic = new Book("Disco Titanic");
		Author rpGheo = new Author("Radu Pavel Gheo");
		
		discoTitanic.addAuthor(rpGheo);
		int indexChapterOne = discoTitanic.createChapter("Capiton 1");
		Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
		int indexSubChapterOneOne = chp1.createSubChapter("SubCapitolul 1.1");
		SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
		scOneOne.createNewParagraph("Paragraph 1 ");
		scOneOne.createNewParagraph("Paragraph 2 ");
		scOneOne.createNewParagraph("Paragraph 3 ");
		scOneOne.createNewImage("Image 1 ");
		scOneOne.createNewParagraph("Paragraph 4 ");
		scOneOne.createNewTabel("Tabel 1 ");
		scOneOne.createNewParagraph("Paragraph 5");
		
		discoTitanic.print();

	}

}
