package pacman;

import java.util.Random;

public class VulnerableGhostState extends GhostState {

	private int moveDelay;

	public VulnerableGhostState() {
		moveDelay = 1;
	}

	@Override
	public boolean isVulnerable() {
		return true;
	}

	@Override
	public void move(Ghost ghost, Random random) {
		if (moveDelay != 0) {
			moveDelay--;
			return;
		}
		ghost.reallyMove(random);
		moveDelay++;
	}
}
