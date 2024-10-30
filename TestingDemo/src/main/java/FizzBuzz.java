public class FizzBuzz {
    public String fizzbuzz(int num) {
        if (num % 5 == 0 && num % 3 == 0) {
            return "Fizzbuzz";
        }
        else if (num % 3 == 0) {
            return "Fizz";
        }
        else if (num % 5 == 0) {
            return "Buzz";
        }
        else {
            return String.valueOf(num);
        }
    }
}
