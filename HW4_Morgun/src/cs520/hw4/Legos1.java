package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Legos1 extends JFrame implements MouseListener{
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
		this.addMouseListener(this);
	}
	//part1.d
	public void paint(Graphics g) {
	    super.paint(g);
		int verticalBlocksNumber = this.baseLength;
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
		//part1.c
	    Legos1 lego = new Legos1();
	    lego.setSize(550, 325);
	    lego.setVisible(true);
	    lego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
	 
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.toString());
		
	}
	public void mousePressed(MouseEvent e) {
		System.out.println(e.toString());
		
	}
	public void mouseReleased(MouseEvent e) {
		System.out.println(e.toString());
		
	}
	public void mouseEntered(MouseEvent e) {
		System.out.println(e.toString());
		
	}
	public void mouseExited(MouseEvent e) {
		System.out.println(e.toString());
		repaint();
	}

}
