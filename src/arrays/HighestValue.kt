package arrays

//Escrever o código que deve analisar três números inteiros e retornar o maior deles
fun main(){
    val numbers = ArrayList<Int>();

    for(i in 0..2){
        println("Digite um número ")
        numbers.add(readLine()!!.toInt())
    }

    print("O maior número é: " + numbers.max())
}