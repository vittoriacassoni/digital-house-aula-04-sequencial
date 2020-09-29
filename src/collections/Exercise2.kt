package collections

fun main(){
    println("Lista -------------------------------------")
    var listNumbers = mutableListOf<Int>();
    listNumbers.addAll(listOf(1, 5, 5, 6, 7, 8, 8, 8))

    listNumbers.forEach{
        println(it);
    }

    println(listNumbers)

    println("Conjunto -------------------------------------")
    var setNumbers = mutableSetOf<Int>()
    setNumbers.addAll(setOf(1, 5, 5, 6, 7, 8, 8, 8))
    setNumbers.forEach{
        println(it);
    }

    println(setNumbers)

    println("A diferença é que no conjunto (set) ele eliminou os elementos iguais, " +
            "pois so permite elementos unicos")
}