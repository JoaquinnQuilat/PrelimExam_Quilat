public class ShowStudent {
    public static void main (String args[])
    {
        Student pupil = new Student();// 2 cannot resolve sybmol... points to 'S' in Student


        pupil.showIDnumber();
        pupil.showPoints();
        pupil.showHours();
        System.out.println("The grade point average of the student created by constructor is "
                + pupil.getGradePoint()+"\n\n");

        Student s2 = new Student();// 2 cannot resolve sybmol points to 'S in Student
        s2.setIDnumber(9999);
        s2.setPoints(12);
        s2.setHours(3);
        s2.showIDnumber();
        s2.showPoints();
        s2.showHours();
        System.out.println("The grade point average of another student is "
                + s2.getGradePoint()+"\n");

    }
}