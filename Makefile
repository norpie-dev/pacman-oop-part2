all: zip

zip:
	cd src/pacman; zip project.zip Direction.java Dot.java FoodItem.java Ghost.java GhostState.java MazeDescriptions.java Maze.java MazeMap.java PacMan.java PowerPellet.java RegularGhostState.java Square.java VulnerableGhostState.java; mv project.zip ../../
