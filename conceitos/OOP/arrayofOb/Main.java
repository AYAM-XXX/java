package conceitos.OOP.arrayofOb;

public class Main {
    public static void main(String[] args) {
        Food food1 = new Food("pastel");
        Food food2 = new Food("coxinha");
        Food food3 = new Food("goiaba");
        Food[] refrigerator = {food1, food2, food3};

        System.out.println(refrigerator[0].name);
    }
}
