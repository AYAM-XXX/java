package conceitos.out;
import java.util.Scanner;

class teste {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What your name?: ");
        String name = scanner.nextLine();
        System.out.println("How old are u?: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // i need use nextline after using int 
        System.out.println("what your favorite food?: ");
        String food = scanner.nextLine();
        System.out.println("name: "+ name + "\nidade: " + idade + "\nfavorite food: " + food);
    }
}