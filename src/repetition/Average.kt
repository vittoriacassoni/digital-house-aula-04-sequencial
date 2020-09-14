package repetition

//Faça um programa que calcule e mostre a média aritméticade N notas.
fun main(){
    println("Digite quantas notas quer cadastrar para calcular média")
    var quantityOfGrades = readLine()!!.toInt();
    var total = 0.0;
    var average = 0.0;

    for(i in 1..quantityOfGrades){
        println("Digite a nota");
        total += readLine()!!.toDouble();
    }
    average = total / quantityOfGrades;
    println("A média de $quantityOfGrades notas é de: " + "%.2f".format(average));
}