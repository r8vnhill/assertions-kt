package cl.ravenhill.ordered

import cl.ravenhill.assertions.assertIsOrdered
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec

class IsOrderedTest : FreeSpec({
    "An integer list with no duplicates" - {
        "when asserting that it is ordered" - {
            "should pass if it is ordered" {
                val list = listOf(1, 2, 3, 4, 5)
                assertIsOrdered(list, true)
            }

            "should fail if it is not ordered" {
                val list = listOf(1, 3, 2, 4, 5)
                shouldThrow<AssertionError> {
                    assertIsOrdered(list, true)
                }
            }
        }
    }

    "An integer list with duplicates" - {
        "when asserting that it is ordered" - {
            "should fail if it is not strictly ordered" {
                val list = listOf(1, 2, 2, 3, 4, 5)
                shouldThrow<AssertionError> {
                    assertIsOrdered(list, true)
                }
            }

            "should pass if it is ordered" {
                val list = listOf(1, 2, 2, 3, 4, 5)
                assertIsOrdered(list, false)
            }
        }
    }
})
