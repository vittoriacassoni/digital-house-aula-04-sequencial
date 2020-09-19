package poo

import classes.Storage

fun main(){
    var storage = Storage("Esmalte",20, 22)

    println(storage.show())
    println("Precisa repor: ${storage.needReplace()}")
    storage.takeOff(21)
    println("Precisa repor: ${storage.needReplace()}")
    storage.putOn(50)
    storage.changeName("Esmalte brilhante")
    println(storage.show())
    storage.changeMinAmount(-5)
}