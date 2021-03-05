public class DiceRoller {

    public static int RollTheDice(int min, int max){
        max = max - min;
        return(int)(Math.random()*++max)+min;
    }
}
