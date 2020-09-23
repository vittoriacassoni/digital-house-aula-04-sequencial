package exceptions

import java.lang.ArithmeticException

fun main(){
    try{
        var mathCalculation = MathCalculation()

        println(mathCalculation.division(4, 0))

    }catch (ex: ArithmeticException){
        println("Ocorreu uma exceção: ${ex.message}, motivo: ${ex.cause}")
        ex.printStackTrace()
    }catch(ex: Exception){
        println("Ocorreu uma exceção: ${ex.message}")
    }

    //java.lang.ArithmeticException: / by zero
    //Divisão por 0 não pode
}
