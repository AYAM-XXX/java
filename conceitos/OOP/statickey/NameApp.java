package conceitos.OOP.statickey;

public class NameApp {
    String name;
    static int countName = 0;
    NameApp(String name){
        this.name = name;
        countName++;
    }

}
