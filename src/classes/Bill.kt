package classes

class Bill {
    var itemsBill = ArrayList<ItemBill>()

    fun getBillValueTotal() : Double{
        var billValueTotal = 0.0
        itemsBill.forEach { item ->
            billValueTotal += item.unitPrice * item.amt
        }

        return billValueTotal;
    }
}