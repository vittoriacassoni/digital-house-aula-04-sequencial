package functions

//Faça um programa, com uma função que necessite de um argumento. A funçãoretorna o valor de caractere ‘P’,
// se seu argumento for positivo, e ‘N’, se seuargumento for zero ou negativo.

fun main(){
    println("Digite um número inteiro para verficar se é positivo ou negativo");
    var number = readLine()!!.toInt();
    print(positiveOrNegative(number));
}

fun positiveOrNegative(number: Int) : Char{
    return if(number > 0){
        'P';
    } else{
        'N';
    }
}