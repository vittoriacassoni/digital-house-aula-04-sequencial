package classes

import interfaces.Printable

class Bank(val name: String) : Printable{
    var bankAccounts = ArrayList<BankAccount>();

    fun insertAccount(account: BankAccount){
        bankAccounts.add(account);
        println("Conta adicionada com sucesso!");
    }

    fun removeAccount(account: BankAccount){
        bankAccounts.remove(account);
        println("Conta removida com sucesso");
    }

    fun getAccountByNumber(numberAccount: Int): BankAccount? {
        return bankAccounts.find { it -> it.numberAccount == numberAccount };
    }

    override fun showData() {
        bankAccounts.forEach { account ->
            println("---------------------------------------")
            println(account.showData());
        }
    }
}