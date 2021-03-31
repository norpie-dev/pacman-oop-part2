package pacman;

import java.util.Random;

public class GhostState {

	public boolean isVulnerable() {
		return false;
	}

	public void move(Ghost ghost, Random random) {
		ghost.reallyMove(random);
	}

}
