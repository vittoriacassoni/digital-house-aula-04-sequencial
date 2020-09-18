package classes

import kotlin.math.abs

class SavingsAccount(numberAccount: Int, balance: Double, private val limit: Double) : BankAccount(numberAccount, balance) {

    override fun withdraw(value: Double): Boolean {
        return if(value <= (balance + limit)){
            balance -= value;
            println("Você sacou")
            true;
        }
        else{
            println("Saldo insuficiente");
            false;
        }
    }

    override fun deposit(value: Double): Boolean {
        balance += value;
        println("Você depositou")
        return true;
    }

    override fun showData() {
        super.showData()
        println("Limite: R$$limit")
    }
}