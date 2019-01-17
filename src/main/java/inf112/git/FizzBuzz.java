package inf112.git;

public class FizzBuzz {

    public String compute(int number) {

        if (number != 0 && number % 3 == 0) {
            return "fizz";
        }
        
        if (number == 5) {
            return "buzz";
        }
        return Integer.toString(number);
    }
}
