package classes

import interfaces.Printable

abstract class BankAccount(var numberAccount:Int, protected var balance: Double) : Printable {
    abstract fun withdraw(value: Double): Boolean
    abstract fun deposit(value: Double): Boolean

    fun transfer(value: Double, receivingAccount: BankAccount){
        if(this.withdraw(value) && receivingAccount.deposit(value)){
            println("Transferência realizada com sucesso")
        }
    }

    override fun showData() {
        println("Conta: $numberAccount, Saldo: R$ $balance")
    }
}