package Section12_Inheritance;

class Parent {
    public Parent() {
        System.out.println("Parent Constrcutor");
    }

}

class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child {
    public GrandChild() {
        System.out.println("Grand Child Constructor");
    }
}

public class vdo123 {

    public static void main(String[] args) {

        GrandChild c = new GrandChild();
        System.out.println(c);
    }
}
