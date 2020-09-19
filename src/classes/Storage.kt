package classes

class Storage(private var name: String, private var minAmount: Int, private var currentAmount: Int) {
    init{
        if(minAmount < 0){
            minAmount = 0
        }
        if(currentAmount < 0){
            currentAmount = 0
        }
    }

    fun changeName(newName: String){
        name = newName;
    }

    fun changeMinAmount(newMinAmount: Int){
        if(newMinAmount < 0){
            throw Exception("Quantidade minima não pode ser negativa")
        }
        minAmount = newMinAmount;

    }

    fun putOn(amount: Int){
        currentAmount += amount;
    }

    fun takeOff(amount: Int){
        if(currentAmount - amount < 0){
            throw Exception("Quantidade não pode ser negativa")
        }
        currentAmount -= amount;
    }

    fun show(): String{
        return "Produto: $name | Quantidade minima: $minAmount | Quantidade Atual: $currentAmount";
    }

    fun needReplace(): Boolean{
        return currentAmount <= minAmount
    }

}