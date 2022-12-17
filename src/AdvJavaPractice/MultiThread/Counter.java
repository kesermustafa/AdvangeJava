package AdvJavaPractice.MultiThread;

public class Counter implements Runnable{

    private String name;

    public Counter(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 'a'; i<='z'; i++){

            System.out.println(this.name + " - " + (char) i);
        }
        System.out.println(this.name + " bitti ");
    }
}
