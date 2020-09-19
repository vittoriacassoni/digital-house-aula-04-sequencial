package classes

class ItemBill(var id: Int, var description: String, var amt: Int, var unitPrice: Double) {
    init{
        if(amt < 0){
            amt = 0;
        }
        if(unitPrice < 0){
            unitPrice = 0.0
        }
    }
}