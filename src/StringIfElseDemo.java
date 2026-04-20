public class StringIfElseDemo {
    public static void main(String[] args) {

        // username
        String username = "AliKhan";

        // display username
        System.out.println("Username: " + username);

        // length check
        if (username.length() > 5) {
            System.out.println("Username is long enough");
        } else {
            System.out.println("Username is too short");
        }

        // password
        String password = "1234";

        // password check
        if (password.equals("1234")) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is incorrect");
        }

        // contains check
        if (username.contains("A")) {
            System.out.println("Username contains 'A'");
        } else {
            System.out.println("Username does not contain 'A'");
        }

        // empty check
        if (username.isEmpty()) {
            System.out.println("Username is empty");
        } else {
            System.out.println("Username is not empty");
        }
    }
}