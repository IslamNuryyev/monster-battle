/**
 * This class represents a monster with four available moves
 * @authors Islam Nuryyev, Moharaj Oritro
 */
public class Monster {
    private String name;
    private String type;
    private int hp;
    private int speed;
    private int attack;
    private int defence;
    private Move move1;
    private Move move2;
    private Move move3;
    private Move move4;

    /**
     * This constructs a monster with specified attributes
     * @param name name of a monster
     * @param type type of a monster
     * @param hp the hit points of a monster
     * @param speed the speed stat of a monster
     * @param attack attack stat of a monster
     * @param defence defence stat of a monster
     * @param move1 first move of a monster
     * @param move2 second move of a monster
     * @param move3 third move of a monster
     * @param move4 fourth move of a monster
     */
    public Monster(String name, String type, int hp, int speed, int attack, int defence, Move move1, Move move2, Move move3, Move move4) {
        this.name = name;
        this.type = type;
        this.setHp(hp);
        this.speed = speed;
        this.attack = attack;
        this.defence = defence;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }
    
    public Move getMove4() {
        return move4;
    }

    public Move getMove3() {
        return move3;
    }

    public Move getMove2() {
        return move2;
    }

    public Move getMove1() {
        return move1;
    }

    public int getDefence() {
        return defence;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }
}