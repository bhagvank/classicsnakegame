package org.classic.snakegame;

public class ClassicBoardCellWall extends ClassicBoardLayout {

	public ClassicBoardCellWall() {
		setIcon('^');
	}

	public ClassicBoardCellWall(char icon) {
		setIcon(icon);
	}


	public void addRoomWallRow(ClassicBoard board, ClassicBoardCellWall wall, int rowNumber) {
		for (int i = 0; i < board.getBoardWidth(); i++) {
			board.setObjectOnLocation(wall, i, rowNumber);
		}
	}

	public void addRoomWallColumn(ClassicBoard board, ClassicBoardCellWall wall, int columnNumber) {
		for (int i = 0; i < board.getBoardHeight(); i++) {
			board.setObjectOnLocation(wall, columnNumber, i);
		}
	}
}
