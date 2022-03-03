public class Student {
    int id;
    String name;
    String dateBorn;
    Career career;
    Classroom classroom;
    String address;

    public Student(String name, String address, String dateBorn, int id){
        this.name = name;
        this.address = address;
        this.id = id;
        this.dateBorn = dateBorn;
    }

    public void setCareer(Career career){
        this.career = career;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassroom(Classroom classroom){
        this.classroom = classroom;
    }

    public String toString(){
        return name + ", " +
                id + ", " +
                dateBorn + ", " +
                address;
    }
}
