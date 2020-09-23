package exceptions

import java.lang.IndexOutOfBoundsException

fun main(){
    try{
        var myList = ArrayList<String>();

        myList.add("Pato")
        myList.add("Cachorro")
        myList.add("Gato")

        println(myList[3])
    }catch(ex: IndexOutOfBoundsException) {
        println("Ocorreu uma exceção: ${ex.message}, motivo: ${ex.cause}")
        ex.printStackTrace()
    }catch(ex: Exception){
        println("Ocorreu uma exceção: ${ex.message}")
    }

    //Index 3 out of bounds for length 3
    //IndexOutOfBoundsException Erro que da pois a ultima posição é 2
}