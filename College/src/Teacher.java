import java.util.ArrayList;

public class Teacher {
    String name;
    String subject;
    ArrayList<Student> students;
    String email;
    String dateBorn;
    int id;

    public Teacher(String name, String email, String dateBorn, int id, String subject){
        this.name = name;
        this.subject = subject;
        this.email = email;
        this.dateBorn = dateBorn;
        this.id = id;
    }
}
