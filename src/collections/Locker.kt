package collections

class Locker {
    var piecesKeeping = mutableMapOf<Int, MutableList<LockerObject>>()
    var counter = piecesKeeping.size

    fun putPieces(pieces: MutableList<LockerObject>) : Int{
        piecesKeeping[counter] = pieces
        counter++;
        return counter - 1;
    }

    fun showPieces(){
        if(piecesKeeping.size == 0){
            println("Não existem peças guardadas")
        }
        else{
            piecesKeeping.forEach {
                k, v ->
                println("Identificação: $k Peças: $v")
            }
        }
    }

    fun showPieces(number: Int){
        var piece = piecesKeeping[number]

        println(piece)
    }

    fun removePieces(number: Int){
        piecesKeeping.remove(number);
    }
}