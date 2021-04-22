package pacman;

public class PowerPellet extends FoodItem {

	public PowerPellet(Square square) {
		super(square);
	}

	@Override
	public void effect(Ghost[] ghosts) {
		for (Ghost ghost : ghosts)
			ghost.pacManAtePowerPellet();
	}

	/**
	 * @post | result == 2
	 * @basic
	 */
	@Override
	public int getSize() {
		return DEFAULT_SIZE * 2;
	}

}
