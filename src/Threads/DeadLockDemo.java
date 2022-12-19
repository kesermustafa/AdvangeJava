package Threads;


public class DeadLockDemo {

    // Hangi durumlarda DeadLock olusur..
    public static void main(String[] args) {

        final String lock1 = "lock1";
        final String lock2 = "lock2";


        // thread1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("Thread1, lock1 degiskeni kilitlendi");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock2){
                        System.out.println("Thread, lock2 degiskeni kilitlendi");

                    }
                }
            }
        });
        thread1.start();


        // thread2

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("Thread2, lock2 degiskeni kilitlendi");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock2){
                        System.out.println("Thread, lock1 degiskeni kilitlendi");

                    }
                }
            }
        });
        thread2.start();



    }
}
