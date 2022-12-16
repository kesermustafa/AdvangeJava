package AdvJavaPractice.Enum;

public class User {

    //TASK:okul yönetimi için öğrenci ve teacher silme programı yazınız.
    //User için role tanımlayın(ADMIN,TEACHER,STUDENT) ve role göre silme yetkisi veriniz.
    //öğrenci silme yetkisi: ADMIN-TEACHER
    //teacher silme yetkisi: ADMIN

    private String name;

    private Role role;

    public User(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role=" + role +
                '}';
    }


}
