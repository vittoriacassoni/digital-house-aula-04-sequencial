package basics
//Faça um Programa que peça as 4 notas bimestrais e mostre a média

fun main(){
    print("Informe o valor da primeira nota: ")
    var firstGrade = readLine()!!.toFloat();

    print("Informe o valor da segunda nota: ")
    var secondGrade = readLine()!!.toFloat();

    print("Informe o valor da terceira nota: ")
    var thirdGrade = readLine()!!.toFloat();

    print("Informe o valor da quarta nota: ")
    var forthGrade = readLine()!!.toFloat();

    var average = (firstGrade + secondGrade + thirdGrade + forthGrade) / 4;

    println("Média: " + "%.2f".format(average));
}