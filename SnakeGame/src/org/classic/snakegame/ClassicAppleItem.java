package org.classic.snakegame;

public class ClassicAppleItem extends ClassicBoardLayout {

	public ClassicAppleItem(char symbol) {
		setIcon(symbol);
	}

	public void addRandomFood(ClassicBoard screen, ClassicAppleItem apple) {
		
		int x = (int) (((Math.random()) * (screen.getBoardWidth() - 1)));
		int y = (int) (((Math.random()) * (screen.getBoardHeight() - 1)));

		if(x==0)
		{
			x = 2;
		}
		
		if(y==0)
		{
			y= 2;
		}
		screen.setObjectOnLocation(apple,x,y);
				
	}
}
