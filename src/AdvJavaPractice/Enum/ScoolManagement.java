package AdvJavaPractice.Enum;

public class ScoolManagement {

    public static void main(String[] args) {


        Student student = new Student("Tostloy");
        Teacher teacher = new Teacher("Balzac");

        User user1 = new User("Jules Verne", Role.ROLE_ADMIN);
        User user2 = new User("c.Dicnes", Role.ROLE_TEACHER);
        User user3 = new User("J.Steinbeck", Role.ROLE_SUTUDENT);

        deleteStudent(student, user2);

        deleteTeacher(teacher, user1);

    }


    public static void deleteStudent(Student std, User user){

        if(user.getRole().equals(Role.ROLE_ADMIN) || user.getRole().equals(Role.ROLE_TEACHER)){
            System.out.println("Sutudent basari ile silindi " + user.getRole().getName());
        }else {
            System.out.println( user.getRole().getName() + " Silme islemi ile yetkili degilsiniz.");
        }
    }

    public static void deleteTeacher(Teacher tch, User user){

        if(user.getRole().equals(Role.ROLE_ADMIN)){
            System.out.println("Teacher basari ile silindi : Silen = " + user.getRole().getName());
        }else {
            System.out.println( user.getRole().getName() + " ! Silme islemi ile yetkili gegilsiniz.");
        }
    }

/*
    Java ile yazdığımız kodlar, data türleri ile birlikte, binary koda çevrilir. Bu kodlar arasında her değerin hangi
data türüne sahip olduğu gibi bilgiler yer alır. Fakat oluşturduğumuz verileri, Java dışına, örneğin hard disk
gibi bir ortama aktardığımızda yalnızca verilerin aktarılmış olmasını sağlarız. Yani hangi verinin hangi veri
türüne sahip olduğu gibi bilgiler karşı tarafa gitmez. Bu sebeple bu verileri Java ortamına geri çağırdığımızda,
sistem hangi verinin hangi veri türüne sahip olduğunu bilemez ve bu yüzden onları çalıştıramaz.

    Bu problemin önüne geçmek için, veriler dışarıya aktarılırken, onların hangi türde olduklarını da beraberinde
gönderen bir yapı oluşturulmuştur. Bu yapı Serialization yapısıdır. Serialization ile birlikte örneğin 5 sayısını
 dışarı aktardığınızda, yanında bu değerin Integer veri tibine sahip olduğu bilgisi de gider.

    Serialization işlemi ile bu verilerin geri çağırılması ve Java diline uygun bir yapıya çevirilmesi işlemine ise
Deserialization işlemi denir. Bu işlem, hangi verinin hangi data türüne sahip olduğunu tespit eder ve
 bu sayede onları yeniden Java diline yani Java’nın kullanabileceği hale getirir.
 */



}
