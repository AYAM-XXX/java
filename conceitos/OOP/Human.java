package conceitos.OOP;

public class Human {
    String name;
    int age;
    Double weight;
    Human(String name, int age, Double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void drive(){
        System.out.println(this.name+" is driving");
    }
}
