package conceitos.OOP.statickey;

public class Main {
    public static void main(String[] args) {
        NameApp name_one = new NameApp("ayam");
        NameApp name_two = new NameApp("kaio");
        System.out.println(NameApp.countName);
    }
}
