public class UserAuthentication {

    public boolean login(String username, String password) {

        if (username.equals("admin") && password.equals("1234")) {
    System.out.println("Admin login successful");
    return true;
    } else {
            System.out.println("Invalid username or password");
            return false;
        }
    }

    public static void main(String[] args) {

        UserAuthentication auth = new UserAuthentication();

        boolean result = auth.login("admin", "1234");

        System.out.println("Result: " + result);
    }
}


