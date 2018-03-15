package oop.bookstore;

public class author {
    private static String name;
//    private String name;

    public author(String name) {
        this.name = name;
    }
    private String birthDate;
    private String language;

    public author(String name, String birthDate, String language) {
        this.name = name;
        this.birthDate = birthDate;
        this.language = language;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "author{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    public static String getName() {
        return name;
    }
}
