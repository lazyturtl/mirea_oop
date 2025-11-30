public class class_1 {
    public static void main(String[] args) {
        Author author = new Author();
        Author author1 = new Author("Толстой Лев Николаевич");
        Author author2 = new Author("Джордж Байрон", "jbayron@dmail.com", 'm', 36);
        System.out.println("\nАвтор " + author2);
        author.setName("Марк Твен");
        author.setAge(50);
        author.setEmail("mark@gmail.com");
        author.setGender('M');
        System.out.println("\nМой любимый автор " + author.getName());
    }
}
