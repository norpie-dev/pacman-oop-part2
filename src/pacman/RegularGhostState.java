package pacman;

public class RegularGhostState extends GhostState {

	@Override
	public GhostState hitBy(Ghost ghost, PacMan pacMan) {
		pacMan.die();
		return this;
	}

	@Override
	public boolean isVulnerable() {
		return false;
	}
}
