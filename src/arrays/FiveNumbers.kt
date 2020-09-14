package arrays

//Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
fun main(){
    val values = ArrayList<Int>();

    for(num in 0..4){
        println("Digite um número")
        var number = readLine()!!.toInt();

        values.add(number);
    }

    values.forEach{ element ->
        println(element);
    }
}
