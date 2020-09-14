package conditional

//Escrever o código que deve analisar duas cadeias de texto e, caso sejam diferentes, retornar true,ou,caso sejam
// iguais, retornar false.
fun main(){
    println("Digite um texto")
    var firstText = readLine()!!

    println("Digite outro texto para comparar")
    var secondText = readLine()!!

    print("O resultado é: " + textAnalysis(firstText, secondText))

}

fun textAnalysis(firstText: String, secondText: String) : Boolean{
    return !firstText.equals(secondText)
}