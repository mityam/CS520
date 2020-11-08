package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class Legos3 extends JFrame{
	//part1.a
	private int startX, startY, legoWidth, legoHeight;
	//part1.b
	private int baseLength;
	
	private Color[] colorsArray = new Color[]{Color.red, Color.blue, Color.yellow, Color.green,
						Color.pink,Color.black, Color.magenta, Color.orange, Color.cyan};
	Random rand = new Random();
		
	//part1.c
	Legos3 ()
	{
		this.setTitle("Morgun's LEGOs");
		this.startX = 20;
		this.startY = 300;
		this.legoWidth = 50;
		this.legoHeight = 20;
		this.baseLength = 10;
	}
	public void paint(Graphics g) {
		    super.paint(g);
			int verticalBlocksNumber = this.baseLength;
			
	    for  (int i = 1; i <= verticalBlocksNumber; i++)
	    {	
	    	int  horizontalShiftX = this.startX;
	    	Color previousColor = null;
	    	for (int j = 1; j <= this.baseLength; j++)
		    {	
	    		//Use the length of the colors array as an argument (do not hard code the array length)
	    		Color currentColor = this.colorsArray[rand.nextInt(colorsArray.length)];
	    		//Compare current color with previous and keep generating another color while they match
	    		while ( currentColor.equals(previousColor) )
	    				{currentColor = this.colorsArray[rand.nextInt(colorsArray.length)];}
	    		previousColor = currentColor;
	    		g.setColor(currentColor);
		    	g.fillRoundRect(horizontalShiftX, this.startY, this.legoWidth, this.legoHeight, 5, 5);
		      	horizontalShiftX = horizontalShiftX + this.legoWidth;
		    }
		    this.startY = this.startY - this.legoHeight;
		    this.startX = this.startX + legoWidth/2;
		    this.baseLength = this.baseLength - 1;
	    }  
	 }	
	
	 public static void main(String[] args) {
		
	    Legos3 lego = new Legos3();
	    lego.setSize(550, 325);
	    lego.setVisible(true);
	    lego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
