import java.util.Scanner;

public class Problem4 {
    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        
        int digitCount = 0;
        int upperCount = 0;
        
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            
            if (!Character.isLetterOrDigit(ch)) {
                return false; // Contains only letters and digits
            }
            
            if (Character.isDigit(ch)) {
                digitCount++;
            }
            
            if (Character.isUpperCase(ch)) {
                upperCount++;
            }
        }
        
        return digitCount >= 2 && upperCount >= 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter password: ");
        if (s.hasNextLine()) {
            String pwd = s.nextLine();
            if (isValidPassword(pwd)) {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
        }
    }
}
