import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.MockitoAnnotations


class FizzBuzzTest {
    @InjectMocks
    lateinit var fizzBuzz: FizzBuzz

    private lateinit var num: ArrayList<Int>

    @Before
    fun init() {
        MockitoAnnotations.initMocks(this)
        num = ArrayList()
        for ((i, numbers) in (1..100).withIndex()) {
            num.add(numbers)
        }
    }

    @Test
    fun multiples_of_3_shouldBe_fizz() {
        val result: ArrayList<String> = fizzBuzz.calculate(num)
        assertEquals("Fizz 3", result[0])
    }

    @Test
    fun multiples_of_5_shouldBe_buzz() {
        val result: ArrayList<String> = fizzBuzz.calculate(num)
        assertEquals("Buzz 5", result[1])
    }

    @Test
    fun multiples_of_3_and_5_shouldBe_fizzbuzz() {
        val result: ArrayList<String> = fizzBuzz.calculate(num)
        assertEquals("FizzBuzz 15", result[6])
    }
}