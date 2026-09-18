public class languages {
    String languages;

    Main(String lang) {
        languages = lang;
        System.out.println(languages + " Programming Lanugage");
    }

    public static void main(String[] args) {
        Main obj1 = new Main("Java");
        Main obj2 = new Main("Python");
        Main obj3 = new Main("C");
    }
}
