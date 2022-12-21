package MyBookPack;

public class Author {
    private String fullnameOfAuthor;

    public Author() {
    }

//    public Author(String fullnameOfAuthor) {
//        this.fullnameOfAuthor = fullnameOfAuthor;
//    }

    public String getFullnameOfAuthor() {
        return fullnameOfAuthor;
    }

    public void setFullnameOfAuthor(String fullnameOfAuthor) {
        this.fullnameOfAuthor = fullnameOfAuthor;
    }
    public void showAuthor(){
        System.out.println(fullnameOfAuthor);
    }
}
