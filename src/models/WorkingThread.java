package models;

public class WorkingThread extends Thread {
    private ShareMemory shareMemory;
    private String mThreadName;

    public WorkingThread(ShareMemory sm, String threadName) {
        this.shareMemory = sm;
        this.mThreadName = threadName;
    }

    @Override
    public void run() {
        this.shareMemory.printData(mThreadName);
    }
}
