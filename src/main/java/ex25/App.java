package ex25;
import CustomUtils.*;

public class App {
    // Returns an Int 1-4 depending on the following characteristics:
    // 1 - A very weak password contains only numbers and is fewer than eight characters.
    // 2 - A weak password contains only letters and is fewer than eight characters.
    // 3 - A strong password contains letters and at least one number and is at least eight characters.
    // 4 - A very strong password contains letters, numbers, and special characters and is at least eight characters.
    public static int passwordValidator(String password) {
        boolean containsLetter = false;
        boolean containsNumber = false;
        boolean containsSpecial = false;
        boolean isShort = password.length() < 8;

        for (char ch : password.toCharArray()) {
            if (Character.isLetter(ch))
                containsLetter = true;
            else if (Character.isDigit(ch))
                containsNumber = true;
            else
                containsSpecial = true;
        }

        int strength = 0;

        if (containsNumber) strength += 1;
        if (containsLetter) strength += 2;

        if (strength == 3) {
            if (isShort)
                strength -= 1;
            else if (containsSpecial)
                strength += 1;
        }

        return strength;
    }

    public static String getPasswordLevelString(int strength) {
        String levelString = "";

        if (strength <= 1) levelString = "very weak";
        if (strength == 2) levelString = "weak";
        if (strength == 3) levelString = "strong";
        if (strength >= 4) levelString = "very strong";

        return levelString;
    }

    public static void main( String[] args ) {
        String password = Input.GetString("Please enter a password to test: ");

        int strength = passwordValidator(password);
        String level = getPasswordLevelString(strength);

        System.out.printf("The password: '%s' is a %s password.", password, level);
    }
}
