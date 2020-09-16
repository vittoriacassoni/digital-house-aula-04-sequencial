package poo

import classes.Car

fun main(){
    var myCar = Car(15);

    myCar.drive(100);
    myCar.fillTank(20);
    myCar.drive(100);
    myCar.getTankCapacity();
}