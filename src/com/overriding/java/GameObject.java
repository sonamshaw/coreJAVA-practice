package com.overriding.java;

public abstract class GameObject {
	public abstract void draw();

	public static void main(String[] args) {
		GamePlayer player = new GamePlayer();
		player.draw();
		GameMenu menu = new GameMenu();
		menu.draw();
	}
}
