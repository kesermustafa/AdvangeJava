package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType<T> {

    /*
     E  --> Element, collection gibi yapilarda kullanilir.
     K  --> Key
     V  --> Value
     N  --> Number
     T  --> Type
     S,U,V vb --> 2. 3. ve 4. tipler icin

     */


    private T type;

    // Getter - Setter
    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }


    // main method
    public static void main(String[] args) {

        // generic yapi kullanilarak ayni class dan 2 farkli data turunde obje olusturalim.

        GenericType<String> obj1 = new GenericType<>();
        // Trick : Diamond icine non-primrtive type kullanabiliriz...

        obj1.setType("Generic Types");

     //   GenericType<String> obj2 = new GenericType<>();
        //   obj2.setType(65);  // String girmem gerekirken int data turunu girince CTE verdi.

        // Not ; Cast Probleminden nasil kurtulurum.

        GenericType<Integer> obj3 = new GenericType<>();
        obj3.setType(65);
        int a = obj3.getType(); // !!! Cast probleminden kurtulduk.

        System.out.println("a = " + a);

        // Not : ClassCastException probleminden nasil kurtuluruz.

        List<String> list = new ArrayList<>();
        list.add("Alper");
        list.add("Halide");
      //  list.add(22);  // !!! ClassCastException dan kurtulduk

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Generic");





    }
}
