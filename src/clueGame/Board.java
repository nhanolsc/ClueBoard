package clueGame;

import java.io.FileNotFoundException;
import java.io.FileReader;
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
		int boardindex= rowNum * numRows + columnNum;
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

	public void loadBoardConfig() throws BadConfigFormatException{
		// TODO Auto-generated method stub
		try{
		FileReader reader = new FileReader("BoardLayout.csv");
	}
		catch(FileNotFoundException e){
			System.out.println(e.getLocalizedMessage());
		}
	}
	
}
