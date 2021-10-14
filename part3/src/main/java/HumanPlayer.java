import java.util.Scanner;

/**
 * This class represents HumanPlayer and inherits methods and attributes 
 * from Player class
 * @authors Islam Nuryyev, Moharaj Oritro
 */
public class HumanPlayer extends Player {

    /**
     * constructor for HumanPlayer
     * @param monster the player's battling monster
     */
    public HumanPlayer(Monster monster) {
        this.monster = monster;
    }

    /**
     * this method displays the available moves of a monster and asks 
     * a user to input a number of a move
     * @return integer, number of a move
     */
    public int chooseMove() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < this.monster.getMoves().length + 1; i++) {
            System.out.println(i + ". " + monster.movesGettersMap(i).getName());
        }

        System.out.printf("Which move? ");
        int move = scanner.nextInt(); 
        
        while(move <= 0 || move > 4) {      //error prevention
            System.out.printf("Invalid Move Choice... Please Try Again: ");
            move = scanner.nextInt();
        }
        
        return move;
    }
}