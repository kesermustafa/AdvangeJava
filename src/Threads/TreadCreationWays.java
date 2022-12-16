package Threads;

public class TreadCreationWays {

    public static void main(String[] args) {
        // ilk calisan thread main thread dir, kontrol ettik : main
        System.out.println("Current Threand : " + Thread.currentThread().getName());

        MyThread thread1 = new MyThread();

       thread1.start(); // Thread sinifinda run() methodunda yazilanlar islenmeye baslandi...

        // thread1.run(); --> bu sekilde cagirdigimizda normal baska bir classdaki normal method gibi calisir
                            // ancak tread islemi olmamis olur... thread degismez.
                            // start(); ise once thread ayaga kalkar sonra icindeki run() methodu calisir.

      /*    thread sınıfında run() metodunda yazılanlar işlenmeye başlar
            run() diyerekte çağırdığımızda method yine çalışıyor , start() ile çağırmamız
            arasındaki fark : run() ile çağırıldığında thread değişmez sadece methos çalışır
            start() da ise önce thread ayağa kalkar daha sonra içindeki run() metodu çalışır  */

        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);  // implement ettigimiz icin bu satiri yazmali ve parametresini de vermeliyiz.
        thread2.start();                            // Bu satir yazilmazsa start() methodunu kullanamayiz..



        // !!! isimsiz olarak thread olusturma, anonymous ( Interface)
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000); // 5 saniye uyu
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Current Thread : " + Thread.currentThread().getName());
                System.out.println("Bu isimsiz sinif yoluyla olusturulan is parcacigidir.");
            }
        });
        thread3.setName("Thread3");
        thread3.start();


        // !!! isimsiz olarak thread olusturalim.
        Thread thread4 = new Thread(()->{
            System.out.println("Lambda ile yazildi.");
        });
        thread4.start();

        System.out.println("Main method bitti");

        Thread thread5 = new Thread(()->{
            System.out.println("thread 5 calisti.");
        });
        thread5.start();












    }

}

    // 1.YOL : Tread classini extend ederek
class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("MyThread thread calisiyor..");
        }
    }


    //2.YOL  : Runnable Interface'i implement ederek
    class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("Runnable Interface implement edilen method  calisiyor..");
        }
    }