package collections


fun main(){
    var jacket = LockerObject("Youcom", "Jaqueta de couro")
    var purse = LockerObject("Youcom", "Jaqueta de couro")
    var listPieces = mutableListOf<LockerObject>()

    listPieces.add(jacket)
    listPieces.add(purse)

    var locker = Locker()

    var number = locker.putPieces(listPieces)
    println("Numero de identificação: $number")

    locker.showPieces(number)
    locker.showPieces()

    locker.removePieces(number)

    locker.showPieces()
}