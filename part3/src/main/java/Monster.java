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
    private Move[] moves;

    /**
     * This constructs a monster with specified attributes
     * @param name name of a monster
     * @param type type of a monster
     * @param hp the hit points of a monster
     * @param speed the speed stat of a monster
     * @param attack attack stat of a monster
     * @param defence defence stat of a monster
     * @param moves array with all moves of a monster
     */
    public Monster(String name, String type, int hp, int speed, int attack, int defence, Move move1, Move move2, Move move3, Move move4) {
        this.name = name;
        this.type = type;
        this.setHp(hp);
        this.speed = speed;
        this.attack = attack;
        this.defence = defence;
        
        this.moves = new Move[4];
        this.moves[0] = move1;
        this.moves[1] = move2;
        this.moves[2] = move3;
        this.moves[3] = move4;
    }

    /**
     * 
     * @param movesNum number of a move to get
     * @return requested move
     */
    public Move movesGettersMap(int movesNum) {
        return this.moves[movesNum - 1];
    }

    public Move[] getMoves() {
        return moves;
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