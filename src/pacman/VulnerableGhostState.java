package pacman;

import java.util.Random;

public class VulnerableGhostState extends GhostState {

	private int moveDelay;
	private int resetCounter;

	public VulnerableGhostState() {
		moveDelay = 1;
		resetCounter = 0;
	}

	@Override
	public boolean isVulnerable() {
		return true;
	}

	@Override
	public void move(Ghost ghost, Random random) {
		resetCounter++;
		if(resetCounter == 12) {
			ghost.setState(new RegularGhostState());
		}
		if (moveDelay != 0) {
			moveDelay--;
			return;
		}
		ghost.reallyMove(random);
		moveDelay++;
	}
	
	public GhostState hitBy(Ghost ghost, PacMan pacMan) {
		ghost.reset();
		return new RegularGhostState();
	}
}
