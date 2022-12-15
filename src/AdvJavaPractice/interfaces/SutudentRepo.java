package AdvJavaPractice.interfaces;

public class SutudentRepo implements Repository<Student>{


    @Override
    public void add(Student student) {
        System.out.println(student.getName()+" basariyla kaydedildi.");
    }

    @Override
    public void get(Student student) {
        System.out.println(student.getName()+" basariyla bulundu.");
    }

    @Override
    public void update(Student student) {
        System.out.println(student.getName()+" basariyla guncellendi."+ student.getName() + " update");
    }

    @Override
    public void delete(Student student) {
        System.out.println(student.getName()+" basariyla silindi.");
    }


}
