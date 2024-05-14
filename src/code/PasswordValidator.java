package code;

public class PasswordValidator {
    public static boolean validate(String password) {
        // length
        if (password.length() < 5 || password.length() > 9)
            return false;
        
        // other characters
        if (!password.matches("[a-zA-Z0-9]+"))
            return false;
        
        // number&letter
        boolean hasLetter = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c))
                hasLetter = true;
            else if (Character.isDigit(c))
                hasDigit = true;
        }
        return hasLetter && hasDigit;
    }
}