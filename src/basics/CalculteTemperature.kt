package basics

//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme emostre a temperatura em
// graus Celsius.

fun main(){
    var degreesFahrenheit = readLine()!!.toDouble();

    var degreesCelsius = 5 * ((degreesFahrenheit-32) / 9);

    println("A temperatura em graus Celsius é : " + "%.2f".format(degreesCelsius))
}