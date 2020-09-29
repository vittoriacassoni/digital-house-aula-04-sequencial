package collections

fun main(){
    var dreamLottery = mutableMapOf<Int, String>();

    dreamLottery[0] = "Ovos"
    dreamLottery[1] = "Água"
    dreamLottery[2] = "Escopeta"
    dreamLottery[3] = "Cavalo"
    dreamLottery[4] = "Dentista"
    dreamLottery[5] = "Fogo"

    var nicknames = mutableMapOf<String, MutableList<String>>();

    nicknames["João"] = arrayListOf("Juan", "Fissura", "Maromba")
    nicknames["Miguel"] = arrayListOf("Night Watch", "Bruce Wayne", "Tampinha")
    nicknames["Maria"] = arrayListOf("Wonder Woman", "Mary", "Marilene")
    nicknames["Lucas"] = arrayListOf("Lukinha", "Jorge", "George")

    dreamLottery.forEach {
        k, v ->
        println("$k = $v")
    }
    println("Apelidos --------------------------------------------------------------")
    nicknames.forEach {
        k, v ->
        println("$k = $v")
    }
}