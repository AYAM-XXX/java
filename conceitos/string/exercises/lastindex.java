package conceitos.string.exercises;

public class lastindex {
    public static void main(String[] args) {
        String phrase = "i wish be rich";
        for (int i = 0; i < phrase.length(); i++) {
            char letter = phrase.charAt(i);
            int ind = phrase.indexOf(letter);
            System.out.println("letter: " + letter + " index: "+ ind);
        }
    }
}