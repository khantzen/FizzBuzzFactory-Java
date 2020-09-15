package fr.noether.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzForMoreThan2NumbersTest {

    private FizzBuzz fizzBuzz;

    private void assertFizzBuzzForValue(int entry, String expectedVerb) {
        assertThat(fizzBuzz.render(entry)).isEqualTo(expectedVerb);
    }

    @BeforeEach
    public void fizzBuzz() {
        this.fizzBuzz = new FizzBuzz(
                List.of(
                        Rule.of(i -> i % 13 == 0, "Fizz"),
                        Rule.of(i -> i % 17 == 0, "Buzz"),
                        Rule.of(i -> i % 19 == 0, "Bizz")
                )
        );
    }

    @Test
    void fizzBuzzShouldRenderFizzWhenDivisibleBy13() {
        assertFizzBuzzForValue(13, "Fizz");
    }

    @Test
    void fizzBuzzShouldRenderBuzzWhenDivisibleBy17() {
        assertFizzBuzzForValue(17, "Buzz");
    }

    @Test
    void fizzBuzzShouldRenderBizzWhenDivisibleBy19() {
        assertFizzBuzzForValue(19, "Bizz");
    }

    @Test
    void fizzBuzzShouldRenderVerbConcatWhenDivisibleByDifferentValue() {
        assertFizzBuzzForValue(17 * 19, "BuzzBizz");
    }

    @Test
    void fizzBuzzShouldRenderInputWhenDivisibleByNoValue() {
        assertFizzBuzzForValue(1, "1");
    }
}
