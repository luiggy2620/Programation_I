import java.util.ArrayList;

public class College {
    String name;
    int añoCreacion;
    String areaAdministrativa;
    ArrayList<Classroom> listClassroom;
    ArrayList<Student> listStudents;
    ArrayList<Teacher> listTeachers;

    public College(String name, int añoCreacion){
        listClassroom  = new ArrayList<>();
        listStudents  = new ArrayList<>();
        listTeachers  = new ArrayList<>();
        this.name = name;
        this.añoCreacion = añoCreacion;
    }

    public void addListClassroom(Classroom classroom) {
        if(listClassroom.equals(null)){
            listClassroom = new ArrayList<>();
        }
        listClassroom.add(classroom);
    }

    public void addListStudents(Student student) {
        if(listStudents.equals(null)){
            listStudents = new ArrayList<>();
        }
        listStudents.add(student);
    }

    public void addListTeachers(Teacher teacher) {
        if(listTeachers.equals(null)){
            listTeachers = new ArrayList<>();
        }
        listTeachers.add(teacher);
    }
}
