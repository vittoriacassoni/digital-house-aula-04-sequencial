package classes

class Car(val fueConsumption: Int) {
    private var tankCapacity: Double = 0.0;

    fun drive(distance: Int){
        if(tankCapacity >= (distance / fueConsumption)){
            println("Andando...")
            tankCapacity -= distance / fueConsumption
        }
        else{
            println("Sem combustível para andar")
        }
    }

    fun getTankCapacity(){
        println("Você tem $tankCapacity l de combustível");
    }

    fun fillTank(value: Int){
        tankCapacity += value;
        println("Agora você tem $tankCapacity l de combustível")
    }
}