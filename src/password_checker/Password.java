package password_checker;

public class Password {
    public boolean isValid(String password) {
        return password.length() >= 6 && containsUppercase(password) && containsLowercase(password) && hasNumbers(password) && hasUnderscoreCharacter(password);
    }

    private boolean hasUnderscoreCharacter(String password) {
        return password.matches(".*._.*.");
    }

    private boolean hasNumbers(String password) {
        return password.matches(".*.[0-9].*.");
    }

    private boolean containsLowercase(String password) {
        return password.matches(".*.[a-z].*.");
    }

    private boolean containsUppercase(String password) {
        return password.matches(".*.[A-Z].*.");
    }

}
