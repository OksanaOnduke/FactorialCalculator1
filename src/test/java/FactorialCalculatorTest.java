import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FactorialCalculatorTest {

    private final FactorialCalculator calculator = new FactorialCalculator(); // Создаем экземпляр класса для тестирования

    @Test
    public void testFactorialOfZero() {
        // Проверка, что факториал 0 равен 1
        assertEquals(calculator.factorial(0), 1, "Факториал 0 должен быть 1");
    }

    @Test
    public void testFactorialOfOne() {
        // Проверка, что факториал 1 равен 1
        assertEquals(calculator.factorial(1), 1, "Факториал 1 должен быть 1");
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        // Проверка, что факториал 5 равен 120
        assertEquals(calculator.factorial(5), 120, "Факториал 5 должен быть 120");
    }

    @Test
    public void testFactorialOfAnotherPositiveNumber() {
        // Проверка, что факториал 6 равен 720
        assertEquals(calculator.factorial(6), 720, "Факториал 6 должен быть 720");
    }

    @Test
    public void testFactorialOfLargeNumber() {
        // Проверка, что факториал 10 равен 3628800
        assertEquals(calculator.factorial(10), 3628800, "Факториал 10 должен быть 3628800");
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Число должно быть неотрицательным.")
    public void testFactorialOfNegativeNumber() {
        // Проверка, что метод выбрасывает исключение IllegalArgumentException при вводе отрицательного числа
        calculator.factorial(-1);
    }
}
