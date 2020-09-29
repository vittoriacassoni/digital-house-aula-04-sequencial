package collections

fun main(){
    var test = Test();
    var numbers = mutableSetOf(5, 8, 7, 15, 27, 92)

    numbers.forEach{
        println(it);
    }

    test.totalSum(numbers)
}