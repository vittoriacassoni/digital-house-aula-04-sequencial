package repetition

// Desenvolva um gerador de tabuada, capaz de gerara tabuada de qualquernúmero inteiro entre 1 a 10. O usuário deve
// informarde qual número ele deseja vera tabuada. A saída deve ser conforme o exemplo abaixo:
fun main(){
    println("Informe o valor que deseja ver a tabuada")
    var number = readLine()!!.toInt();

    for(i in 0..10){
        println("$number X $i = " + number * i)
    }
}