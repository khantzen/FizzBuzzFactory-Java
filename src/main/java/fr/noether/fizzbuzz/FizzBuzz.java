package fr.noether.fizzbuzz;

public class FizzBuzz {
    private final int fizzDivisor;
    private final int buzzDivisor;

    public FizzBuzz(int fizzDivisor, int buzzDivisor) {
        this.fizzDivisor = fizzDivisor;
        this.buzzDivisor = buzzDivisor;
    }

    public String render(int i) {
        if (i % buzzDivisor == 0 && i % fizzDivisor == 0) {
            return "FizzBuzz";
        }

        if (i % buzzDivisor == 0) {
            return "Buzz";
        }

        if (i % fizzDivisor == 0) {
            return "Fizz";
        }

        return String.valueOf(i);
    }
}
