package com.polban.tekpro.monopoly;

public class CardCell extends Cell {
    private int type;
	private boolean available = true;
	protected Player owner;
    
    public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    public void playAction() {
    }
    
    public int getType() {
        return type;
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
