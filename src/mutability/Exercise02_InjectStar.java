package mutability;

public class Exercise02_InjectStar {
    /*
    Create a method that takes a String and returns a String
    if the given String have even length and length is at least 2, then insert * at the middle of the String
    aa -> a*a
    java -> ja*va
    toyota -> toy*ota


    if the given String has odd length and length is at least 3, then insert * before and after the middle character
    aaa -> a*a*a
    hello -> he*l*lo


    ""          -> ""
    "a"         -> ""
    "aa"        -> "a*a"
    "aaa"       -> "a*a*a"
    "aaaaa"     -> "aa*a*aa"
    "aaaaaaa"   -> "aaa*a*aaa"

                       0-2             2
     aaaa           -> aa       *       aa

                        0-3             3               4
     aaaaaaa        -> aaa      *       a       *       aaa

     */

    public static String injectStar(String str){
        if(str.length() <= 1) return "";
        else if(str.length() % 2 == 0) return new StringBuilder(str).insert(str.length()/2, "*").toString();
        return new StringBuilder(str).insert(str.length()/2, "*").insert(str.length()/2+2, "*").toString();
    }

    public static void main(String[] args) {
        System.out.println(injectStar("aaaa"));
        System.out.println(injectStar("aaaaa"));
    }
}
