package poo

import classes.Bank
import classes.CheckingAccount
import classes.Report
import classes.SavingsAccount

fun main(){
    //Main do exercicio 6

    /* var checkingAccount = CheckingAccount(12345, 150.0, 10.0)
    var savingsAccount = SavingsAccount(678910, 150.0, 1000.0)

    checkingAccount.withdraw(15.0)
    savingsAccount.withdraw(170.0)

    var report = Report();

    report.generateReport(checkingAccount)
    report.generateReport(savingsAccount)

    savingsAccount.withdraw(990.0)
    report.generateReport(savingsAccount)*/

    //Main do exercicio 10

    var bank = Bank("Banco Cassoni");

    while(true){
        println("----------------------------------------------------------")
        println("Bem vindo ao sistema do ${bank.name}, o que deseja fazer??")
        println("Digite 1 para criar uma conta")
        println("Digite 2 para procurar por uma conta")
        println("Digite 3 para remover uma conta")
        println("Digite 4 para gerar relatório das contas")
        println("Digite 5 para sair")

        var decision = readLine()!!.toInt();
        when(decision){
            1 -> {
                var numberAccount: Int = 0
                var balance: Double = 0.0

                println("Digite qual tipo de conta que é? C (conta corrente) ou P (poupança)")
                var typeAccount = readLine()!!
                if (typeAccount.toUpperCase() == "C") {
                    println("Digite o número da conta:")
                    numberAccount = readLine()!!.toInt();

                    println("Digite o saldo:")
                    balance = readLine()!!.toDouble();

                    println("Digite o valor da taxa de operação:")
                    var operationRate = readLine()!!.toDouble();

                    var account = CheckingAccount(numberAccount, balance, operationRate)
                    bank.insertAccount(account)
                }
                else if (typeAccount.toUpperCase() == "P") {
                    println("Digite o número da conta:")
                    numberAccount = readLine()!!.toInt();

                    println("Digite o saldo:")
                    balance = readLine()!!.toDouble();

                    println("Digite o valor do limite:")
                    var limit = readLine()!!.toDouble();

                    var account = SavingsAccount(numberAccount, balance, limit)
                    bank.insertAccount(account)
                }
                else{
                    println("Digite um tipo de conta válido")
                }
            }
            2 -> {
                println("Digite o número da conta:")
                var numberAccount = readLine()!!.toInt();
                var currentAccount = bank.getAccountByNumber(numberAccount)

                if (currentAccount != null) {
                    while (true) {
                        println("----------------------------------------------------------")
                        println("Digite 1 para depositar")
                        println("Digite 2 para sacar")
                        println("Digite 3 para transferir")
                        println("Digite 4 para gerar relatório")
                        println("Digite 5 para voltar ao menu anterior")

                        var secondDecision = readLine()!!.toInt();

                        when (secondDecision) {
                            1 -> {
                                println("Digite o valor que deseja depositar:")
                                var value = readLine()!!.toDouble();
                                if (currentAccount.deposit(value)) break
                            }
                            2 -> {
                                println("Digite o valor que deseja sacar:")
                                var value = readLine()!!.toDouble();
                                if (currentAccount.withdraw(value)) break
                            }
                            3 -> {
                                println("Digite o valor que deseja transferir:")
                                var value = readLine()!!.toDouble();

                                println("Digite o número da conta que deseja transferir:")
                                var numberAccount = readLine()!!.toInt();
                                var receivingAccount = bank.getAccountByNumber(numberAccount)

                                if (currentAccount != null) {
                                    if (receivingAccount != null) {
                                        currentAccount.transfer(value, receivingAccount)
                                    }
                                    break;
                                } else {
                                    println("Conta inexistente")
                                }
                            }
                            4 -> currentAccount.showData()
                            5 -> break
                            else -> println("Digite uma opção válida")
                        }
                    }
                } else {
                    println("Conta inexistente")
                }
            }
            3 ->{
                println("Digite o número da conta:")
                var numberAccount = readLine()!!.toInt();
                var currentAccount = bank.getAccountByNumber(numberAccount)

                if(currentAccount != null){
                    bank.removeAccount(currentAccount)
                }
                else{
                    println("Conta inexistente")
                }
            }
            4 -> {
                println("Relatório ---------------------------------------------")
                bank.showData();
            }
            5 -> break;
            else -> println("Digite uma opção válida")
        }
    }
}