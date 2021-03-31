package pacman;

public class PowerPellet extends FoodItem {

	public PowerPellet(Square square) {
		super(square);
		size = size * 2;
	}

}
