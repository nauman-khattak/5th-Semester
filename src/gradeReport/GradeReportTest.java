package gradeReport;
public class GradeReportTest {
    public static void main(String[] args) {
        GradeReport Result = new GradeReport("Introduction to Java Programming");
        Result.displayCourseName();
        Result.InputGrades();
        System.out.println("Total number of Grades entered are "+Result.GradeCounter);
        System.out.println("Sum of Grades entered are "+Result.GradeSum);
        Result.CourseAverage();
        Result.GradeReport();
        
    }
}
