package AdvJavaPractice.interfaces;

public class ScholManagement {


    /*Task: Okul yönetimi için öğrenci ve öğretmen kayıtlarını
       -oluşturan
       -görüntüleyen
       -güncelleyen
       -silen
       bir program yazınız.
     */

        public static void main(String[] args) {
            Student student = new Student("Tolstoy");
            SutudentRepo sutudentRepo = new SutudentRepo();

            Teacher teacher = new Teacher("Dostoyevski");
            TeacherRepo teacherRepo = new TeacherRepo();

            sutudentRepo.add(student);
            sutudentRepo.update(student);
            sutudentRepo.get(student);
            sutudentRepo.delete(student);
            System.out.println();

            teacherRepo.add(teacher);
            teacherRepo.update(teacher);
            teacherRepo.get(teacher);
            teacherRepo.delete(teacher);




        }
}
