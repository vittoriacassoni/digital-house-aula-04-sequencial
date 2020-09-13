package functions

// Faça um programa, com uma função que necessite de três argumentos,
// e que forneça a soma desses três argumentos.

fun main(){
    println("Digite o primeiro número")
    var firstNumber = readLine()!!.toInt();
    println("Digite o primeiro número")
    var secondNumber = readLine()!!.toInt();
    println("Digite o primeiro número")
    var thirdNumber = readLine()!!.toInt();

    var result = sumNumbers(firstNumber, secondNumber, thirdNumber);

    print("A soma dos números informados é: $result");

}

fun sumNumbers(firstNumber: Int, secondNumber: Int, thirdNumber: Int) : Int{
    return firstNumber + secondNumber + thirdNumber;
}