package org.classic.snakegame;

import java.util.Scanner;

public class ClassicSnakeGameEngine {

	public static void main(String[] args) {

		final int BOARD_WIDTH = 20; 
		final int BOARD_HEIGHT = 10; 
		final int START_X = BOARD_WIDTH / 2;
		final int START_Y = BOARD_HEIGHT / 2;


		ClassicBoard board = new ClassicBoard(BOARD_WIDTH, BOARD_HEIGHT);
		board.initBoard();

		ClassicBoardCellWall wall = new ClassicBoardCellWall('^');
		wall.addRoomWallRow(board, wall, 0); 
		wall.addRoomWallRow(board, wall, board.getBoardHeight() - 1); 
		wall.addRoomWallColumn(board, wall, 0); 
		wall.addRoomWallColumn(board, wall, board.getBoardWidth() - 1); 

		ClassicSnakeCharacter snake = new ClassicSnakeCharacter('~', START_X, START_Y);
		board.setObjectOnLocation(snake, snake.getX(), snake.getY());

		ClassicAppleItem apple = new ClassicAppleItem('&');
		apple.addRandomFood(board, apple);
		

		Scanner scanner = new Scanner(System.in);
		char input;


		boolean isRunning = true;

		while (isRunning) {
			board.printBoard();
			switch (input = scanner.nextLine().charAt(0)) {
			case 'l':
				snake.moveLeft(board, snake);
				break;
			case 'r':
				snake.moveRight(board, snake);
				break;
			case 'u':
				snake.moveUp(board, snake);
				break;
			case 'd':
				snake.moveDown(board, snake);
				break;
			}
		}
	}

}
