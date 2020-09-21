package overrideClasses

import classes.People2

fun main(){
    var people1 = People2("Vittoria", 383981876)
    var people2 = People2("Giuliana", 383981876)

    //false sem override
    print(people1.equals(people2));
    //true com override pois esta comparando o RG, que é igual
}