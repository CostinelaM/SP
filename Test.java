
public class Test {
	public static void main(String []args) {
		Book myBook = new Book ("Disco Titanic");
		Author gheo = new Author ("Radu Pavel Gheo");
		myBook.addAuthor(gheo);
		int indexChapterOne = myBook.createChapter("Capitol_1");
		int indexSubChapterOne = myBook.createSubChapter(indexChapterOne, "SubChapter_1");
		Text textOneOne = myBook.createText(indexChapterOne, indexSubChapterOne, "My First Paragraph");
	}
}
