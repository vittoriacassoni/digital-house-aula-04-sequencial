package poo

import classes.Client
import classes.Account

fun main(){
    var client = Client("Vittoria", "Cassoni");

    var account = Account("123456", client);

    account.deposit(100.0);
    account.drawOut(150.0);

    var client2 = Client("Giuliana", "Cassoni");

    var account2 = Account("987456", client2);

    account2.deposit(50.0);
    account2.drawOut(40.0);
}