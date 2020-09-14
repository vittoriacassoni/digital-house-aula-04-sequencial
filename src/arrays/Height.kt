package arrays

//Faça um Programa que peça a altura de 5 pessoas, armazene cada informaçãonum array.
// Imprima a altura na ordem inversa a ordem lida.
fun main(){
    val heights = ArrayList<Double>();

    for(num in 0..4){
        println("Digite sua altura")
        var height = readLine()!!.toDouble();

        heights.add(height);
    }
    println("Normal")
    heights.forEach{ element ->
        print("$element ,");
    }
    heights.reverse();

    println("Reverso")
    heights.forEach{ element ->
        print("$element ,");
    }
}