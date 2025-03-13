package Section12_Inheritance;

class MySuper {
    public void meth1() {
        System.out.println("Super class Meth1.");
    }

    public void meth2() {
        System.out.println("Super class Meth2.");
    }
}

class MySub extends MySuper {
    @Override
    public void meth2() {
        System.out.println("Sub class Meth2.");
    }

    public void meth3() {
        System.out.println("Sub class Meth3.");
    }
}

public class vdo131 {

    public static void main(String[] args) {

        // Super Class Object and methods
        // MySuper sup = new MySuper();
        // sup.meth1();x
        // sup.meth2();

        // Sub Class Object and methods
        // MySub s = new MySub();
        // s.meth1();
        // s.meth2();
        // s.meth3();

        // Dynamic Method Dispatch
        MySuper sup = new MySub();
        sup.meth1();
        sup.meth2();
    }
}
