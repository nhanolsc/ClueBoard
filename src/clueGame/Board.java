package clueGame;

import java.util.ArrayList;
import java.util.Map;

public class Board {
	
	private ArrayList<BoardCell> cells;
	private Map<Character,String> rooms;
	private int maxColumns, maxRows;
	private int numRows;
	private int numColumns;
	public Board(String sheetName, String fileName){
		
	}
	
	public void loadConfigFiles(){
		loadBoardConfig();
		loadRoomConfig();
	}
	
	public int calcIndex(int rowNum, int columnNum){
			int index = rowNum* maxColumns + columnNum;	
		return index;
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

	public RoomCell getRoomCellAt(int row, int column) {
		RoomCell room = new RoomCell(row,column);
		if(room.isRoom() == true){
			return room;
		}
		else
			return null;
	}

	public int getMaxColumns() {
		return maxColumns;
	}

	public int getMaxRows() {
		return maxRows;
	}

	public BoardCell getCellAt(int i) {
		return cells.get(i);
	}

	public void loadRoomConfig() {
		
	}

	public void loadBoardConfig() {
		// TODO Auto-generated method stub
		
	}
	
	
}
