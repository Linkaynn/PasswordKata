package password_checker;

public class Password {
    public boolean isValid(String password) {
        return password.length() >= 6 && hasUpperCase(password);
    }

    private boolean hasUpperCase(String password) {
        return password.chars().mapToObj(value -> (char) value).anyMatch(character -> asciiValue(character) >=65 && asciiValue(character) <= 90);
    }

    private int asciiValue(int character) {
        return character;
    }
}
