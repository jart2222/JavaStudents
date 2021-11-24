public class Main {
    public static void main(String[] args) {
        Students mariaStudent=new Students("Maria Jose","Ramona Torres",
                2018,60,3);
        /*System.out.println(mariaStudent.printFullName());
        System.out.println("El alumno obtuvo mas de 60 puntos: "+mariaStudent.isApproved());
        System.out.println("El alumno el siguiente periodo cursara el "+mariaStudent.changeYearIfApproved()+
                " grado");*/
        System.out.println("----------------------");
        Students joseStudent=new Students("Jose Roberto"," Carlos Javier",
                2018,50,3);

        Course matematicas =new Course("Mathematicas","Julio Martinez","3");
        matematicas.enroll(mariaStudent);
        matematicas.enroll(joseStudent);
        matematicas.unEnroll(joseStudent);
        System.out.println("La cantidad de estudiantes en matematicas son "+matematicas.countStudents());







    }
}
