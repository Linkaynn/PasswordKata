package password_checker;

public class Password {
    public boolean isValid(String password) {
        return password.length() >= 6;
    }
}
