package Threads;

public class MultiThreading02 {

    // Threadler ayni kaynaga ulasmaya calisirsa ne olur..

    public static int counter = 0;

    public static void main(String[] args) {

    // !!! Ayri iki thread olusturup ayni kaynaga erismesini saglayalim

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Counter.count();
                System.out.println("Thraed1 calisti");
            }
        });
        thread1.start();
       // thread1.join(); bu dinamik bir cozum degil


        //2. Thread olusturuyoruz...
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Counter.count();
                System.out.println("Thread2 calisti");
            }
        });
        thread2.start();


    }

    class Counter {
        public synchronized static void count (){  // synchronized kelimesi ile threadleri siraya koyduk,
                                                    // bir thread iceride ikien 2.thredi iceri girmesin
            for (int i=1; i<=1000; i++){
                MultiThreading02.counter ++;
            }
            System.out.println("Counter " + MultiThreading02.counter);
        }

    }







}
