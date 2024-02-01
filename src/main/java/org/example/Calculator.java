package org.example;

import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;

/**
 * Класс <code>Calculator</code> реализует интерфейс <code>CalculatorService</code>, предоставляя
 * реализацию основных арифметических операций. Класс используется в обучающем проекте по TestNG
 * для демонстрации тестирования реальных методов.
 *
 * <p>Класс аннотирован с <code>@Slf4j</code> для интеграции с логгером SLF4J, обеспечивающим логирование
 * в процессе выполнения методов.</p>
 */
@Slf4j
public class Calculator implements CalculatorService {

    /**
     * Суммирует два целых числа, используя <code>Math.addExact</code> для предотвращения переполнения.
     * Включает вызов <code>sleepRandomTime</code> для имитации задержки в вычислениях.
     *
     * @param x Первое число для суммирования.
     * @param y Второе число для суммирования.
     * @return Сумма x и y.
     */
    @Override
    @Step("Summing two numbers: {0} and {1}")
    public int sum(int x, int y) {
        return Math.addExact(x, y);
    }

    /**
     * Вычитает одно целое число из другого, используя <code>Math.subtractExact</code>.
     * Включает вызов <code>sleepRandomTime</code> для имитации задержки в вычислениях.
     *
     * @param x Число, из которого производится вычитание.
     * @param y Число, которое вычитается.
     * @return Результат вычитания y из x.
     */
    @Override
    @Step("Subtracting two numbers: {0} - {1}")
    public int subtract(int x, int y) {
        return Math.subtractExact(x, y);
    }

    /**
     * Умножает два целых числа, используя <code>Math.multiplyExact</code>.
     *
     * @param x Первый множитель.
     * @param y Второй множитель.
     * @return Произведение x и y.
     */
    @Override
    @Step("Multiplying two numbers: {0} * {1}")
    public int multiple(int x, int y) {
        return Math.multiplyExact(x, y);
    }

    /**
     * Делит одно целое число на другое с округлением результата вниз, используя <code>Math.floorDiv</code>.
     * Включает вызов <code>sleepRandomTime</code> для имитации задержки в вычислениях.
     *
     * @param x Делимое.
     * @param y Делитель.
     * @return Результат деления x на y с округлением вниз.
     */
    @Override
    @Step("Dividing {0} by {1} with floor rounding")
    public double divideWithFloor(int x, int y) {
        return Math.floorDiv(x, y);
    }

    /**
     * Определяет, является ли число нечётным.
     * Включает вызов <code>sleepRandomTime</code> для имитации задержки в вычислениях.
     *
     * @param x Число для проверки.
     * @return <code>true</code>, если x нечётное; иначе <code>false</code>.
     */
    @Override
    @Step("Checking if the number {0} is odd")
    public boolean isOdd(int x) {
        return x % 2 != 0;
    }

}
