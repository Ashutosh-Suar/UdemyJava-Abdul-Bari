package Section_16_Static_Final;

class Test1 {

    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }

}

public class vdo156 {

    public static void main(String[] args) {

        Test1 t = new Test1();
        System.out.println(t); // Output will Show some hashcode.
        System.out.println("Main");

    }

}
