package com.polban.tekpro.monopoly;

public class GoToJailCell extends Cell {
	
	private boolean available = true;
	protected Player owner;

	public GoToJailCell() {
		setName("Go to Jail");
	}

	public void playAction() {
		Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		JailCell jail = (JailCell)(GameMaster.instance().getGameBoard().queryCell("Jail"));
		GameMaster.instance().sendToJail(currentPlayer);
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
