package functions

import kotlin.random.Random

//Jogo de Craps. Faça um programa de implemente um jogo de Craps. O jogadorlança um par de dados, obtendo um valor entre
// 2 e 12. Se, na primeira jogada, vocêtirar 7 ou 11, você um "natural" e ganhou. Se você tirar 2, 3 ou 12 na primeira
// jogada, isto é chamado de "craps" e você perdeu. Se, na primeira jogada, você fezum 4, 5, 6, 8, 9 ou 10,este é seu
// "Ponto". Seu objetivo agora é continuar jogando osdados até tirar este número novamente. Você perde, no entanto,
// se tirar um 7 antesde tirar este Ponto novamente

fun main(){
    println("Rolar dados?? (s ou n)")
    var roll = readLine()!!.toString();
    var diceValue = 0;
    var diceOldValue : Int? = null;
    if(roll == "s"){
        diceValue = rollDice();
        var result = verifyResult(diceValue, null);
        if(result == 0){
            println("Você tirou $diceValue! Parabéns você ganhou!")
        }
        else if(result == 1){
            println("Você tirou $diceValue! Você perdeu =(")

        }
        else{
            println("Você tirou $diceValue! Aperte enter para tentar novamente");
            readLine();
            diceOldValue = diceValue;
            while(true){
                diceValue = rollDice();
                result = verifyResult(diceValue, diceOldValue);
                if(result == 0){
                    println("Você tirou $diceValue! Parabéns você ganhou!");
                    break;
                }
                else if(result == 1){
                    println("Você tirou $diceValue! Você perdeu =(")
                    break;
                }
                println("Você tirou $diceValue! Aperte enter para tentar novamente");
                readLine();
            }
        }
    }
    else{
        println("Opa você não quer jogar mais =(")
    }
}

fun rollDice() : Int{
    return Random.nextInt(2, 12);
}

fun verifyResult(result : Int, oldResult: Int?) : Int{
    if(oldResult == null) {
        when (result) {
            7, 11 -> return 0; //0 you won
            2, 3, 12 -> return 1; //1 you lost
            4, 5, 6, 8, 9, 10 -> return 2; //2 you play again
            else -> return 3;
        }
    } else {
        return if (result == oldResult) {
            0;
        } else if (result == 7) {
            1;
        } else {
            2;
        }
    }
}