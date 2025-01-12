package conceitos.WhileAndFor;

public class ForApp {
    public static void main(String[] args) {
        for (int coluna = 0; coluna < 4; coluna++) {
            for (int linha = 0; linha < 4; linha++) {
                if (linha < 4) {
                    if ((coluna > 0 && coluna < 3) && (linha > 0 && linha < 3)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }

                }
            }
            System.out.println();

        }
    }
}
