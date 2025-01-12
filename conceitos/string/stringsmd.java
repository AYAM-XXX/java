package conceitos.string;

public class stringsmd {
    public static void main(String[] args) {
        // String halves
        String name = "ayam";
        // boolean result = name.equalsIgnoreCase("ayam"); compare 2 string and see if they are the same
        // char result = name.charAt(0); search string of index
        // int result = name.indexOf("a"); search index of string
        // boolean result = name.isEmpty();
        // String result = name.toLowerCase();
        // String result = name.toUpperCase();
        //String result = name.trim();
        String result = name.replace("a", "o");
        System.out.println(result);
    }
}
