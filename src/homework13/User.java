package homework13;

public class User {
    private final String login;
    private final String password;
    private final String confirmPassword;

    public User(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static boolean isValuesCorrect(String login, String password, String confirmPassword) {
        boolean result;
        try {
            checkErrors(login, password, confirmPassword);
            result = true;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            result = false;
            System.out.println(result);
        }
        return result;
    }

    public static void checkErrors(String login, String password, String confirmPassword) {
        if (login.length() > 20 || login.contains(" ")) throw new WrongLoginException();
        if (password.length() > 20 || password.contains(" ") || !password.matches(".*\\d.*"))
            throw new WrongPasswordException("The password was entered incorrectly!");
        if (!password.equals(confirmPassword)) throw new WrongPasswordException("The passwords don`t match!");
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
