import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RgbToHexTest {
    @Test
    fun `kata example tests`() {
        assertEquals("000000", rgb(0, 0, 0))
        assertEquals("000000", rgb(0, 0, -20))
        assertEquals("FFFFFF", rgb(300,255,255))
        assertEquals("ADFF2F", rgb(173,255,47))
        assertEquals("9400D3", rgb(148, 0, 211))
    }
}
