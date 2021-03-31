package pacman;

public class PowerPellet extends FoodItem {

	public PowerPellet(Square square) {
		super(square);
		size = size * 2;
	}

	@Override
	public void effect(Ghost[] ghosts) {
		for (Ghost ghost : ghosts)
			ghost.pacManAtePowerPellet();
	}

}
