package classes

class Dealership(var name: String) {
    var sales = ArrayList<Sale>();

    fun registerSale(client: ClientDealership, vehicle: Vehicle, value: Double){
        if(value > 0){
            var sale = Sale(client, vehicle, value);
            sales.add(sale);
            println("Venda realizada com sucesso para ${client.name} por R$ $value veículo: ${vehicle.model}");
        }else{
            println("Informe um valor válido!");
        }
    }

    fun getSales(){
        sales.forEach { sale ->
            println(sale.client.name + " " + sale.vehicle.model + " " + sale.value)
        }
    }
}