package AdvJavaPractice.Serialization;

import java.io.*;

public class SerializationPraction {

    // Book tipinde neslsler uretip bu nesneleri txt dosyasina kaydedin ve daha sonra bu dosyadan okuyun.

    public static void main(String[] args) {


       // writeObject();

        readObject();





    }

    public static void writeObject(){

        Book book1 = new Book("Sefiller", "Victor Huga", 1945);
        Book book2 = new Book("Suc ve Ceza", "Dostoyevski", 1971);
        Book book3 = new Book("Savas ve Baris", "Tolstoy", 1981);

        try {
            FileOutputStream fos = new FileOutputStream("books.txt");
            ObjectOutputStream write = new ObjectOutputStream(fos);

            write.writeObject(book1);
            write.writeObject(book2);
            write.writeObject(book3);

            write.close();
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readObject(){

        try {
            FileInputStream fis = new FileInputStream("books.txt");
            ObjectInputStream objectReader = new ObjectInputStream(fis);

            Book book1 = (Book) objectReader.readObject();
            Book book2 = (Book) objectReader.readObject();
            Book book3 = (Book) objectReader.readObject();

            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }





}
