import models.Car;
import models.ShareMemory;
import models.WorkingThread;

public class Main {


    public static void main(String[] args) {

//        Car carA = new Car("A");
//        Car carB = new Car("B");
//        Car carC = new Car("C");
//
//        Thread thread1 = new Thread(carA);
//        Thread thread2 = new Thread(carB);
//        Thread thread3 = new Thread(carC);
//
//        System.out.println("Distance: 100KM");
//        thread1.start();
//        thread2.start();
//        thread3.start();

        ShareMemory sm = new ShareMemory();
        WorkingThread thread1 = new WorkingThread(sm, "Thread 1");
//        thread1.setPriority(Thread.MAX_PRIORITY);
        WorkingThread thread2 = new WorkingThread(sm, "Thread 2");
//        thread2.setPriority(Thread.MIN_PRIORITY);
        WorkingThread thread3 = new WorkingThread(sm, "Thread 3");
//        thread3.setPriority(Thread.NORM_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
