package mutability;

public class MutableStrings {
    public static void main(String[] args) {
        /*
        There are 2 classes used for mutable strings
        1. StringBuilder
        2. StringBuffer

        These 2 classes are exactly same except StringBuffer is thread-safe (synchronized)
        StringBuffer is slower compared to StringBuilder
         */

        StringBuilder sBuilder = new StringBuilder("Chicago");
        StringBuffer sBuffer = new StringBuffer("Miami");


        sBuilder.insert(3, "Hello");

        System.out.println(sBuilder);

        System.out.println(sBuffer.reverse());
    }
}
