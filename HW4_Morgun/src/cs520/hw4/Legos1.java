package cs520.hw4;

import javax.swing.JFrame;

public class Legos1 extends JFrame{
/*
Create a Swing GUI application that displays the following graphics of red and blue
lego blocks. The tower is always built from bottom row to top row, left to right in each
row.
Write a class named Legos1 extending the JFrame class with the following
specifications.

c. In the constructor, specify the appropriate window title using your
lastName and assign the above instance variables with the values 20,
300, 50, 20, and 10, respectively.
d. In the paint method, using nested loops, fill the pattern from the bottom
row all the way to the top. Notice that the number of blocks decreases
by one for each row. Use the baseLength variable to control the loops.
e. In the main method, create the application object, set its size to 550 by
325 and its visibility to true to test the above graphics.
Note: For each block, use the fillRoundRect method of the Graphics object.
Use a value of 2 for arcWidth and arcHeight.
http://docs.oracle.com/javase/6/docs/api/java/awt/Graphics.html
*/
	
	
		
	/* a. Declare the integer type instance variables startX, startY, legoWidth,
	and legoHeight. The first two values represent the top-left coordinates
	of the first red block in the bottom row. The next two values are the
	width and height of each block.
	b. Declare another integer instance variable, baseLength. This represents
the number of blocks in the bottom row.
	*/
	//part1.a
	private int startX, startY, legoWidth, legoHeight;
	//part1.b
	private int baseLength;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
