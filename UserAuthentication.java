public class UserAuthentication {

    public boolean login(String username, String password) {

        if (username.equals("user") && password.equals("5678")) {
            System.out.println("UserLogin successful");
            return true;
        } else {
            System.out.println("Invalid username or password");
            return false;
        }
    }

    public static void main(String[] args) {

        UserAuthentication auth = new UserAuthentication();

        boolean result = auth.login("user", "5678");

        System.out.println("Result: " + result);
    }
}