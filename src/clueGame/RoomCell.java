package clueGame;

public class RoomCell extends BoardCell {
	public enum DoorDirection{UP, DOWN, LEFT, RIGHT, NONE}
	DoorDirection doorDirection;
	char roomInitial;
	public boolean isRoom(){
		return true;
	}
	
/*	public void draw(){
		
	}*/

}
