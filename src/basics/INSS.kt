package basics

// Faça um Programa que pergunte quanto você ganha por hora e o número dehoras trabalhadas no mês. Calcule e mostre
// o total do seu salário no referido mês,sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e
// 5% para o sindicato
fun main(){
    print("Informe qual o seu salário por hora: ")
    var hourValue = readLine()!!.toDouble()
    print("Informe a quantidade de horas trabalhadas: ")
    var workedHours = readLine()!!.toDouble()

    var salaryGross = hourValue * workedHours
    var IR = salaryGross * 0.11
    var INSS = salaryGross * 0.08
    var society = salaryGross * 0.05

    var salary = salaryGross - IR - INSS - society
    println("+ Salário Bruto   : R$ " + "%.2f".format(salaryGross))
    println("- IR (11%)        : R$ " + "%.2f".format(IR))
    println("- INSS (8%)       : R$ " + "%.2f".format(INSS))
    println("- Sindicato (5%)  : R$ " + "%.2f".format(society))
    println("= Salário Líquido : R$ " + "%.2f".format(salary))
}