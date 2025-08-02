import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");
            Student s = new Student();
            s.input(sc);
            s.calculateGrade();
            students.add(s);
        }

        System.out.println("\n===== STUDENT REPORT =====");
        for (Student s : students) {
            s.display();
            System.out.println("--------------------------");
        }

        sc.close();
    }
}
