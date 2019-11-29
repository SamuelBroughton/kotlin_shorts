import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ExtractFileNameTest {
    @Test
    fun testSample() {
        assertEquals(
            "FILE_NAME.EXTENSION",
            extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION")
        )
        assertEquals(
            "FILE_NAME.EXTENSION",
            extractFileName("1_FILE_NAME.EXTENSION.OTHEREXTENSIONadasdassdassds34")
        )
    }
}
