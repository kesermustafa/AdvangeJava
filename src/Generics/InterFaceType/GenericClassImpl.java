package Generics.InterFaceType;


// Eger bir" Generic interface" implement ederseniz, class da generic olmali
public class GenericClassImpl<T> implements GenericInterface<T> {


    @Override
    public void setValue(T t) {

    }

    @Override
    public T getValue() {
        return null;
    }



}
