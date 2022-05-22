package com.polban.tekpro.monopoly;

public class GoCell extends Cell {
	private boolean available = true;
	protected Player owner;

	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	public void playAction() {
	}
	
	void setName(String name) {
	}

	public Player getPlayer() {
		return owner;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void setPlayer(Player player) {
		this.owner = player;
	}
}
