/**
 * This class is an example game driver class to simulate a game
 */
public class GameDriver {
	public static void main(String[] args) {
		Move move1 = new Move("Vine Whip", "Grass", 45, 1.0f);
		Move move2 = new Move("Tackle", "Normal", 50, 1.0f);
		Move move3 = new Move("Take Down", "Normal", 90, 0.85f);
		Move move4 = new Move("Razor Leaf", "Grass", 55, 0.95f);
		Monster monster = new Monster("Bulbasaur", "Grass", 240, 45, 49, 49,
                                      move1, move2, move3, move4);
		Player player = new HumanPlayer(monster);

		move1 = new Move("Scratch", "Normal", 40, 1.0f);
		move2 = new Move("Ember", "Fire", 45, 0.8f);
		move3 = new Move("Peck", "Flying", 50, 0.7f);
		move4 = new Move("Fire Spin", "Fire", 60, 0.6f);
		monster = new Monster("Torchic", "Fire", 240, 45, 60, 40,
                              move1, move2, move3, move4);
		Player enemy = new CPUPlayer(monster);

		while ((!player.hasLost()) && (!enemy.hasLost())) {
			// print both monsters' HP
			System.out.println("");
			System.out.printf("%s has %d HP\n",
                                    player.getMonster().getName(),
                                    player.getMonster().getHp());
			System.out.printf("%s has %d HP\n",                
                                    enemy.getMonster().getName(),
                                    enemy.getMonster().getHp());

			// decide the next move
			int playerMove = player.chooseMove();
			int enemyMove = enemy.chooseMove(player);


			// execute the next move
			if (player.isFasterThan(enemy)) {
				player.attack(enemy, playerMove);
				if (!enemy.hasLost()) {
					enemy.attack(player, enemyMove);
				}
			} else {
				enemy.attack(player, enemyMove);
				if (!player.hasLost()) {
					player.attack(enemy, playerMove);
				}
			}
		}

		if (player.hasLost()) {
			System.out.printf("\nYou and %s have lost the battle.\n",
                                    player.getMonster().getName());
		} else {
			System.out.printf("\nYou and %s are victorious!\n",
                                    player.getMonster().getName());
		}
	}
}
