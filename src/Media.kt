//Faça um Programa que peça as 4 notas bimestrais e mostre a média

fun main(){
    print("Informe o valor da primeira nota: ")
    var nota1 = readLine()!!.toFloat();

    print("Informe o valor da segunda nota: ")
    var nota2 = readLine()!!.toFloat();

    print("Informe o valor da terceira nota: ")
    var nota3 = readLine()!!.toFloat();

    print("Informe o valor da quarta nota: ")
    var nota4 = readLine()!!.toFloat();

    var media = (nota1 + nota2 + nota3 + nota4) / 4;

    println("Média: " + "%.2f".format(media));
}