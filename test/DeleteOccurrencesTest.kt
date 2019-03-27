import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals


class DeleteOccurrencesTest {
    @Test
    fun `return empty intArray if maxOccurrences is less than 1`() {
        assertArrayEquals(
            intArrayOf(),
            deleteOccurrences(intArrayOf(23, 12, 23, 12, 23), 0)
        )
        assertArrayEquals(
            intArrayOf(),
            deleteOccurrences(intArrayOf(1, 1, 1, 2, 2, 1, 1), -1)
        )
    }

    @Test
    fun `return same intArray as entered when maxOccurences is greater than all occurrences`() {
        assertArrayEquals(
            intArrayOf(1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5),
            deleteOccurrences(intArrayOf(1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5), 20)
        )
        assertArrayEquals(
            intArrayOf(),
            deleteOccurrences(intArrayOf(), 5)
        )
    }

    @Test
    fun `return intArray with expected number occuring elements`() {
        assertArrayEquals(
            intArrayOf(20, 37, 21),
            deleteOccurrences(intArrayOf(20, 37, 20, 21), 1)
        )
        assertArrayEquals(
            intArrayOf(1, 1, 3, 3, 7, 2, 2, 2),
            deleteOccurrences(intArrayOf(1, 1, 3, 3, 7, 2, 2, 2, 2), 3)
        )
        assertArrayEquals(
            intArrayOf(1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5),
            deleteOccurrences(intArrayOf(1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1), 3)
        )
        assertArrayEquals(
            intArrayOf(1, 1, 1, 1, 1),
            deleteOccurrences(intArrayOf(1, 1, 1, 1, 1), 5)
        )
    }
}