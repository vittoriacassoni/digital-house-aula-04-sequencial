package functions

//Faça um programa com uma função chamada somaImposto. A função possuidois parâmetros formais: taxaImposto, que é a
// quantia de imposto sobre vendasexpressa em porcentagem e custo, que é o custo de um item antes do imposto.
// Afunção “altera” o valor de custo para incluir o imposto sobre vendas.

fun main(){
    println("Digite o preço do produto a ser taxado:");
    var cost = readLine()!!.toDouble();

    println("Digite a taxa de imposto em porcentagem");
    var taxRate = readLine()!!.toDouble();

    cost += sumTax(taxRate, cost);

    println("O preço do produto após imposto é de: $cost")
}

fun sumTax(taxRate: Double, cost: Double) : Double{
    return cost * (taxRate / 100);
}