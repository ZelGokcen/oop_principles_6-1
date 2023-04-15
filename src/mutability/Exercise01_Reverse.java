package mutability;

public class Exercise01_Reverse {
     /*
    Write a method that takes a String and returns it back reversed

    Hello -> olleH
    Java -> avaJ
      ->
    a  -> a
    1234 -> 4321
    Good morning -> gninrom dooG
      */

    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }


    /*
    Write a method that takes a String and returns true/false - isPalindrome
    return true if it is palindrome
    return false if it is not palindrome

    civic -> true
    madam -> true
    hello -> false
     */

    public static boolean isPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }



    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));

        System.out.println(isPalindrome("civic")); // true
        System.out.println(isPalindrome("world")); // false
    }
}
