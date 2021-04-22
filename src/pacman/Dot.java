package pacman;

/**
 * Each instance of this class represents a dot, located at a fixed position in a Pac-Man maze.
 * A dot serves as the food for Pac-Man.
 */
public class Dot extends FoodItem {
	
	public Dot(Square square) {
		super(square);
	}

	@Override
	public void effect(Ghost[] ghosts) {
		/* Dots do not have an effect */
	}

	/**
	 * @post | result == 1
	 * @basic
	 */
	@Override
	public int getSize() {
		return DEFAULT_SIZE;
	}

}
