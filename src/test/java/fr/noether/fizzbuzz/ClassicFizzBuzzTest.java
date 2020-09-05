package fr.noether.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ClassicFizzBuzzTest {

    private FizzBuzz fizzBuzz;

    private void assertFizzBuzzForValue(int i, String fizz) {
        assertThat(fizzBuzz.render(i)).isEqualTo(fizz);
    }

    @BeforeEach
    public void setup() {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    void shouldReturnFizzWhenDivisibleBy3() {
        var fizzBuzz = new FizzBuzz();
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
