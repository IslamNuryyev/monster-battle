/**
 * This class represents a single move of a monster
 * @authors Islam Nuryyev, Moharaj Oritro
 */
public class Move {
    private String name;
    private String type;
    private int power;
    private float accuracy;

    /**
     * This constructs a move with specified name, type, power and accuracy
     * @param name name of a move
     * @param type type of a move
     * @param power attack power of the move
     * @param accuracy 0.0-1.0, representing the hit percentage for the move
     */
    public Move(String name, String type, int power, float accuracy) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
    }

    public float getAccuracy() {
        return accuracy;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}