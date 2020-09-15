package fr.noether.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ClassicFizzBuzzWith3And5Test {

    private FizzBuzz fizzBuzz;

    private void assertFizzBuzzForValue(int i, String fizz) {
        assertThat(fizzBuzz.render(i)).isEqualTo(fizz);
    }

    @BeforeEach
    public void setup() {
        this.fizzBuzz = new FizzBuzz(
                List.of(
                        Rule.of(i -> i % 3 == 0, "Fizz"),
                        Rule.of(i -> i % 5 == 0, "Buzz")
                )
        );
    }

    @Test
    void shouldReturnFizzWhenDivisibleBy3() {
        assertFizzBuzzForValue(3, "Fizz");
    }

    @Test
    void shouldReturnBuzzWhenDivisibleBy5() {
        assertFizzBuzzForValue(5, "Buzz");
        assertFizzBuzzForValue(10, "Buzz");
    }

    @Test
    void shouldReturnFizzBuzzWhenDivisibleBy3AndFive() {
        assertFizzBuzzForValue(15, "FizzBuzz");
        assertFizzBuzzForValue(30, "FizzBuzz");
    }

    @Test
    void shouldReturnEntryWhenDivisibleNorBy5Or3() {
        assertFizzBuzzForValue(7, "7");
        assertFizzBuzzForValue(8, "8");
    }
}
