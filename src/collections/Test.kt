package collections

class Test {
    fun totalSum(setOfIntegers: MutableSet<Int>){
        var total = 0
        setOfIntegers.forEach{
            total += it
        }
        println("Total: $total")
    }
}