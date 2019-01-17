package inf112.git;

public class FizzBuzz {

    public String compute(int number) {

        String result = "";

        if (number != 0 && number % 3 == 0) {
            result += "fizz";
        }

        if (number != 0 && number % 5 == 0) {
            result += "buzz";
        }

        if (result.isEmpty())
            return Integer.toString(number) + "";
        return result;
    }
}
