package poo

import classes.Client
import classes.Account

fun main(){
    var client = Client("Vittoria", "Cassoni");

    var account = Account("123456", client);

    account.deposit(100.0);
    account.drawOut(150.0);
    account.drawOut(90.0);
}