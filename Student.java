import java.util.Scanner;
import java.util.*;

public class Student{
    int id;
    String name;
    int marks;
    String grade;

    public void input(Scanner sc){

    System.out.println("Enter Student Id: ");
    id= sc.nextInt(); sc.nextLine();

    System.out.println("Enter Student Name: ");
    name= sc.nextLine();

    System.out.println("Enter Student Marks: ");
    marks= sc.nextInt(); sc.nextLine();

    }

    public void calculateGrade(){
        if(marks>=90){
            grade = "A";
        }else if(marks>=75){
            grade = "B";
        }else if(marks>=60){
            grade = "C";
        }else {
            grade = "FAIL";
        }
    }

    public void display(){
        System.out.println("Student Id: "+id);
        System.out.println("Student Name: "+name);
        System.out.println("Student Marks: "+marks);
        System.out.println("Student Grade: "+grade);
    }
    
}