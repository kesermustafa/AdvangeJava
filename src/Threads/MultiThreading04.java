package Threads;

public class MultiThreading04 {

    public static void main(String[] args) {
        Brackerts2 brackerts2 = new Brackerts2();

        Long startTime = System.currentTimeMillis();

        // thread 1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for( int i=1; i<=7; i++){
                    brackerts2.generateBrackerts();
                }
            }
        });
        thread1.start();

        //thread 2

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for( int i=1; i<=7; i++){
                    brackerts2.generateBrackerts();
                }
            }
        });
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }


        Long endTime = System.currentTimeMillis();
        System.out.println( "Toplam gecen sure  " + (endTime - startTime));  // 4227 iken 2178 e indi



    }
}


class Brackerts2{

    public void generateBrackerts(){

        synchronized (this){   // this threadi cagiran keyword ... 1 therad varken 2. thread almaz...
            for(int i =1; i<=10; i++){
                if(i<=5){
                    System.out.print("[");
                }else {
                    System.out.print("]");
                }
            }
            System.out.println();
        }


        for(int i=1; i<=5; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}