package fr.noether.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {
    private final List<Rule> rules;

    public FizzBuzz(List<Rule> rules) {
        this.rules = rules;
    }

    public String render(int i) {

        boolean noRuleMatch = this.rules.stream()
                .noneMatch(rule -> rule.validate(i));

        if (noRuleMatch) {
            return String.valueOf(i);
        }

        return this.rules.stream()
                .filter(rule -> rule.validate(i))
                .map(Rule::verb)
                .collect(Collectors.joining());
    }
}
