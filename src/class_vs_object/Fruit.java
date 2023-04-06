package class_vs_object;

public class Fruit {

    public final boolean hasColor = true;
    public String name;
    public String taste;






    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();

        //fruit1.hasColor = true; // compiler error as final instance variables cannot be re-assigned

        System.out.println(fruit1.hasColor); // true


        Fruit fruit2 = new Fruit();
        System.out.println(fruit2.hasColor); // true
    }
}
