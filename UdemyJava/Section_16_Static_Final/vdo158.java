package Section_16_Static_Final;

class Test2 {
    public final void show() {
        System.out.println("Hello");
    }
}

class Test3 extends Test2 {
    // public void show(){}
    // gives error as final methods cannot be overloaded.
}

public class vdo158 {

    final float PI;

    public vdo158()
    {
    PI=3.1425f;
    }

    public static void main(String[] args) {

        // final float PI;
        // PI = 3.1425f;
        // System.out.println(PI);

    }
}
