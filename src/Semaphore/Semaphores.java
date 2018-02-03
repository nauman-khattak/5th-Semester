package Semaphore;

public class Semaphores {

    static int mutex = 1; //Semaphore mutex
    static int sharedIntegerValue = 0; //Critical or Shared variable

    static void Wait(int m) {
        while (m <= 0);
        m--;
    }

    static void signal() {
        mutex++;
    }

    static class myThread implements Runnable {

        String name = "";

        myThread(String x) {
            name = x;
        }

        public void run() {
            Wait(mutex);
            System.out.println(name + " entered in Critical section.");
            sharedIntegerValue++;
            System.out.println("sharedIntegerValue = " + sharedIntegerValue);
            signal();
            System.out.println(name + " left critical section\n");
        }
    }

    public static void main(String[] args) {
        myThread a = new myThread("Thread 1");
        myThread b = new myThread("Thread 2");

        do {
            a.run();
            b.run();
        } while (true); //var < 20

    }

}
