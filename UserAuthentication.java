public class UserAuthentication {

  public boolean login(String username, String password) {

    if ((username.equals("admin") && password.equals("1234")) ||
        (username.equals("user") && password.equals("pass"))) {

        System.out.println("Login successful");
        return true;
    }

    System.out.println("Invalid credentials");
    return false;
}

    public static void main(String[] args) {

        UserAuthentication auth = new UserAuthentication();

        boolean result = auth.login("admin", "1234");
        boolean result1 = auth.login("user", "5678");
        System.out.println("Result: " + result);
    }
}


