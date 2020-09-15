package classes

class Test(val difficulty: Int, val neededEnergy: Int) {
    fun performTest(athlete: Athlete) : Boolean{
        if(athlete.energy >= neededEnergy && athlete.level >= difficulty){
            println("Atleta pode fazer prova")
            athlete.energy -= neededEnergy
            println("Energia do atleta agora é ${athlete.energy}")
            return true;
        }
        else{
            println("Atleta não pode fazer prova")
            return false
        }
    }
}