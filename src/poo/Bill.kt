package poo

import classes.*

fun main(){
    var bill = Bill()

    var itemBill1 = ItemBill(1, "Mouse", 15, 80.0)
    var itemBill2 = ItemBill(1, "Pen drive", 100, 50.0)
    var itemBill3 = ItemBill(1, "SSD", 10, 300.0)

    bill.itemsBill.add(itemBill1)
    bill.itemsBill.add(itemBill2)
    bill.itemsBill.add(itemBill3)

    println("O valor da fatura é de R$ ${bill.getBillValueTotal()}")
}