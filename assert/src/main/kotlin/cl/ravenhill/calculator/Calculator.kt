package cl.ravenhill.calculator

/**
 * A simple calculator object with intentionally faulty implementation for demonstration purposes.
 *
 * The `Calculator` object provides a method to add two integers, but the implementation contains a deliberate mistake
 * (subtracting instead of adding). This is designed to demonstrate the use of assertions in testing, where the
 * incorrect behavior can be detected and corrected.
 *
 * ## Usage:
 *
 * This object is used to show how assertions can catch incorrect behavior during testing. The method `add` subtracts
 * the second value from the first instead of adding them.
 *
 * ### Example 1: Using the Faulty `add` Method
 * ```kotlin
 * val result = Calculator.add(3, 2)
 * assertTrue(result == 5, "3 + 2 should be 5")
 * ```
 *
 * In this example, the assertion fails because the method incorrectly subtracts the values. Testing frameworks or
 * custom assertions can be used to catch this error and verify that the implementation needs fixing.
 */
object Calculator {
    /**
     * Adds two integers, but incorrectly subtracts `b` from `a` to demonstrate assertions.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The difference between `a` and `b`, instead of their sum.
     */
    fun add(a: Int, b: Int): Int = a - b
}
