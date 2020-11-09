package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class Legos2 extends JFrame{
	//part1.a
	private int startX, startY, legoWidth, legoHeight;
	//part1.b
	private int baseLength;
	
	private Color[] colorsArray = new Color[]{Color.red, Color.blue, Color.yellow, Color.green,
						Color.pink,Color.black, Color.magenta, Color.orange, Color.cyan};
	Random rand = new Random();
	
	//part1.c
	Legos2 ()
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
		    	
		    	for (int j = 1; j <= horizontalLength; j++)
			    {
		    	//Use the length of the colors array as an argument (do not hard code the array length)
	    		g.setColor(this.colorsArray[rand.nextInt(colorsArray.length)]);
	    		g.fillRoundRect(horizontalShiftX, verticalShiftY, this.legoWidth, this.legoHeight, 5, 5);
		      	horizontalShiftX = horizontalShiftX + this.legoWidth;
		    }
	    	verticalShiftY = verticalShiftY - this.legoHeight;
		    horizontalLength = horizontalLength - 1;
	    }  
	 }	
	
	 public static void main(String[] args) {
		
	    Legos2 lego = new Legos2();
	    lego.setSize(550, 325);
	    lego.setVisible(true);
	    lego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
