package Section_15_Inner_Classes;

class Outer1 {
    public void display() {
        class Inner1 {
            public void show() {
                System.out.println("Hello");
            }
        }
        Inner1 i = new Inner1();
        i.show();
    }
}

public class vdo152 {

    public static void main(String[] args) {

        // Demo : Local and static Inner Classes

        Outer1 o = new Outer1();
        o.display();

    }
}
