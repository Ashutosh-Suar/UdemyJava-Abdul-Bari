package Section_14_Interfaces;

class Phone {
    public void call() {
        System.out.println("Phone Call.");
    }

    public void sms() {
        System.out.println("Phone sending SMS");
    }
}

interface ICamera {
    void click();

    void record();
}

interface IMusicPlayer {
    void play();

    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
    public void videoCall() {
        System.out.println("SmartPhone Video Calling.");
    }

    @Override
    public void click() {
        System.out.println("SmartPhone Clicking a photo.");
    }

    @Override
    public void record() {
        System.out.println("SmartPhone Recording a video.");
    }

    @Override
    public void play() {
        System.out.println("SmartPhone Playing music.");
    }

    @Override
    public void stop() {
        System.out.println("SmartPhone stopped playing music.");
    }
}

public class vdo144 {

    public static void main(String[] args) {

        IMusicPlayer sp = new SmartPhone();
        sp.play();
        sp.stop();

    }
}
