package basics
//Faça um Programa que pergunte quanto você ganha por hora e o número de horas
//trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

fun main(){
    print("Informe quanto você ganha por hora: ")
    var hourValue = readLine()!!.toFloat();

    print("Informe quantas horas você trabalhou no mês: ")
    var workedHours = readLine()!!.toInt();

    var salary = hourValue * workedHours;

    println("Seu salário é: R$ " + "%.2f".format(salary));
}