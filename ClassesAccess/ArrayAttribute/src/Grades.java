class Grades {
    private int[] grades;

    Grades(int n) {
        grades = new int[n];
        for (int i=0; i<n; i++)
            grades[i]=0;
    }

    void setGrade(int i, int value) {
        grades[i] = value;
    }

    int getGrade(int i) {
        return grades[i];
    }

    void print() {
        for (int grade : grades)
            System.out.println(grade + " ");

        //for(int i=0; i<grades.length; i++)
            //System.out.println(grades[i]+" ");

    }

}
