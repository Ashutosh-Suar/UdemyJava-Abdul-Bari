package Section_15_Inner_Classes;

class Outer {
    int x = 10;

    class Inner {
        int y = 20;
        public void innerDisplay() {
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
        }
    }

    public void outerDisplay() {
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}

public class vdo149 {
    
    public static void main(String[] args) {
        
        // Demo : Nested Inner Classes

        // Outer o = new Outer();
        // o.outerDisplay();

        Outer.Inner oi = new Outer().new Inner(); 
        oi.innerDisplay();

    }
}
