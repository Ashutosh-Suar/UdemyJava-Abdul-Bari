package Section_16_Static_Final;

class Test {
    static int x = 10;
    int y = 20;

    void show() {
        System.out.println(x + " " + y);
    }

    static void display() {
        System.out.println(x);
    }
}

// HondaCity Example
class HondaCity {
    static long price = 10;
    int a,b;

    static double OnRoadPrice(String city) {
        switch(city) {
            case "Delhi":
                return price + price*0.1;
            case "Mumbai":
                return price + price*0.09;
            default:
                return price;
        }
    }
}

public class vdo154 {
    
    public static void main(String[] args) {
        
        // Test t1 = new Test();
        // t1.show();
        // // t1.x = 30;
        // t1.y = 50;

        // Test t2 = new Test();
        // t2.show();

        // HondaCity Example
        // HondaCity h1 = new HondaCity();
        // HondaCity h2 = new HondaCity();
        // System.out.println(h1.price);
        // System.out.println(h2.price);

        System.out.println("The actual price of the Honda City car is " + HondaCity.price);
        System.out.println("The on road price of the Honda City car is " + HondaCity.OnRoadPrice("Delhi"));

    }
}
