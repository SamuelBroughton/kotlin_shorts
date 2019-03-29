import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals
import java.util.function.LongBinaryOperator
import kotlin.math.max
import kotlin.math.min
import kotlin.test.assertEquals


class ReducingByStepsTest {
    class Som {
        @Test
        fun `return the sum of two longs`() {
            // Given
            val x: Long = 24
            val y: Long = 32
            val z: Long = -12
            // Then
            assertEquals(som(x, y), x + y)
            assertEquals(som(x, z), x + z)
        }
    }

    class Maxi {
        @Test
        fun `return the max value of two longs`() {
            // Given
            val x: Long = 24
            val y: Long = 32
            val z: Long = -12
            // Then
            assertEquals(maxi(x, y), max(x, y))
            assertEquals(maxi(x, z), max(x, z))
        }
    }

    class Mini {
        @Test
        fun `return the min value of two longs`() {
            // Given
            val x: Long = 24
            val y: Long = 32
            val z: Long = -12
            // Then
            assertEquals(mini(x, y), min(x, y))
            assertEquals(mini(x, z), min(x, z))
        }
    }

    class GDCI {
        @Test
        fun `return the abs greatest common divider of two longs`() {
            // Given
            val x: Long = 24
            val y: Long = 32
            val z: Long = -12
            // Then
            assertEquals(8, gcdi(x, y))
            assertEquals(12, gcdi(x, z))
        }
    }

    class LCMU {
        @Test
        fun `return the abs lowest common multiple of two longs`() {
            // Given
            val x: Long = 24
            val y: Long = 32
            val z: Long = -12
            // Then
            assertEquals(96, lcmu(x, y))
            assertEquals(24, lcmu(x, z))
        }
    }

    class operArray {
        @Test
        fun `test operArray with argument gdci`() {
            // Given
            val a = longArrayOf(18, 69, -90, -78, 65, 40)
            val r = longArrayOf(18, 3, 3, 3, 1, 1)
            //Then
            assertArrayEquals(r, operArray(LongBinaryOperator { x, y -> gcdi(x, y) }, a, a[0]))
        }

        @Test
        fun `test operArray with argument lcmu`() {
            // Given
            val a = longArrayOf(18, 69, -90, -78, 65, 40)
            val r = longArrayOf(18, 414, 2070, 26910, 26910, 107640)
            // Then
            assertArrayEquals(r, operArray(LongBinaryOperator { x, y -> lcmu(x, y) }, a, a[0]))
        }

        @Test
        fun `test operArray with argument som`() {
            // Given
            val a = longArrayOf(18, 69, -90, -78, 65, 40)
            val r = longArrayOf(18, 87, -3, -81, -16, 24)
            // Then
            assertArrayEquals(r, operArray(LongBinaryOperator { x, y -> som(x, y) }, a, 0))
        }

        @Test
        fun `test operArray with argument mini`() {
            // Given
            val a = longArrayOf(18, 69, -90, -78, 65, 40)
            val r = longArrayOf(18, 18, -90, -90, -90, -90)
            // Then
            assertArrayEquals(r, operArray(LongBinaryOperator { x, y -> mini(x, y) }, a, a[0]))
        }

        @Test
        fun `test operArray with argumrnt maxi`() {
            // Given
            val a = longArrayOf(18, 69, -90, -78, 65, 40)
            val r = longArrayOf(18, 69, 69, 69, 69, 69)
            // Then
            assertArrayEquals(r, operArray(LongBinaryOperator { x, y -> maxi(x, y) }, a, a[0]))
        }
    }

}