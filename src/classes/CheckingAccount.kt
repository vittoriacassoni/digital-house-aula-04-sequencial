package classes

class CheckingAccount(numberAccount: Int, balance: Double, private val operationRate: Double) : BankAccount(numberAccount, balance) {

    override fun withdraw(value: Double): Boolean {
        return if(balance - (value + operationRate) < 0){
            println("Saldo insuficiente")
            false;
        }
        else{
            balance -= value + operationRate;
            println("Você sacou");
            true;
        }
    }

    override fun deposit(value: Double): Boolean {
        return if(balance + value >= operationRate) {
            balance += value - operationRate;
            println("Você depositou")
            true;
        }
        else{
            println("Deposite um valor maior")
            false;
        }
    }

    override fun showData() {
        super.showData()
        println("Taxa de operação: R$ $operationRate")
    }
}