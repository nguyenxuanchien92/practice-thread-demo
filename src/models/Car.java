package models;

import java.util.Random;

public class Car implements Runnable {
    public static int DISTANCE = 100;
    public static int STEP = 2;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();

        while (runDistance < DISTANCE) {
            int speed = (new Random()).nextInt(20);
            runDistance += speed;
            String log = "|";
            int percentTravel = (runDistance * 100) / DISTANCE;
            for (int i = 0; i < DISTANCE; i += STEP) {
                if (percentTravel >= i + STEP) {
                    log += "=";
                } else if (percentTravel >= i && percentTravel < i + STEP) {
                    log += "o";
                } else {
                    log += "-";
                }
            }
            log += "|";
            System.out.println("models.Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("models.Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
