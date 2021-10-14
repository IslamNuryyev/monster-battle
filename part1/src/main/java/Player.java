import java.util.Random;

/**
 * The abstract class Player represents players in general
 * @authors Islam Nuryyev, Moharaj Oritro
 */
public abstract class Player {
    protected Monster monster;

    /**
     * abstract method 
     * @return number of a move
     */
    public abstract int chooseMove();

    /**
     * this method determines whether a monster is dead or not
     * @return true or false
     */
    public Boolean hasLost() {
        return this.monster.getHp() < 1;
    }

    /**
     * this method determines if a player is faster than another one
     * @param enemy another player
     * @return true or false value
     */
    public Boolean isFasterThan(Player enemy){
        return this.monster.getSpeed() > enemy.monster.getSpeed(); 
    }

    /**
     * this getter method returns monster
     * @return Monster instance object
     */
    public Monster getMonster() {
        return this.monster;
    }

    /**
     * attack method to attack enemy with the selected move
     * @param enemy the other player
     * @param playerMove selected move of a monster
     */
    public void attack(Player enemy, int playerMove) {
        int damageDealt = 0;
        Move move = null;

        //switch statement to get the corresponding move based on a user selection or a generated value
        switch (playerMove) {
            case 1:
                move = this.monster.getMove1();
                break;
            case 2:
                move = this.monster.getMove2();
                break;

            case 3:
                move = this.monster.getMove3();
                break;

            case 4:
                move = this.monster.getMove4();
                break;
            }
        
        //generating a random floating number between 0.0 and 1.0
        Random rand = new Random();
        float f = rand.nextFloat();

        System.out.println(this.monster.getName() + " uses " + move.getName() + ".");

        //If the f number is greater than the accuracy of the move 
        //then the move is a miss and no damage is dealt to the defending monster.
        if (f > move.getAccuracy()) {
            damageDealt = 0;
        } else { //otherwise, the damage will be made
            damageDealt = this.monster.getAttack() + move.getPower() - enemy.monster.getDefence();
        }
        System.out.println(this.monster.getName() + " hit for " + damageDealt + " points of damage.");
        
        enemy.monster.setHp(enemy.monster.getHp() - damageDealt);
    }
}