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
	    
	    int verticalShiftY = this.startY;
	    int horizontalLength = this.baseLength;
	  	
	    for  (int i = 1; i <= this.baseLength; i++)
	    {	
	    	int horizontalShiftX =  this.startX + legoWidth/2 * (i-1);
	    	Color previousColor = null;
	    	for (int j = 1; j <= horizontalLength; j++)
		    {
	    		//Use the length of the colors array as an argument (do not hard code the array length)
	    		Color currentColor = this.colorsArray[rand.nextInt(colorsArray.length)];
	    		//Compare current color with previous and keep generating another color while they match
	    		while ( currentColor.equals(previousColor) )
	    				{currentColor = this.colorsArray[rand.nextInt(colorsArray.length)];}
	    		previousColor = currentColor;
	    		g.setColor(currentColor);
	    		g.fillRoundRect(horizontalShiftX, verticalShiftY, this.legoWidth, this.legoHeight, 5, 5);
		      	horizontalShiftX = horizontalShiftX + this.legoWidth;
	    }
    	verticalShiftY = verticalShiftY - this.legoHeight;
	    horizontalLength = horizontalLength - 1;
    }  
 }	

	public static void main(String[] args) {
		
	    Legos3 lego = new Legos3();
	    lego.setSize(550, 325);
	    lego.setVisible(true);
	    lego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
