package cl.ravenhill.calculator

import cl.ravenhill.assertions.assertTrue
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec

class CalculatorTest : FreeSpec({
    "A calculator" - {
        "when adding 1 and 2" - {
            "should return 3"  - {
                shouldThrow<AssertionError> {
                    assertTrue(Calculator.add(1, 2) == 3, "1 + 2 should be 3")
                }
            }
        }
    }
})
