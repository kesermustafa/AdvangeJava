package Threads;

public class Volatile {

    volatile public static  int  flag = 0;

    public static void main(String[] args) {


        // thread 1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (flag == 0) { // Sonsuz dongu yaptik bilerek...
                        int i = 1;
                        System.out.println("Thread1 calisiyor");
                    } else {
                        break;
                    }
                }
            }
        });
        thread1.start();


        // thread 2
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);  // Sonsuz donguyu kirmak icin yazdik...
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag =1;
                System.out.println("Flag degeri 1 olarak degistirildi..");
            }
        });
        thread2.start();


    }
}
