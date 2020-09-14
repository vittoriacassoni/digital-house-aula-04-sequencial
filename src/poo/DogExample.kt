package poo

import classes.Dog;

fun main(){
    var myDog = Dog("Catarina",2010);
    myDog.color = "Branca";

    println(myDog.name)
    println(myDog.fullName)
    println(myDog.calculateAge())
    println(myDog.color)

}