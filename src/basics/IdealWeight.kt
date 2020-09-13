package basics
//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que
//calcule seu peso ideal, utilizando as seguintes fórmulas:

fun main(){
    print("Informe sua altura: ")
    var height = readLine()!!.toFloat();

    var womanWeight =  (62.1 * height) - 44.7;
    var manWeight =  (72.7 * height) - 58;

    println("O peso ideal se for mulher é de: " + "%.2f".format(womanWeight) + " kg");
    println("O peso ideal se for homem é de: " + "%.2f".format(manWeight) + " kg");
}