package pacman;

import java.util.Random;

public abstract class GhostState {

	public boolean isVulnerable() {
		return false;
	}

	public void move(Ghost ghost, Random random) {
		ghost.reallyMove(random);
	}

	public abstract GhostState hitBy(Ghost ghost, PacMan pacMan);

}
