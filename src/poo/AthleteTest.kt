package poo

import classes.Athlete
import classes.Test

fun main(){
    var athlete1 = Athlete("Vittoria", 50, 3)
    var athlete2 = Athlete("Giuliana", 100, 2)

    println(athlete1.name)
    var test1 = Test(1, 20)
    test1.performTest(athlete1);
    var test2 = Test(3, 60)
    test2.performTest(athlete1)
    var test3 = Test(4, 20)
    test3.performTest(athlete1)

    println("")
    println(athlete2.name)
    var test4 = Test(1, 20)
    test4.performTest(athlete2);
    var test5 = Test(3, 60)
    test5.performTest(athlete2)
    var test6 = Test(2, 20)
    test6.performTest(athlete2)
}