package clueGame;

public abstract class BoardCell {
	
	private int row, column;
	
	public boolean isWalkway(){
		return false;
	}
	
	public boolean isRoom(){
		return false;
		
	}
	
	public boolean isDoorway(){
		return false;
	}

}
