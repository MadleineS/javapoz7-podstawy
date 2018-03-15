package oop.bookstore;

public class book {
    private String title;
    private String desciption;
    private int releaseYear;
    private String publisher;


    public book(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }


    public String setPublisher() {
        return publisher;
    }

    public String getPublisher() {
        return publisher;

    }

    public String getAutorName() {
        return getAutorName() !=null? author.getName():null;
}
    public String getName(){
        return getName().toUpperCase();
    }
    public String getDesciption() {
        return desciption;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
