package week2;

import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.*;


public class RandomCircles extends GraphicsProgram {
	private static final int TOTAL_CIRCLES = 10;
	private static final double RADIUS_MIN = 5;
	private static final double RADIUS_MAX = 50;
	 RandomGenerator rgen = RandomGenerator.getInstance();

	int x = rgen.nextInt(0, getWidth());
	int y = rgen.nextInt(0, getHeight());
	
	
	public void run() {

		for (int i = 0; i < TOTAL_CIRCLES; i++) {
		double positionX = rgen.nextDouble(0, getWidth());
		double positionY = rgen.nextDouble(0, getHeight());
		int size = rgen.nextInt(5,50);
		GOval oval1 = new GOval (positionX, positionY, size, size);
		oval1.setFilled(true); 
		oval1.setColor(rgen.nextColor());
		add (oval1);

		}

	}

	
	
}


