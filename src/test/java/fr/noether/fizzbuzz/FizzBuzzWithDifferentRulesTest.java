package fr.noether.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzWithDifferentRulesTest {
    private FizzBuzz fizzBuzz;

    private void assertFizzBuzzRenderFor(int i, String s) {
        assertThat(fizzBuzz.render(i)).isEqualTo(s);
    }

    @BeforeEach
    public void setup() {
        this.fizzBuzz = new FizzBuzz(
                List.of(
                        Rule.of(i -> i % 2 == 0, "Fizz"),
                        Rule.of(i -> i % 3 == 0, "Bozz"),
                        Rule.of(i -> i % 2 != 0, "Buzz")
                )

        );
    }

    @Test
    void shouldReturnFizzWhenEvenNumber() {
        assertFizzBuzzRenderFor(2, "Fizz");
    }

    @Test
    void shouldReturnFizzBozzWhenDivisibleBy3AndBy2() {
        assertFizzBuzzRenderFor(6, "FizzBozz");
    }

    @Test
    void shouldReturnBuzzWhenOddNumber() {
        assertFizzBuzzRenderFor(11, "Buzz");
        assertFizzBuzzRenderFor(25, "Buzz");
    }
}
