package poo

import classes.FootballPlayer
import classes.TrainingSession

fun main(){
    var john = FootballPlayer("John", 100);
    var jack = FootballPlayer("Jack", 10);

    var training = TrainingSession(20);

    println("John")
    training.exerciseA(john);
    println("Jack")
    training.exerciseA(jack)
}