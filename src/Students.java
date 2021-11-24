public class Students {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    public Students(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    public String printFullName(){
        return "Nombre del estudiante: "+ this.firstName+" "+this.lastName;


    }
    public boolean isApproved(){
        if (this.grade >= 60){
            return true;
        }
        else {
            return false;
        }

    }
    public int changeYearIfApproved(){
        if (this.isApproved()){
           return this.year+=1;
        }
        else {
            return this.year;
        }
    }


}
