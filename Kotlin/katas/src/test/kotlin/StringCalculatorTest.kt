import junit.framework.TestCase.assertEquals
import org.junit.Assert.fail
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.w3c.dom.ranges.RangeException

class StringCalculatorTest {

    @InjectMocks
    lateinit var stringCalculator: StringCalculator

    @Before
    fun init() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun empty_string_shouldBe_zero() {
        val result = stringCalculator.add("")
        assertEquals(0, result)
    }
    @Test
    fun returns_totalSum_success() {
        val result = stringCalculator.add("1,2,3")
        assertEquals(6, result)
    }

    @Test
    fun returns_totalSum_withOneNumber_success() {
        val result = stringCalculator.add("1")
        assertEquals(1, result)
    }

    @Test(expected = RangeException::class)
    fun doesnt_accept_negative_numbers() {
        val result = stringCalculator.add("-1,2")
        fail();
    }

}