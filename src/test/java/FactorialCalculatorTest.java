import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {

    // Создаем экземпляр класса FactorialCalculator для тестирования
    private final FactorialCalculator calculator = new FactorialCalculator();

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, calculator.factorial(0), "Факториал 0 должен быть 1");
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, calculator.factorial(1), "Факториал 1 должен быть 1");
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, calculator.factorial(5), "Факториал 5 должен быть 120");
    }

    @Test
    public void testFactorialOfAnotherPositiveNumber() {
        assertEquals(720, calculator.factorial(6), "Факториал 6 должен быть 720");
    }

    @Test
    public void testFactorialOfLargeNumber() {
        assertEquals(2432902008176640000L, calculator.factorial(20), "Факториал 20 должен быть 2432902008176640000");
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-1);
        });
        assertEquals("Факториал определен только для неотрицательных чисел.", thrown.getMessage());
    }
}
