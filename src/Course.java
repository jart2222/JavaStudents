import java.lang.reflect.Array;
import java.util.ArrayList;

public class Course {
    String courseName;
    String professorName;
    String year;
    ArrayList<String> studentsArray= new ArrayList<String>();


    public Course(String courseName, String professorName, String year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
    }

    public void enroll(Students students){
        this.studentsArray.add(students.firstName);
    }

    public void unEnroll(Students students){
        Boolean validacionStudent;
        validacionStudent=this.studentsArray.contains(students.firstName);
        if (validacionStudent){
            this.studentsArray.remove(students.firstName);
        }
        else{
            System.out.println("Estudiante no inscrito a este curso");
        }
    }

    public int countStudents(){
        int contadorStudents;
        contadorStudents=studentsArray.size();
        return contadorStudents;
    }

    public int bestGrade(){
        //TODO implement
        return 0;
    }

}
