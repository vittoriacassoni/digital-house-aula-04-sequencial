package conditional

//Faça um Programa para um caixa eletrônico.

fun main(){
    print("Digite o valor do saque: ")
    var value = readLine()!!.toInt()

    var banknoteOfOne: Int
    var banknoteOfFive: Int
    var banknoteOfTen: Int
    var banknoteOfFifty: Int
    var banknoteOfHundred: Int

    var over: Int

    if(value >= 10 && value <= 600){
        banknoteOfHundred = value / 100
        over = value % 100

        banknoteOfFifty = over / 50
        over = over % 50

        banknoteOfTen = over / 10
        over = over % 10

        banknoteOfFive = over / 5
        over = over % 5

        banknoteOfOne = over

        println("Serão fornecidas $banknoteOfHundred notas de 100, $banknoteOfFifty notas de 50, $banknoteOfTen notas de 10, $banknoteOfFive notas de 5 e $banknoteOfOne notas de 1")
    } else{
        println("Este valor não pode ser sacado")
    }
}