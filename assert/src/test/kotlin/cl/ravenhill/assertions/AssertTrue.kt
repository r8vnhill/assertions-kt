package cl.ravenhill.assertions

import io.kotest.assertions.fail

fun assertTrue(
    condition: Boolean,
    message: String = "Condition is not true"
) {
    if (!condition) {
        fail(message)
    }
}
