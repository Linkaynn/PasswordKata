package password_checker;

public class Password {
    public boolean isValid(String password) {
        return password.length() >= 6 && hasUpperCase(password) && hasLowerCase(password) && hasANumber(password) && hasUnderscore(password);
    }

    private boolean hasUnderscore(String password) {
        return password.chars().mapToObj(value -> (char) value).anyMatch(character -> character == '_');
    }

    private boolean hasANumber(String password) {
        return password.chars().mapToObj(value -> (char) value).anyMatch(character -> asciiValue(character) >=48 && asciiValue(character) <= 57);
    }

    private boolean hasLowerCase(String password) {
        return password.chars().mapToObj(value -> (char) value).anyMatch(character -> asciiValue(character) >=97 && asciiValue(character) <= 122);
    }

    private boolean hasUpperCase(String password) {
        return password.chars().mapToObj(value -> (char) value).anyMatch(character -> asciiValue(character) >=65 && asciiValue(character) <= 90);
    }

    private int asciiValue(int character) {
        return character;
    }
}
