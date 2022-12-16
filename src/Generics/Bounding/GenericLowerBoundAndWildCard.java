package Generics.Bounding;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBoundAndWildCard {

    public static void main(String[] args) {

    List<Object> ol = new ArrayList<>();

    addElements(ol);
    System.out.println(ol);

    List<Number> nl = new ArrayList<>();
    addElements(nl);
        System.out.println(nl);

    // List<Double> dl = new ArrayList<>();
    // addElements(dl);  // CTE, Gneric oncesi RunTimeE olurdu,,,

        // ******** printElement ***********
        // List<String> st = new ArrayList<>();  altta ki kod ile ayni isi yapar. -->printElement(new ArrayList<String>());
      //   System.out.println("st = " + st);

        printElement(new ArrayList<String>());



    // ******** printObject ***********
    List<String> strList = new ArrayList<>();   // data tipi Object degil CTE verdi
   //  printObj(strList);   CTE

    List<Object> obList = new ArrayList<>();  // data tipi Object oldugu icin hata vermedi.
    printObj(obList);


    }

    // super Integer : bana Integer'in parentlarini getir.
    public static void addElements(List<? super Integer> list){
        // ? : WilCard (tipi bilinmeyen)
        for(int i = 1; i<=10; i++){
            list.add(i);
        }
    }


    // WildCard sinirlamalari - dikkat edilmesi greken alanlar var
    public static void printElement(List<?> listOfUnknown){
       // listOfUnknown.add("Java"); --> ? den dolayi data turu netlesmeden add methodu calismaz.
        // wildCard kullandigimiz zaman parametreye data tipi verilmelidir (List<?> listOfUnknown)--> bu sekilde hata verir
        listOfUnknown.add(null);  // illa eklenecekse null eklenebilir.

        // Ancak Object kullanilabilir... bu da zorunlu olmadikca kullanilmamali
        for(Object object : listOfUnknown){

            System.out.println(object);

        }
    }


    //     ? --> Object kullansak ne olur
    public static void printObj(List<Object> listOfObject){
        listOfObject.add("Java");

        for(Object object : listOfObject){

            System.out.println(object);
        }
    }








}
