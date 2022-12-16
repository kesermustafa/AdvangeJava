package Serialization;

import java.io.*;

public class Serialization_Deserialization {


    public static void main(String[] args) {

      //   wrideObjects();  -- yazma islemini yaptigimiz icin ikinci kez yazmasin diye kapattik.
        readObjects();

    }


    // writeObject()

    private static void wrideObjects(){

        System.out.println("User Objeleri olusturluyor.");
        User user1 = new User(1L, "Beyza", "486589875");
        User user2 = new User(2L, "Berna", "123654789");
        User user3 = new User(3L, "Busra", "325647896");

        try(FileOutputStream fos = new FileOutputStream("user.dat")) {  // Bu dosyayi yazmak icin

           try(ObjectOutputStream oos = new ObjectOutputStream(fos)){   // bu Objeleri yazmak icin

               oos.writeObject(user1);
               oos.writeObject(user2);
               oos.writeObject(user3);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // readObject()
    private static void readObjects(){
        // Javada file islemlerinde okuma islemi yaparen FileInputStream classí kullanilir.

        try (FileInputStream fis = new FileInputStream("user.dat")){ // okunacak dosyayi belirledik
            try(ObjectInputStream ois = new ObjectInputStream(fis)){ // obje olarak okunacak
                try {
                    User user1 = (User) ois.readObject();
                    User user2 = (User) ois.readObject();
                    User user3 = (User) ois.readObject();

                    System.out.println(user1);
                    System.out.println(user2);
                    System.out.println(user3);

                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

// User class'ini transfer edilebilsin diye Serializable interfece'e implements ederek isaretledik
class User implements Serializable{

    // private field lar
    private Long id;
    private String name;
    private String tcKimlikNo;

    public User(Long id, String name, String tcKimlikNo) {
        this.id = id;
        this.name = name;
        this.tcKimlikNo = tcKimlikNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tcKimlikNo='" + tcKimlikNo + '\'' +
                '}';
    }


}