package arrays

//Faça um Programa que leia um vetor de 10 números e mostre-os na ordeminversa
fun main(){
    val values = ArrayList<Int>();

    for(num in 0..9){
        println("Digite um número")
        var number = readLine()!!.toInt();

        values.add(number);
    }
    values.reverse();
    values.forEach{ element ->
        println(element);
    }
}