package com.Game;

import java.util.LinkedList;
import java.awt.Graphics;

public class Handler {

	LinkedList<GameObject> Object = new LinkedList<GameObject>();
	
	public void tick() {
		for(int i = 0; i < Object.size(); i++) {
			GameObject tempObject = Object.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g) {
		for(int i = 0; i < Object.size(); i++) {
			GameObject tempObject = Object.get(i);
			
			tempObject.render(g);
		}
	}
	public void addObject(GameObject Object) {
		this.Object.add(Object);
	}
	public void removeObject(GameObject Object) {
		this.Object.remove(Object);
	}
}
