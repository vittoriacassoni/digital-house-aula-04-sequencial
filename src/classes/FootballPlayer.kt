package classes

class FootballPlayer(val name: String, var energy: Int) {
    var happiness: Int = 0
    var goals: Int = 0
    var experience: Int = 0

    fun scoreGoal() : Int{
        if(this.energy < 5){
            println("Jogador está sem energia para fazer gol");
            return 0; //he doesn't score a goal
        }
        else{
            this.energy -= 5;
            this.happiness += 10;
            this.goals ++;
            println("GOOOL!")
            return 1; //it scores a goal
        }
    }

    fun run() : Int{
        if(this.energy < 10){
            println("Jogador está sem energia para correr");
            return 0; //he doesn't run
        }
        else{
            this.energy -= 10;
            println("Cansei")
            return 1; //he runs
        }
    }
}