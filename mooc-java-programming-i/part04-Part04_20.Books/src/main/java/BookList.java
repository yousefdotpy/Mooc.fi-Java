public class BookList {
    private String name;
    private int pages;
    private int publicationYear;
    public BookList(String name, int pages, int publicationYear){
        this.name = name;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }
    public String getName(){
        return this.name;
    }
    public int getPages(){
        return this.pages;
    }
    public int getPublicationYear(){
        return this.publicationYear;
    }
    @Override
    public String toString(){
        return name + ", " + pages + " pages, " + publicationYear;
    }
}
