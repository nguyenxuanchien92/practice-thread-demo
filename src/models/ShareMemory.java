package models;

public class ShareMemory {
    public synchronized void printData(String threadName) {
        for (int i = 1; i < 5; i++) {
            System.out.println(threadName + ": " + i);
        }
    }
}
