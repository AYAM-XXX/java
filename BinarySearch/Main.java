package BinarySearch;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] numeros = { 50, 55, 66, 67, 70, 73, 74, 75, 78, 80, 85, 87, 90 };
        Scanner scanner = new Scanner(System.in);
        int search = scanner.nextInt();
            int result = Num(numeros, search);
            System.out.println(result);
            scanner.close();
    }
    public static int Num(int[] num, int item) {
        int baixo = 0;
        int alto = num.length - 1;
        int chute;
        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
             chute = num[meio];
            if (chute == item) {
                return meio;
            }
            else if ( chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
         return -1;
    }
    
}
