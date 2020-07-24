package com.Game;

import java.awt.Graphics;

public abstract class GameObject{

	protected int x , y;
	protected id ID;
	protected int velX , velY;
	
	public GameObject(int X, int Y, id ID) {
		this.x = X;
		this.y = Y;
		this.ID = ID;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public void setX(int x) {
		this.x = x;		
	}
	public void setY(int Y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int gety() {
		return y;
	}
	public void setID(id ID){
		this.ID = ID;
	}
	public id getID() {
		return ID;
	}
	public void setvelX(int velX) {
		this.velX = velX;
	}
	public void setvelY(int velY) {
		this.velY = velY;
	}
	public int getvelx() {
		return velX;
	}
	public int getvely() {
		return velY;
	}
}
