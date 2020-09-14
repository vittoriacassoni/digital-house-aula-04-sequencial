package arrays

//Faça um Programa para um caixa eletrônico. O programa deverá perguntar aousuário a valor do saque e depois informar
// quantas notas de cada valor serãofornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais.
// O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocuparcom a quantidade de notas
// existentes na máquina.
fun main(){
    print("Digite o valor do saque: ")
    var value = readLine()!!.toInt()

    // nota de 1, 5, 10, 20, 50 e 100 na ordem
    val banknoteQuantity = intArrayOf(0, 0, 0, 0, 0, 0);
    val banknoteAvailable = arrayOf(1, 5, 10, 20, 50, 100);

    if(value in 10..600){

        for(i in 5 downTo 1){
            banknoteQuantity[i] = value / banknoteAvailable[i]
            value = value % banknoteAvailable[i]
            println(banknoteQuantity[i].toString() + " notas disponiveis de " + banknoteAvailable[i]);
        }

        banknoteQuantity[0] = value;
        println(banknoteQuantity[0].toString() + " notas disponiveis de " + banknoteAvailable[0]);

    }
    else{
        println("Este valor não pode ser sacado")
    }
}