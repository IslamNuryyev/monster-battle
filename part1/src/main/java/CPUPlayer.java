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
     * this method randomly generates a move for CPUPlayer,
     *  number between 1 and 4
     * @return integer between 1 and 4
     */ 
    public int chooseMove() {
        return (int)Math.floor(Math.random()*(4-1+1)+1);
    }
}