package conditional

// Faça um Programa que peça um número inteiro e determine se ele é par ouímpar.
// Dica: utilize o operador módulo (resto da divisão).

fun main(){
    print("Digite um número para verificar se é par ou impar: ")
    var number = readLine()!!.toInt();

    if(number % 2 == 0){
        print("É par!!");
    }
    else{
        print("É impar!!");
    }
}