package Generics.Method;

// Generic Methodlar hangi durumda bize kolaylik sagliyor.
public class GenericMethodDemo {
    public static void main(String[] args) {

        GenericMethodDemo obj1 = new GenericMethodDemo();

        Integer[] intArray = {1, 23, 54, 56, 45};
        Double[] doubleArray = {1.2, 1.3, 2.5};

        obj1.print(intArray);
        System.out.println();
        obj1.print(doubleArray);

    }

    // Kotu ornek .. herm data turu icin ayri ayri method olusturduk... Data turunden bagimsiz bir method yazmamiz lazim.

//    public void print(Integer[] arr){
//        //****
//    }
//
//    public void print(Double[] arr){
//        //****
//    }

    // GENERIC METHOD

    public <T> void print(T[] array){

        for (T t: array ) {
            System.out.println(t);
        }
    }




}
