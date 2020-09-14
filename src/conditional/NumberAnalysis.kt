package conditional

//Escrever um código que deve analisar quatro números inteiros e,caso numA seja maior que numC e numD ou caso numB
// seja maior que numC e numD,retornar true, caso contrário,retornar false
fun main(){
    println("Digite um número ")
    var numA = readLine()!!.toInt()

    println("Digite um número ")
    var numB = readLine()!!.toInt()

    println("Digite um número ")
    var numC = readLine()!!.toInt()

    println("Digite um número ")
    var numD = readLine()!!.toInt()

    if((numA > numC && numA > numD) || (numB > numC && numB > numD)){
        println("True");
    }
    else{
        println("False")
    }
}
