package cl.ravenhill.assertions

import io.kotest.assertions.fail

/**
 * Asserts that a list of integers is ordered, either strictly or non-strictly.
 *
 * @param list The list of integers to be checked for ordering.
 * @param isStrictlyOrdered If `true`, the list must be strictly ordered (i.e., each element must be less than the
 *   next). If `false`, the list must be non-strictly ordered (i.e., each element must be less than or equal to the
 *   next).
 * @throws AssertionError If the list is not ordered as expected.
 */
fun assertIsOrdered(list: List<Int>, isStrictlyOrdered: Boolean) {
    if (isStrictlyOrdered) {
        list.zipWithNext { a, b -> if (a >= b) fail("List is not strictly ordered") }
    } else {
        list.zipWithNext { a, b -> if (a > b) fail("List is not ordered") }
    }
}
