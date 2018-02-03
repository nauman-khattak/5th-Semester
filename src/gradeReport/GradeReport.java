package gradeReport;

import java.util.Scanner;

public class GradeReport {
    Scanner input = new Scanner(System.in);
    
    private final String CourseName;
    int GradeCounter;
    int GradeSum;
    private int aCount = 0;
    private int bCount = 0;
    private int cCount = 0;
    private int dCount = 0;
    private int fCount = 0;
    
    GradeReport(String name){
        CourseName = name;
    }
    public String getCourseName(){
        return CourseName;
    }
    public void displayCourseName(){
        System.out.println("welcome to GradeBook for "+getCourseName());
        
    }
    public void InputGrades(){
        System.out.println("Enter Grades in the range 1-100");
        while(input.hasNext()){
            int grade = input.nextInt();
            GradeCounter++;
            GradeSum+= grade;
            GradeSeparator(grade);
        }
    }
    
    public void GradeSeparator(int grade){
        switch(grade/10){
            case 10 :
            case 9 : aCount++ ; break;
            case 8 :
            case 7 : bCount++; break;
            case 6 : 
            case 5 : cCount++; break;
            case 4 : dCount++; break;
            case 3 :
            case 2 :
            case 1 : fCount++; break;
        }
    }
    
    public void GradeReport(){
        System.out.println("Grade Report\nA : "+aCount+"\nB : "+bCount+"\nC : "+cCount+"\nD : "+dCount+"\nF : "+fCount);
    }
    
    public void CourseAverage(){
        float Average = (float) GradeSum/GradeCounter;
        System.out.println("Course Average is "+Average);
    }
}