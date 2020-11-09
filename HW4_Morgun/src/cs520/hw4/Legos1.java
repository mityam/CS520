package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;


import javax.swing.JFrame;

public class Legos1 extends JFrame{
	//part1.a
	private int startX, startY, legoWidth, legoHeight;
	//part1.b
	private int baseLength;
	//part1.c
	Legos1 ()
	{
		this.setTitle("Morgun's LEGOs");
		this.startX = 20;
		this.startY = 300;
		this.legoWidth = 50;
		this.legoHeight = 20;
		this.baseLength = 10;
	}
	//part1.d
	public void paint(Graphics g) {
	    super.paint(g);
	    
	    int verticalShiftY = this.startY;
	    int horizontalLength = this.baseLength;
	  	
	    for  (int i = 1; i <= this.baseLength; i++)
	    {	
	    	int horizontalShiftX =  this.startX + legoWidth/2 * (i-1);
	    	
	    	for (int j = 1; j <= horizontalLength; j++)
		    {
		    	g.setColor(( j % 2 == 0) ? Color.BLUE : Color.RED);
		      	g.fillRoundRect(horizontalShiftX, verticalShiftY, this.legoWidth, this.legoHeight, 5, 5);
		      	horizontalShiftX = horizontalShiftX + this.legoWidth;
		    }
	    	verticalShiftY = verticalShiftY - this.legoHeight;
		    horizontalLength = horizontalLength - 1;
	    }  
	 }
	
	 public static void main(String[] args) {
		//part1.c
	    Legos1 lego = new Legos1();
	    lego.setSize(550, 325);
	    lego.setVisible(true);
	    lego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
}
