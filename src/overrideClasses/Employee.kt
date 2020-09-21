package overrideClasses

import classes.Employee

fun main(){
    var employees = ArrayList<Employee>();

    for (x in 0..3){
        var employee = Employee("Vittoria", x)
        employees.add(employee)
    }

    var employee = Employee("Vittoria", 2)
    //false sem override
    println(employees.contains(employee))
    //true com override pois esta comparando o registro, que é igual ao de um funcionario na lista

}