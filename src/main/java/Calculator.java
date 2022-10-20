import java.util.Random;

class Calculator {

    Calculator(){

    }

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    0 = 0
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    int fibonacciNumberFinder(int n){

        int f[] = new int[n + 1];
        int i;

        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0;

        if (n > 0) {
            f[1] = 1;

            for (i = 2; i <= n; i++) {
                /* Add the previous 2 numbers in the series
             and store it */
                f[i] = f[i - 1] + f[i - 2];
            }
        }

        return f[n];
    }


    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    String intToBinaryNumber(int n){

        if (n == 0){
            return "0";
        }

        // Creating and assigning binary array size
        int[] binary = new int[35];
        int id = 0;

        // Number should be positive
        while (n > 0) {
            binary[id++] = n % 2;
            n = n / 2;
        }

        StringBuilder finalWord =new StringBuilder();

        // Print Binary
        // Iteration over array
        for (int i = id - 1; i >= 0; i--) {
            finalWord.append(binary[i]);
        }

        String finalFinalWord = finalWord.toString();

        return finalFinalWord;
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n){

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        String finalString = n + generatedString;

        return finalString;
    }


}
