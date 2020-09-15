package classes

class TrainingSession(val experience: Int) {

    fun exerciseA(player: FootballPlayer){
        var experienceOld = player.experience;

        if(player.run() != 0) {
            if (player.scoreGoal() != 0) {
                if (player.run() != 0){
                    player.experience += this.experience;
                }
                else{
                    println("Jogador não pode fazer o treinamento");
                }
            }
            else{
                println("Jogador não pode fazer o treinamento");
            }
        }
        else{
            println("Jogador não pode fazer o treinamento");
        }
        println("Experiência inicial é de: $experienceOld e final de: ${player.experience}")

    }
}