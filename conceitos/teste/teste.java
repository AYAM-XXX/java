package conceitos.teste;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 1;
        
        Double breadth = scanner.nextDouble();
        Double height = scanner.nextDouble();
        
        if(breadth < 0 || height < 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(breadth * height);
        }
        scanner.close();
}
}
