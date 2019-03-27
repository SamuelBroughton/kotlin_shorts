import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals


class DeleteOccurrencesTests {
    @Test
    fun `return empty intArray if maxOccurrences = 0`() {
        assertArrayEquals(
            intArrayOf(),
            deleteOccurrences(intArrayOf(23, 12, 23, 12, 23), 0)
        )
    }

    @Test
    fun `return expected number of max occurrences`() {
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
        assertArrayEquals(
            intArrayOf(),
            deleteOccurrences(intArrayOf(), 5)
        )
    }
}