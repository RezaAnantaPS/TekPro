package com.polban.tekpro.monopoly;

public abstract class OwnedCell extends Cell {

	private boolean available = true;
	protected Player owner;

	public OwnedCell() {
		super();
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