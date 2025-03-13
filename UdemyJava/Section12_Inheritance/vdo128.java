package Section12_Inheritance;

class TV {
    public void switchOn() {
        System.out.println("TV is Switched On");
    }

    public void changeChannel() {
        System.out.println("TV Channel is Changed");
    }
}

class SmartTV extends TV {
    @Override
    public void switchOn() {
        System.out.println("Smart TV is Switched On");
    }

    @Override
    public void changeChannel() {
        System.out.println("SmartTV Channel is Changed");
    }

    public void browse() {
        System.out.println("Smart TV Browsing");
    }
}

public class vdo128 {
    public static void main(String[] args) {

        // // For Tv class
        // TV t = new TV();
        // t.changeChannel();
        // t.switchOn();
        // System.out.println();

        // // For SmartTv class
        // SmartTV st = new SmartTV();
        // st.changeChannel();
        // st.switchOn();
        // st.browse();

        // Dynamic Method Dispatch
        TV tv = new SmartTV();
        tv.changeChannel();
        tv.switchOn();
        // tv.browse(); // This will give an error as browse() is not present in TV
        // class

    }
}