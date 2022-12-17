package AdvJavaPractice.MultiThread;
public class TheradCreation2 {

    //Task2:Runnable interfaceni implement eden Counter isminde sınıf oluşturup
    // bu sınıftan harfleri a dan z ye kadar yazdıran iki tane thread oluşturunuz.


    public static void main(String[] args) {

        Counter c1 = new Counter("RoadRunner");
        Counter c2 = new Counter("SpeedGonzales");

        Thread thread1 = new Thread(c1);
        Thread thread2 = new Thread(c2);

        System.out.println("Yarış başlasın");
        thread1.start();
        thread2.start();
        //Task3: Threadler başlamadan önce Yarış başlasın ve bitince Yarış bitti
        //yazdırın.

        try {
            thread1.join();
            thread2.join();
            System.out.println("Yarış bitti");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }


}
