public class Utils {

    public static String concantenateWords(String word1, String word2) {

        if (word1 == null || word2 == null) {
            throw new NullPointerException("Null вместо строки");
        }

        return word1 + word2;
    }


    public static int computeFactorial(int Number) {

        if (Number < 0) {
            throw new IllegalArgumentException("Отрицательное число для вычисления факториала");
        }

        int factorial = 1;
        for (int i = 1; i <= Number; i++) {
            factorial = factorial * i;
        }

        return factorial;

    }

}
