package overrideClasses

import classes.Coca

fun main(){
    var coca1 = Coca(150, 2.50)
    var coca2 = Coca(150, 3.50)

    //false sem override
    println(coca1.equals(coca2));
    //true com override pois esta comparando o tamanho, que é igual
}