package cs520.hw4;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Legos1 extends JFrame{
	//part1.a
	private int startX, startY, legoWidth, legoHeight;
	//part1.b
	private int baseLength;
	//part1.c
	Legos1 ()
	{
		this.startX = 20;
		this.startY = 300;
		this.legoWidth = 50;
		this.legoHeight = 20;
		this.baseLength = 10;
	}
	public void paint(Graphics g) {
		    super.paint(g);
		    
		int verticalBlocksNumber = this.baseLength;
		//int horizontalShiftX = this.startX;
		
	    for  (int i = 1; i <= verticalBlocksNumber; i++)
	    {	
	    	int  horizontalShiftX = this.startX;
	    	for (int j = 1; j <= this.baseLength; j++)
		    {
		    	g.setColor(( j % 2 == 0) ? Color.BLUE : Color.RED);
		      	g.fillRoundRect(horizontalShiftX, this.startY, this.legoWidth, this.legoHeight, 5, 5);
		      	horizontalShiftX = horizontalShiftX + this.legoWidth;
		    }
		    this.startY = this.startY - this.legoHeight;
		    this.startX = this.startX + legoWidth/2;
		    this.baseLength = this.baseLength - 1;
	    }  
	 }	
	
	 public static void main(String[] args) {
		
	    Legos1 lego = new Legos1();
	    lego.setTitle("Morgun");
	    lego.setSize(550, 325);
	    lego.setVisible(true);

	}

}
