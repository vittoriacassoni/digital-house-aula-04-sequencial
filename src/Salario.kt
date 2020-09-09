//Faça um Programa que pergunte quanto você ganha por hora e o número de horas
//trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

fun main(){
    print("Informe quanto você ganha por hora: ")
    var salarioHora = readLine()!!.toFloat();

    print("Informe quantas horas você trabalhou no mês: ")
    var horasTrabalhadas = readLine()!!.toInt();

    var salario = salarioHora * horasTrabalhadas;

    println("Seu salário é: R$ " + "%.2f".format(salario));
}