package fr.noether.fizzbuzz;

import java.util.function.Predicate;

public class Rule {
    private final String verb;
    private final Predicate<Integer> matcher;

    public Rule(Predicate<Integer> matcher, String verb) {
        this.matcher = matcher;
        this.verb = verb;
    }

    public static Rule of(Predicate<Integer> matcher, String verb) {
        return new Rule(matcher, verb);
    }

    public boolean validate(int i) {
        return matcher.test(i);
    }

    public String verb() {
        return verb;
    }
}
