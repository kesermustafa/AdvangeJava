package Threads;

public class WaitInerrupt {

    static public int balance = 0;

    public static void main(String[] args) {

        WaitInerrupt obj = new WaitInerrupt();

        // withdraw -- Para Cekme threadi
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

           obj.withdraw(800);

            }
        });
        thread1.setName("Withdraw Thread");
        thread1.start();


        // depozite -- Para Yatirma threadi
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                obj.depozite(2000);
                thread1.interrupt(); // thread2 burada kibarca thread1'i sonlandiriyor
            }
        });
        thread2.setName("Depozite Thread");
        thread2.start();

    }



    public void withdraw(int amount){
        synchronized (this){
            if(balance<=0 || balance<amount){

                System.out.println("Beklemede");

                try {
                    wait();
                } catch (InterruptedException e) {
                   /// e.printStackTrace();
                    balance = balance - amount;
                    System.out.println("Basarili");
                }

            }
        }
    }

    public void depozite (int amount){
        balance = balance + amount;
        System.out.println("Para yatima islami basarili");
    }



}
