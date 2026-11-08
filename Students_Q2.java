import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[][] students = new String[3][2];

        System.out.println("Enter name and grade for 3 students:");
        for (int i = 0; i < 3; i++) {
            students[i][0] = s.next(); // name
            students[i][1] = s.next(); // grade
        }

        // 1. Prints each student as name: grade, built using concat.
        for (int i = 0; i < 3; i++) {
            System.out.println(students[i][0].concat(": ").concat(students[i][1]));
        }

        // 2. Prints how many students have the grade "A", in any letter case (equalsIgnoreCase).
        int countA = 0;
        for (int i = 0; i < 3; i++) {
            if (students[i][1].equalsIgnoreCase("A")) {
                countA++;
            }
        }
        System.out.println("Students with grade A: " + countA);

        // 3. Reads a prefix and prints how many names start with it (startsWith).
        System.out.print("Enter first letter: ");
        String prefix = s.next();
        int countPrefix = 0;
        for (int i = 0; i < 3; i++) {
            if (students[i][0].startsWith(prefix)) {
                countPrefix++;
            }
        }
        System.out.println("Names starting with " + prefix + ": " + countPrefix);
    }
}
