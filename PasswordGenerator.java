import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    private boolean useUppercase;
    private boolean useLowercase;
    private boolean useNumbers;
    private boolean useSymbols;
    private int passwordLength;
    private String passwordAlphabet = "";

    public void getUserPreferences() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Use uppercase letters? (Yes/No): ");
        useUppercase = scanner.nextLine().equalsIgnoreCase("Yes");

        System.out.println("Use lowercase letters? (Yes/No): ");
        useLowercase = scanner.nextLine().equalsIgnoreCase("Yes");

        System.out.println("Use numbers? (Yes/No): ");
        useNumbers = scanner.nextLine().equalsIgnoreCase("Yes");

        System.out.println("Use symbols? (Yes/No): ");
        useSymbols = scanner.nextLine().equalsIgnoreCase("Yes");

        System.out.println("Enter desired length of the password: ");
        passwordLength = scanner.nextInt();
        scanner.close();
        buildPasswordAlphabet();
    }

    private void buildPasswordAlphabet() {
        if (useUppercase) passwordAlphabet += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (useLowercase) passwordAlphabet += "abcdefghijklmnopqrstuvwxyz";
        if (useNumbers) passwordAlphabet += "0123456789";
        if (useSymbols) passwordAlphabet += "!@#$%^&*()_-+=<>?/{}~|";

        if (passwordAlphabet.isEmpty()) {
            System.out.println("No character types selected, using lowercase by default.");
            passwordAlphabet = "abcdefghijklmnopqrstuvwxyz";
        }
    }

    public String generatePassword() {
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < passwordLength; i++) {
            int index = random.nextInt(passwordAlphabet.length());
            password.append(passwordAlphabet.charAt(index));
        }

        return password.toString();
    }
}
