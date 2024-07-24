    fun main(args: Array<String>) {
            val names = arrayOf("Mary", "Paul", "Jane", "Phil",
                    "John", "Jane", "Paul", "Anthony", "Mary")
            val count = names.distinct().count()
            val first = names.sort()
            val last = names.last()

            println("There is ${count} distinct names")
            println("The first in the alphabetical order is ${names[0]}")
            println("The last in the alphabetical order is ${last}")
        //test
    }
  /*  val nums = Array(4) {i -> i*3}
    val dnum = nums.distinct()
    println(dnum)
    println("The first: ${nums.first()}")
    println("The last: ${nums.last()}")

    val nums = arrayOf("One","Two", "Three", "Four", "Five")
            println(nums[1])
    */