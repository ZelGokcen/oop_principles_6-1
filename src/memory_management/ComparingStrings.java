package memory_management;

public class ComparingStrings {
    public static void main(String[] args) {

        System.out.println("\n-------------------\n");
        String s1 = "Hello";
        String s2 = "Hello";

        //From above lines only one string object is created in the String Pool

        System.out.println(s1 == s2); // true  [String@12242 vs [String@12242
        System.out.println(s1.equals(s2)); // true Hello vs Hello


        System.out.println("\n-------------------\n");
        String str1 = new String("World");
        String str2 = "World";

        System.out.println(str1); // World
        System.out.println(str2); // World

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true
    }
}
