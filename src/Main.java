public class Main {
    public static void main(String[] args) {
        Author authorHP = new Author("Joanne", "Rowling");
        System.out.println("Фаммилия автора - " + authorHP.getSecondName() + ".");
        System.out.println("Полное имя автора - " + authorHP + ".");
        Book harryPotter = new Book(authorHP, "Harry Potter", 1999);
        System.out.println("Автор Гарри Поттера -  " + harryPotter.getAuthor() + ".");

        Author authorTG = new Author("Dmitriy",  "Emec");
        Book tanyaGrotter = new Book(authorTG, "Tanya Grotter", 2002);
        System.out.println("Таня Гроттер. Год публикациии - " + tanyaGrotter.getYearOfPublication() + ".");
        tanyaGrotter.setYearOfPublication(2009);
        System.out.println("Таня Гроттер. Год публикациии - " + tanyaGrotter.getYearOfPublication() + ".");
        System.out.println("Информация о книге Таня Гроттер: " + tanyaGrotter);
    }
}