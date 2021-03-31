package pacman;

/**
 * Each instance of this class represents a dot, located at a fixed position in a Pac-Man maze.
 * A dot serves as the food for Pac-Man.
 */
public class Dot extends FoodItem {
	
	public Dot(Square square) {
		super(square);
	}

}
