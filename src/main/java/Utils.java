public class Utils {

    public static String concantenateWords(String word1, String word2) {

        String word3 = word1 + word2;

        return word3;
    }


    public static int computeFactorial(int Number) {

        int factorial = 1;
        for (int i=1; i<=Number; i++) {
            factorial = factorial*i;
        }

        return factorial;

    }

}
