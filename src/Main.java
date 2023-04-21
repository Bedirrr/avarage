public class Main {
    private String name;
    private int grade;
    private String studentId;
    private Course mathCourse;
    private Course physicsCourse;
    private Course chemistryCourse;
    private double mathNote;
    private double physicsNote;
    private double chemistryNote;

    public void Student(String name, int grade, String studentId, Course mathCourse, Course physicsCourse, Course chemistryCourse) {
        this.name = name;
        this.grade = grade;
        this.studentId = studentId;
        this.mathCourse = mathCourse;
        this.physicsCourse = physicsCourse;
        this.chemistryCourse = chemistryCourse;
    }

    public void addBulkExamNote(double mathNote, double physicsNote, double chemistryNote) {
        this.mathNote = mathNote;
        this.physicsNote = physicsNote;
        this.chemistryNote = chemistryNote;
    }

    public void isPass() {
        double average = (mathNote + physicsNote + chemistryNote) / 3.0;
        if (average > 55) {
            System.out.println(name + " passed the year.");
        } else {
            System.out.println(name + " failed the year.");
        }
    }
}