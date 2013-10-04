package clueGame;

import java.util.ArrayList;
import java.util.Map;

public class Board {
	
	private ArrayList<BoardCell> cells;
	private Map<Character,String> rooms;
	private int numRows;
	private int numColumns;
	public Board(String sheetName, String fileName){
		
	}
	
	public void loadConfigFiles(){

	}
	
	public BoardCell calcIndex(int rowNum, int columnNum){
		return new BoardCell();
	}

	public ArrayList<BoardCell> getCells() {
		return cells;
	}

	public Map<Character, String> getRooms() {
		return rooms;
	}

	public int getNumRows() {
		return numRows;
	}

	public int getNumColumns() {
		return numColumns;
	}

	public RoomCell getRoomCellAt(int i, int j) {

		return null;
	}

	public BoardCell getCellAt(int i) {
	
		return null;
	}

	public void loadRoomConfig() {
		
	}

	public void loadBoardConfig() {
		// TODO Auto-generated method stub
		
	}
	
	
}
