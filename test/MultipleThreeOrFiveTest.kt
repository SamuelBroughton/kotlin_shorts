import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class MultipleThreeOrFiveTest {
    @Test
    fun `kata example tests`() {
        assertEquals(23, getMultipleThreeOrFive(10))
        assertEquals(78, getMultipleThreeOrFive(20))
        assertEquals(9168, getMultipleThreeOrFive(200))
    }

    @Test
    fun `return set of multiples of 5`() {
        // Given
        val target = 21
        // When
        val multiple = 5
        // Then
        assertEquals(setOf(5, 10, 15, 20), target.getMultiplesOfN(multiple))
    }

    @Test
    fun `return set of multiples of 3`() {
        // Given
        val target = 21
        // When
        val multiple = 3
        // Then
        assertEquals(setOf(3, 6, 9, 12, 15, 18, 21), 21.getMultiplesOfN(multiple))
    }
}