package pacman;

/**
 * Each instance of this class represents a fooditem, located at a fixed position in a Pac-Man maze.
 * 
 * @invar | getSquare() != null
 * 
 * @immutable
 *
 */
public abstract class FoodItem {
	
	protected final int DEFAULT_SIZE = 1; 
	
	/**
	 * Returns the size of the food item
	 * 
	 * @post | result == 1 || result == 2
	 * @basic
	 */
	public abstract int getSize();	

	public abstract void effect(Ghost[] ghosts);

	/**
	 * @invar | square != null
	 */
	private Square square;
	
	/**
	 * @basic
	 */
	public Square getSquare() { return square; }

	/**
	 * @throws IllegalArgumentException | square == null
	 * 
	 * @post | getSquare() == square
	 */
	public FoodItem(Square square) {
		if (square == null)
			throw new IllegalArgumentException("`square` is null");
		
		this.square = square;
	}
}
