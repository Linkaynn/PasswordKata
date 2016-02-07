package password_checker;

public class Password {
    public boolean isValid(String password) {
        return password.length() >= 6 && hasUpperCase(password);
    }

    private boolean hasUpperCase(String password) {
        return password.chars().mapToObj(value -> (char) value).anyMatch(character -> (int) character >=65 && (int) character <= 90);
    }
}
