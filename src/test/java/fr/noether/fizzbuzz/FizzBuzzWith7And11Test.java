package fr.noether.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzWith7And11Test {

    private FizzBuzz fizzBuzz;

    private void assertFizzBuzzRenderFor(int i, String s) {
        assertThat(fizzBuzz.render(i)).isEqualTo(s);
    }

    @BeforeEach
    public void setup() {
        this.fizzBuzz = new FizzBuzz(
                List.of(
                        Rule.of(i -> i % 7 == 0, "Fizz"),
                        Rule.of(i -> i % 11 == 0, "Buzz")
                )

        );
    }

    @Test
    public void shouldRenderEntryWhenDivisibleNorBy7Or11() {
        assertFizzBuzzRenderFor(12, "12");
    }

    @Test
    public void shouldRenderFizzWhenDivisibleBy7() {
        assertFizzBuzzRenderFor(21, "Fizz");
    }

    @Test
    public void shouldRenderBuzzWhenDivisibleNorBy11() {
        assertFizzBuzzRenderFor(22, "Buzz");
    }

    @Test
    public void shouldRenderFizzBuzzWhenDivisibleBy11And7() {
        assertFizzBuzzRenderFor(77, "FizzBuzz");
    }

}
