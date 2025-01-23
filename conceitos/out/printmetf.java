package conceitos.out;

public class printmetf {
    public static void main(String[] args) {
        char symbol = '@';
        Boolean bol = true;
        int num = 89;
        Double db = 7.9;
        String phr = "i love pastel";
        final int cb = 3;
        
        System.out.printf("%d ", num);
        System.out.printf("%d ", cb);
        System.out.printf("%s ", phr);
        System.out.printf("%b ", bol);
        System.out.printf("%f ", db);
        System.out.printf("%c ", symbol);
    }

}
