import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals

class PresentWordsTest {
    @Test
    fun `return sorted array of present strings`() {
        // Given
        val a2 = arrayOf("lively", "alive", "harp", "sharp", "armstrong")
        // When
        var a1 = arrayOf("xyz", "live", "strong")
        // Then
        assertArrayEquals(arrayOf("live", "strong"), inArray(a1, a2))

        // When
        a1 = arrayOf("live", "strong", "arp")
        // Then
        assertArrayEquals(arrayOf("arp", "live", "strong"), inArray(a1, a2))

        // When
        a1 = arrayOf("tarp", "mice", "bull")
        // Then
        assertArrayEquals(arrayOf<String>(), inArray(a1, a2))
    }
}