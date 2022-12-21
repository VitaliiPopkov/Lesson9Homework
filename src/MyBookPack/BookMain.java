package MyBookPack;

public class BookMain {
    public static void main(String[] args) {
        Author author = new Author();
        author.setFullnameOfAuthor("Taras Grigoryevich Shevchenko.");
        Title title = new Title();
        title.setNameOfBook("Kobzar.");
        Content content = new Content();
        content.setContentsOfBook("1.Perebendya, 2.Katerina, 3.Topol... ");
//        System.out.println(author.getFullnameOfAuthor() + " " + title.getNameOfBook() + " " + content.getContentsOfBook());
        author.showAuthor();
        title.showTitle();
        content.showContent();
    }

}