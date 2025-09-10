// BLOCK 1
class MyThread1 extends Thread {
    public void run() {
        System.out.println("Block 1");
    }
}

// BLOCK 2
class MyThread2 extends Thread{
    public void run() {
        System.out.println("Block 2");
    }
}


// Main Block
public class LaunchMulti2 {
    public static void main(String[] args) {

        System.out.println("Entering Main Block");


System.out.println("Reactor Building 1");
        MyThread1 t = new MyThread1();
        System.out.println("Thread Name: " + t.getName());
        t.start();

System.out.println("-------------------");
System.out.println("Reactor Building 2");
        MyThread2 t1 = new MyThread2();
        System.out.println("Thread Name: " + t1.getName());
        t1.start();


        System.out.println("Exiting Main Block");
    }
}

// Output may vary in order due to multithreading