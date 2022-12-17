package Threads;

public class WaitNofity {

    public static int balance =0;

    public static void main(String[] args) {

        WaitNofity obj = new WaitNofity();

        // thread 1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.withdraw(800);
            }
        });
        thread1.setName("Withdraw Thread");
        thread1.start();

        // thread 2

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                obj.depozite(2000);
            }
        });
        thread2.setName("Depozite Thread");
        thread2.start();


    }

    // para cekme methodu
    public void withdraw(int amount){
        synchronized (this){
            if(balance<=0 || balance<amount){
                System.out.println("Balance degeri degisene kadar bekliyoruz");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } // synchronized blog sonu

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //wait islemi bittikten sonra veya balance degeri zaten yeterli ise
        balance = balance - amount;
        System.out.println("Para cekme islemei basari ile gerceklesti.");
    }


    // Para yatirma methodu....
    public void depozite(int amount){
        balance = balance+amount;
        System.out.println("para yatirma isleminiz basariyla gerceklesmistir..");
        synchronized (this){
            notify();
        }
    }





}
