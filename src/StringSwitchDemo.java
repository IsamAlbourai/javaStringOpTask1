public class StringSwitchDemo {
    public static void main(String[] args) {

        // String variable
        String role = "Admin";

        // display original string
        System.out.println("Role: " + role);

        // switch statement
        switch (role) {

            case "Admin":
                System.out.println("Full access granted");
                break;

            case "Teacher":
                System.out.println("Access to student records");
                break;

            case "Student":
                System.out.println("Access to own data only");
                break;

            default:
                System.out.println("Unknown role");
                break;
        }

        // test another value
        role = "Teacher";
        System.out.println("\nRole: " + role);

        switch (role) {

            case "Admin":
                System.out.println("Full access granted");
                break;

            case "Teacher":
                System.out.println("Access to student records");
                break;

            case "Student":
                System.out.println("Access to own data only");
                break;

            default:
                System.out.println("Unknown role");
                break;
        }

        // test unknown value
        role = "Guest";
        System.out.println("\nRole: " + role);

        switch (role) {

            case "Admin":
                System.out.println("Full access granted");
                break;

            case "Teacher":
                System.out.println("Access to student records");
                break;

            case "Student":
                System.out.println("Access to own data only");
                break;

            default:
                System.out.println("Unknown role");
                break;
        }
    }
}