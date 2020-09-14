package classes

class Account(val numberAccount: String, val owner: Client) {
    var balance: Double = 0.0

    fun deposit(value: Double){
        this.balance += value;
        println("Você realizou um deposito de R$ $value e seu novo saldo é de R$ ${this.balance}")
    }

    fun drawOut(value: Double){
        var result = balance - value;

        if(result < 0){
            println("Saldo insuficiente")
        }
        else{
            this.balance = result
            println("Você realizou um saque de R$ $value e seu novo saldo é de R$ ${this.balance}")
        }
    }
}