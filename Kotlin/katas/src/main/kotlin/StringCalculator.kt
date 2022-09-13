import org.w3c.dom.ranges.RangeException

class StringCalculator {
    fun add(c: String): Int {
        if (c == "") return 0;
        val integers = c.split(",").map { n -> n.toInt() }
        val negatives = integers.filter { x -> x < 0 }
        if (negatives.isNotEmpty()) throw RangeException(500, "The function doesn't work with negatives")
        return integers.reduce { acc, el -> acc + el }
    }

}