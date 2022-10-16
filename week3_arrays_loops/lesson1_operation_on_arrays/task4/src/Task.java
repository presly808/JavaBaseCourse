public class Task {
    // check length, password has to contain 8 symbols
    public static boolean checkPassword(char[] guess, char[] password) {
        if (guess.length != password.length) {
            return false;
        }

        if (guess.length == 0) {
            return false;
        }

        return
                guess[0] == password[0] &&
                guess[1] == password[1] &&
                guess[2] == password[2] &&
                guess[3] == password[3] &&
                guess[4] == password[4] &&
                guess[5] == password[5] &&
                guess[6] == password[6] &&
                guess[7] == password[7];
    }
}