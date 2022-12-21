package MyBookPack;

public class Content {
    private String contentsOfBook;

    public Content() {
    }

//    public Content(String contentsOfBook) {
//        this.contentsOfBook = contentsOfBook;
//    }

    public String getContentsOfBook() {
        return contentsOfBook;
    }

    public void setContentsOfBook(String contentsOfBook) {
        this.contentsOfBook = contentsOfBook;
    }
    public void showContent(){
        System.out.println(contentsOfBook);
    }
}
