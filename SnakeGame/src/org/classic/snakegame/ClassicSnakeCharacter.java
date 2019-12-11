package org.classic.snakegame;

public class ClassicSnakeCharacter extends ClassicBoardLayout {

	public ClassicSnakeCharacter(char symbol, int xStartingLocation, int yStartingLocation) {
		setIcon(symbol);
		setX(xStartingLocation);
		setY(yStartingLocation);
	}
	
	public void moveLeft(ClassicBoard screen, ClassicSnakeCharacter snake) {
		snake.setX(getX() - 1);
		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
		screen.ClearScreenLocation(snake.getX() + 1, snake.getY());
	}
	
	public void moveRight(ClassicBoard screen, ClassicSnakeCharacter snake) {
		snake.setX(getX() + 1);
		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
		screen.ClearScreenLocation(snake.getX() - 1, snake.getY());
	}
	
	public void moveUp(ClassicBoard screen, ClassicSnakeCharacter snake) {
		snake.setY(getY() - 1);
		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
		screen.ClearScreenLocation(snake.getX(), snake.getY() + 1);
	}
	
	public void moveDown(ClassicBoard screen, ClassicSnakeCharacter snake) {
		snake.setY(getY() + 1);
		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
		screen.ClearScreenLocation(snake.getX(), snake.getY() - 1);
	}
}