public class UserAuthentication {

    public boolean login(String username, String password) {

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login successful");
            return true;
        } else {
            System.out.println("Invalid username or password");
            return false;
        }
    }

    // New Feature
    public void resetPassword(String email) {

        System.out.println("Password reset link sent to: " + email);
    }

    public static void main(String[] args) {

        UserAuthentication auth = new UserAuthentication();

        auth.login("admin", "1234");

        auth.resetPassword("admin@gmail.com");
    }
}