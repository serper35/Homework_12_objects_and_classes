public class Main {
    public static void main(String[] args) {
        Author authorHP = new Author("Joanne", "Rowling");
        System.out.println("authorHP.getSecondName() = " + authorHP.getSecondName());
        System.out.println("authorHP.toString() = " + authorHP.toString());
        Book harryPotter = new Book(authorHP, "Harry Potter", 1999);
        System.out.println("harryPotter.getAuthor() = " + harryPotter.getAuthor());

        Author authorTG = new Author("Dmitriy",  "Emec");
        Book tanyaGrotter = new Book(authorTG, "TanyaGrotter", 2002);
        System.out.println("Tanya Grotter year of publication - " + tanyaGrotter.getYearOfPublication());
        tanyaGrotter.setYearOfPublication(2009);
        System.out.println("Tanya Grotter year of publication - " + tanyaGrotter.getYearOfPublication());
        System.out.println("tanyaGrotter = " + tanyaGrotter);
    }
}