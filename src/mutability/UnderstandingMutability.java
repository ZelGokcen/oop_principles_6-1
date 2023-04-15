package mutability;

public class UnderstandingMutability {
    public static void main(String[] args) {
        /*
        We do this discussion for objects
        Mutable: can change
        Immutable: cannot be changed

        String is immutable
        StringBuilder of StringBuffer are mutable
         */

        String city = "Chicago";

        city = "Miami";


        StringBuilder address = new StringBuilder("Evanston");

        address = new StringBuilder("Des Plaines");

        System.out.println(city);
        System.out.println(address);


        String name = "Sandina";

        /*
        String reversed = "";
        "a"
        "an"
        "ani"
        "anid"
        "anidn"
        "anidna"
        "anidnaS"


       StringBuilder rev = new StringBuilder("");
       "anidnaS"

        */

        StringBuilder reversed = new StringBuilder();

        for (int i = name.length()-1; i >= 0; i--) {
            reversed.append(name.charAt(i));
        }

        System.out.println(reversed);

        if(name.equals(reversed)) System.out.println("Palindrome");
        else System.out.println("Not palindrome");

    }
}
