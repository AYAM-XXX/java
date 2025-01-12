package conceitos.methods;

import java.util.Scanner;

public class firstmethods {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int x = scanner.nextInt();

        System.out.println("Enter a value: ");
        int y = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        
        welcome(name);
        System.out.println(add(x, y));
        scanner.close();
        }

        static int add(int n1, int n2){
            return n1 + n2;
        }
        static void welcome (String name){
            System.out.println("Welcome " + name);
        }

        
}