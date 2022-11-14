import java.util.Random;

public class Professor {
    void grade(Student s){
        Random r = new Random();

        s.gradeAssignment1(r.nextInt(11));
        s.gradeAssignment2(r.nextInt(11));
        s.gradeFinalExam(r.nextInt(11));

        double finalGrade = s.finalGrade();
        System.out.println("Vathmologia tou foititi apo kathigiti me tyxaia vathmologisi: "+finalGrade);

    }
}
