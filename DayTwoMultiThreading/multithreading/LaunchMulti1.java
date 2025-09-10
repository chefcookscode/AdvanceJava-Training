package multithreading;

class MyThread extends Thread{
    public void run() {
        System.out.println("Child Thread");
    }
}

public class LaunchMulti1{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        System.out.println("Main Thread");
    }
}