package conceitos.arrays;

public class arrays2d {
    public static void main(String[] args) {
        String cars[][] = {{"camary", "corolla", "supra"},
                            {"mustang", "focus", "Branco",},
                            {"Corvette", "Silverado", "equinox"}};
        
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
    
}
