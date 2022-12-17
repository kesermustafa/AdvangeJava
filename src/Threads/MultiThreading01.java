package Threads;

public class MultiThreading01 {

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        CounterWithoutMultiThread counter1 = new CounterWithoutMultiThread(1);
        CounterWithoutMultiThread counter2 = new CounterWithoutMultiThread(2);

        counter1.countMe();
        System.out.println("-----------");
        counter2.countMe();

        long endTime = System.currentTimeMillis();
        System.out.println("WithoutMultiThread ile gecen sure : " + ( endTime - startTime));

        long startTime2 = System.currentTimeMillis();
        CounterWithMultiThread counter3 = new CounterWithMultiThread(3);
        CounterWithMultiThread counter4 = new CounterWithMultiThread(4);
        counter3.start();
        System.out.println("-----------");
        counter4.start();
        counter3.join(); // counter3 thread'i bitene kadar bekle
        counter4.join(); // counter4 thread'i bitene kadar bekle
        long endTime2 = System.currentTimeMillis();
        System.out.println("CounterWithMultiThread ile gecen sure : " + ( endTime2 - startTime2));


    }


}

class CounterWithoutMultiThread{
    private int threadNumber;

    public CounterWithoutMultiThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void countMe() throws InterruptedException {
        for (int i = 1 ; i<=10; i ++){
            Thread.sleep(500);
            System.out.println(i + " thread number " + threadNumber);
        }
    }


}

class CounterWithMultiThread extends Thread {

    private int threadNum;

    public CounterWithMultiThread(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        try {
            countMe();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // method
    public void countMe() throws InterruptedException {
        for (int i = 1; i<=10; i++){
            Thread.sleep(500); // bu main thread'i 0.5 saniye yavaslatir.
            System.out.println("i "+i+"Thread number : "+ threadNum);
        }



    }
}