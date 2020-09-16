package poo

import classes.ClientDealership
import classes.Dealership
import classes.Vehicle

fun main(){
    var dealership = Dealership("Cassoni's");

    var vehicle = Vehicle("Audi", "Q3", 2015, "Azul", 50);
    var client = ClientDealership("Giuliana", "Cassoni", "(11)99999-9999");

    dealership.registerSale(client, vehicle, 160000.0)
}