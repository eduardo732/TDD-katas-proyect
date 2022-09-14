class FizzBuzz {
    fun calculate(num: ArrayList<Int>): ArrayList<String> {
        val response: ArrayList<String> = ArrayList()
        num.forEach {
                el -> if(el%3 == 0 && el%5 == 0) response.add("FizzBuzz $el")
            else if(el%3 == 0) response.add("Fizz $el")
            else if (el%5 == 0) response.add("Buzz $el")
        }
        return response
    }
}