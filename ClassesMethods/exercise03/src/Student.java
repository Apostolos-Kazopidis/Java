public class Student {
    String name;
    String surname;
    double gradeTest1;
    double gradeTest2;
    double gradeScore;

    Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    Student(String name, String surname, double gradeTest1, double gradeTest2){
        this(name, surname);
        this.gradeTest1 = gradeTest1;
        this.gradeTest2 = gradeTest2;
    }

    void gradeAssignment1(double gradeTest1){
        this.gradeTest1 = gradeTest1;
    }

    void gradeAssignment2(double gradeTest2){
        this.gradeTest2 = gradeTest2;
    }

    void gradeFinalExam(double gradeScore){
        this.gradeScore = gradeScore;
    }

    double finalGrade(){
        return (gradeTest1+gradeTest2+gradeScore)/3;
    }

}
