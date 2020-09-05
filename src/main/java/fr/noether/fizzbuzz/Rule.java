package fr.noether.fizzbuzz;public class Rule {
    private final int divisor;
    private final String verb;

    private Rule(int divisor, String verb) {
        this.divisor = divisor;
        this.verb = verb;
    }

    public static Rule of(int divisor, String verb) {
        return new Rule(divisor, verb);
    }

    public boolean validate(int i) {
        return i % divisor == 0;
    }

    public String verb() {
        return verb;
    }
}
