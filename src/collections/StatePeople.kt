package collections

fun main(){
    var sp = State("SP", "São Paulo")
    var rj = State("RJ", "Rio de Janeiro")
    var mg = State("MG", "Minas Gerais")

    var people1 = People("Vittoria", sp)
    var people2 = People("Giuliana", rj)
    var people3 = People("Jurema", rj)
    var people4 = People("Marco", mg)

    val people = listOf(people1, people2, people3, people4)

    val peopleGroup = mutableMapOf<String, MutableList<People>>()

    people.forEach{
        if(!peopleGroup.containsKey(it.state.initials)){
            peopleGroup[it.state.initials] = arrayListOf()
        }

        peopleGroup[it.state.initials]?.add(it)
    }

    println(peopleGroup)

    println(people.groupBy { it.state.initials })
}