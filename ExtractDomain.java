public class ExtractDomain {
    public static String extractDomain(String email) {
        if (email == null) {
            return "Invalid Email";
        }
        
        email = email.trim();
        int index = email.indexOf('@');
        
        if (index == -1) {
            return "Invalid Email";
        }
        
        String domain = email.substring(index + 1);
        return domain.toLowerCase();
    }

    public static void main(String[] args) {
        String input = " 20252007@fue.edu ";
        System.out.println("Output: " + extractDomain(input));
    }
}
