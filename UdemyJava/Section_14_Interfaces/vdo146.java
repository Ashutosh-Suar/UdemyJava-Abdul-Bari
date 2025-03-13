package Section_14_Interfaces;

interface Test1 {
    final static int X = 10;
    public abstract void meth1();
    public abstract void meth2();
    
    default void meth3() {
        System.out.println("Meth3  of Test");
    }
}

interface Test2 extends Test1 {
    void meth4();
}

class my implements Test2 {
    public void meth1() {}  
    public void meth2() {}
    public void meth4() {}
    public void meth3() {}
}

public class vdo146 {
    
    public static void main(String[] args) {
        
        System.out.println(Test1.X);
        
        my m = new my();
        m.meth3();


    }
}
