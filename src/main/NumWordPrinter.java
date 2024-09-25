package main;

public class NumWordPrinter {
    public String printWord(int n, boolean toUpperCase) {
        String result;
        if (n % 2 == 0 && n % 11 == 0 && n % 13 == 0) {
            result = "EvenPrimeLucky";
        } else if (n % 2 == 0 && n % 11 == 0) {
            result = "EvenPrimeEleven";
        } else if (n % 13 == 0) {
            result = "LuckyThirteen";
        } else if (n % 11 == 0) {
            result = "PrimeEleven";
        } else if (n % 2 == 0) {
            result = "Even";
        } else {
            result = "OddOneOut";
        }
        if (toUpperCase) {
            return result.toUpperCase();
        }

        return result;
    }
}

