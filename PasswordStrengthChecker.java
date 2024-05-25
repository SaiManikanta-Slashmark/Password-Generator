public class PasswordStrengthChecker {

    public static String checkPasswordStrength(String password) {
        int score = 0;

        if (password.length() >= 8) score++;
        if (password.length() >= 16) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*\\d.*")) score++;
        if (password.matches(".*[!@#$%^&*()_\\-+=<>?/{}~|].*")) score++;

        switch (score) {
            case 0:
            case 1:
            case 2:
                return "Weak password";
            case 3:
            case 4:
                return "Medium password";
            case 5:
                return "Good password";
            case 6:
                return "Great password";
            default:
                return "Unknown password strength";
        }
    }
}
