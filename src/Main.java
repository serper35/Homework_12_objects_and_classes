public class Main {
    public static void main(String[] args) {
        Author authorHP = new Author("Joanne", "Rowling");
        System.out.println("Фаммилия автора - " + authorHP.getSecondName() + ".");
        System.out.println("Полное имя автора - " + authorHP + ".");
        Book harryPotter = new Book(authorHP, "Harry Potter", 1999);
        Book harryPotter2 = new Book(authorHP, "Harry Potter", 1999);
        System.out.println("Автор Гарри Поттера -  " + harryPotter.getAuthor() + ".");

        Author authorTG = new Author("Dmitriy",  "Emec");
        Author authorTG2 = new Author("Dmitriy",  "Emec");
        Book tanyaGrotter = new Book(authorTG, "Tanya Grotter", 2002);
        Book tanyaGrotter2 = new Book(authorTG, "Tanya Grotter", 2002);
        System.out.println("Таня Гроттер. Год публикациии - " + tanyaGrotter.getYearOfPublication() + ".");
        tanyaGrotter.setYearOfPublication(2009);
        System.out.println("Таня Гроттер. Год публикациии - " + tanyaGrotter.getYearOfPublication() + ".");
        System.out.println("Информация о книге Таня Гроттер: " + tanyaGrotter);

        System.out.println("tanyaGrotter.equals(tanyaGrotter2) = " + tanyaGrotter.equals(tanyaGrotter2));

        boolean titles = tanyaGrotter.getTitle().equals(tanyaGrotter2.getTitle());
        System.out.println("titles = " + titles);

        boolean authors = authorTG.equals(authorTG2);
        System.out.println("Authors = " + authors);

        System.out.println("authorTG.hashCode() = " + authorTG.hashCode());
        System.out.println("authorTG2.hashCode() = " + authorTG2.hashCode());

        System.out.println("tanyaGrotter2.hashCode() = " + tanyaGrotter2.hashCode());
        System.out.println("tanyaGrotter.hashCode() = " + tanyaGrotter.hashCode());
        System.out.println("harryPotter.hashCode() = " + harryPotter.hashCode());
    }
}