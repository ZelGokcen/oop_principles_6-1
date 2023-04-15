package class_vs_object;

public class Animal {

    {
        // This is an instance block
        System.out.println("INSTANCE BLOCK IS RUNNING");
    }

    static {
        // static block
        System.out.println("STATIC BLOCK IS RUNNING");
    }

    @Override
    protected void finalize() {
        System.out.println("A Garbage collection happened here!!!");
    }

    public static void main(String[] args) {
        Animal a1;

        System.out.println("Hello world!");

        a1 = new Animal();
    }
}
