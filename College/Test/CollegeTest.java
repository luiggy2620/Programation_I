import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CollegeTest {

    @Test
    void TestListStudents() {
        College college = new College("USB", 2020);
        Student student = new Student("Juan Pedro", "Calle Falsa 123", "3 de enero", 2021);
        college.addListStudents(student);
        int studentSize = college.listStudents.size();
        assertEquals(1, studentSize);
    }

    @Test
    void testClassroomList(){
        College college = new College("USB", 2020);
        Classroom classroom = new Classroom(2121, 20, "A");
        college.addListClassroom(classroom);
        int classroomSize = college.listClassroom.size();
        assertEquals(1, classroomSize);
    }

    @Test
    void testTeacherList(){
        College college = new College("USB", 2020);
        Teacher teacher = new Teacher("Juanita", "Juanita@juanita", "3 de enero",
                2121, "Programacion");
        college.addListTeachers(teacher);
        int teacherSize = college.listTeachers.size();
        assertEquals(1, teacherSize);
    }

}