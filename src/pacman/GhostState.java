package pacman;

import java.util.Random;

public abstract class GhostState {

	public abstract boolean isVulnerable();

	public void move(Ghost ghost, Random random) {
		ghost.reallyMove(random);
	}

	public abstract GhostState hitBy(Ghost ghost, PacMan pacMan);

}
