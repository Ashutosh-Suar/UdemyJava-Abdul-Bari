package Section12_Inheritance;

class MyRectangle {
    int length;
    int breadth;
    int x = 10;

    MyRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void display() {
        System.out.println("Length : " + length);
        System.out.println("Breadth : " + breadth);
    }
}

public class vdo125 {

    public static void main(String[] args) {

        MyRectangle rect = new MyRectangle(5, 10);
        rect.display();
    }
}
