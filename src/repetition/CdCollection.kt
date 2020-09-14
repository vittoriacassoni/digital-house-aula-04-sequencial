package repetition

//Faça um programa que calcule o valor total investidopor um colecionador em suacoleção de CDs e o valor médio gasto em
// cada um deles.O usuário deverá informara quantidade de CDs e o valor para em cada um.
fun main(){
    print("Informe a quantidade de CDs: ")
    var quantityOfCds = readLine()!!.toInt();
    var total =  0.0;

    for (x in 1..quantityOfCds){
        print("Informe o valor do cd número $x: ")
        var priceCd = readLine()!!.toDouble();
        total += priceCd
    }
    var average = total/quantityOfCds;

    println("O valor gasto com a coleção é de R$ $total");
    println("A média por CD é de R$ " + "%.2f".format(average));
}