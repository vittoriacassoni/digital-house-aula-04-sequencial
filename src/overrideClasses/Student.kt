package overrideClasses

import classes.Student2

fun main(){
    var students = ArrayList<Student2>();

    for (x in 0..3){
        var student = Student2("Vittoria", x)
        students.add(student)
    }

    var student = Student2("Vittoria", 2)
    //false sem override
    println(students.contains(student))
    //true com override pois esta comparando o registro, que é igual ao de um estudante na lista

}