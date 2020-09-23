package exceptions


class MathCalculation {
    @Throws(ArithmeticException::class)
    fun division(number1: Int, number2: Int) : Int {
        /*try{
            return number1/number2
        }catch (ex: ArithmeticException){
            println("Operação não podera ser realizada")
            return 0;
        }*/

        if(number2 == 0){
            throw ArithmeticException("Não pode dividir por 0")
        }

        return number1 / number2;
    }
}