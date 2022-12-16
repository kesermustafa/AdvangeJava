package AdvJavaPractice.Enum;

public enum Role {

    ROLE_ADMIN("admin"),
    ROLE_TEACHER("teacher"),
    ROLE_SUTUDENT("student");

    String name;

    Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
