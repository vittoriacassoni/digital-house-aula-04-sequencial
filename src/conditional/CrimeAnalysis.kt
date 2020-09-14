package conditional

// Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
// "Telefonou para a vítima?"
// "Esteve no local do crime?"
// "Mora perto da vítima?"
// "Devia para a vítima?"
// "Já trabalhou com a vítima?"
//O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
// Se a pessoa responder positivamente a 2 questões ela deve serclassificada como "Suspeita", entre 3 e 4 como
// "Cúmplice" e 5 como "Assassino".Caso contrário, ele será classificado como "Inocente".Use “S” para sim e “N” para não

fun main(){
    var yesAnswer = 0

    println("Use apenas 'S' para sim e 'N' para não")
    print("Telefonou para a vítima? ")
    var firstQuestion = readLine()!!.toString()
    if(firstQuestion.toUpperCase().equals("S")) {
        yesAnswer += 1
    }

    print("Esteve no local do crime? ")
    var secondQuestion = readLine()!!.toString()
    if(secondQuestion.toUpperCase().equals("S")) {
        yesAnswer += 1
    }

    print("Mora perto da vítima? ")
    var thirdQuestion = readLine()!!.toString()
    if(thirdQuestion.toUpperCase().equals("S")) {
        yesAnswer += 1
    }

    print("Devia para a vítima? ")
    var forthQuestion = readLine()!!.toString()
    if(forthQuestion.toUpperCase().equals("S")) {
        yesAnswer += 1
    }

    print("Já trabalhou com a vítima? ")
    var fifthQuestion = readLine()!!.toString()
    if(fifthQuestion.toUpperCase().equals("S")) {
        yesAnswer += 1
    }

    when (yesAnswer) {
        2 -> {
            print("Você é suspeito(a)")
        }
        in 3..4 -> {
            print("Você é cúmplice!")
        }
        5 -> {
            print("Você é o(a) assassino(a)!")
        }
        else -> {
            print("Você é inocente")
        }
    }
}