//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que
//calcule seu peso ideal, utilizando as seguintes fórmulas:

fun main(){
    print("Informe sua altura: ")
    var altura = readLine()!!.toFloat();

    var pesoMulher =  (62.1 * altura) - 44.7;
    var pesoHomem =  (72.7 * altura) - 58;

    println("O peso ideal se for mulher é de: " + "%.2f".format(pesoMulher) + " kg");
    println("O peso ideal se for homem é de: " + "%.2f".format(pesoHomem) + " kg");
}