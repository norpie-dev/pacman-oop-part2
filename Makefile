all: zip

zip:
	cp src/pacman pacman -r
	zip project.zip pacman/Direction.java pacman/Dot.java pacman/FoodItem.java pacman/Ghost.java pacman/GhostState.java pacman/MazeDescriptions.java pacman/Maze.java pacman/MazeMap.java pacman/PacMan.java pacman/PowerPellet.java pacman/RegularGhostState.java pacman/Square.java pacman/VulnerableGhostState.java
	rm pacman -rf
