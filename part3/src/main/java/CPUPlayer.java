/**
 * This class represents HumanPlayer and inherits methods and attributes
 *  from Player class
 * @authors Islam Nuryyev, Moharaj Oritro
 */
public class CPUPlayer extends Player {

    /**
     * constructor for CPUPlayer class
     * @param monster the player's battling monster
     */
    public CPUPlayer(Monster monster) {
        this.monster = monster;
    }

    /**
     * This method implements AI for CPUPlayer.
     * First, AI identifies a move with the biggest power and with the most accuracy
     * Then, it checks whether a player can be eliminated with the most accurate move
     * If not, CPUPlayer hits a player with the strongest move
     * @return the smartest move
     */ 
    public int chooseMove(Player player) {
        int biggestPower = 0;
        int biggestPowerMove = 0;

        //this loop maps over the moves array and selects a move with the biggest power
        for (int i = 1; i < this.monster.getMoves().length + 1; i++) {
            if (this.monster.movesGettersMap(i).getPower() > biggestPower) {
                biggestPower = this.monster.movesGettersMap(i).getPower();
                biggestPowerMove = i;
            }
        }

        float mostAccurate = 0;
        int theMostAccurateMove = 0;

        //this loop maps over the moves array and selects a move with the highest accuracy
        for (int i = 1; i < this.monster.getMoves().length + 1; i++) {
            if (this.monster.movesGettersMap(i).getAccuracy() > mostAccurate) {
                mostAccurate = this.monster.movesGettersMap(i).getAccuracy();
                theMostAccurateMove = i;
            }
        }

        //the most probable damage that can be made to the player
        int safestDamage = this.monster.movesGettersMap(theMostAccurateMove).getPower() + this.monster.getAttack() - player.monster.getDefence();

        //if player's hp is less than or equal to the most accurate damage 
        //that CPUPlayer can do with a move, the method will return 
        //that move
        if (player.monster.getHp() <= safestDamage) {
            return theMostAccurateMove;
        } else { //else it will just return a move with the highest power 
            return biggestPowerMove;
        }
    }
}