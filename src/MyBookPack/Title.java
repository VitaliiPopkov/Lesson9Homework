package MyBookPack;

public class Title {
    private String nameOfBook;

    public Title() {
    }

//    public Title(String nameOfBook) {
//        this.nameOfBook = nameOfBook;
//    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }
    public void showTitle(){
        System.out.println(nameOfBook);
    }
}
