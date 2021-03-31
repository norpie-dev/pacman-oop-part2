package pacman;

/**
 * Each instance of this class represents a fooditem, located at a fixed position in a Pac-Man maze.
 * 
 * @invar | getSquare() != null
 * 
 * @immutable
 *
 */
public class FoodItem {
	
	protected int size = 1;
	
	public int getSize() {
		return size;
	}

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
