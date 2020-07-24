package com.Game;

import java.awt.Color;
import java.awt.Graphics;

public class player extends GameObject {

	public player(int X, int Y, id ID) {
		super(X, Y, ID);
	}

	public void tick() {
		
	}

	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y,32,32);
	}

}
