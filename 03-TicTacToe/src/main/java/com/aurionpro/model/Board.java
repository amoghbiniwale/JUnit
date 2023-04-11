package com.aurionpro.model;

public class Board {
	private Cell[] cell = new Cell[9];

	public Board() {
		for(int i=0;i<cell.length;i++) {
			cell[i]= new Cell();
		}
	}


	public Cell[] getCell() {
		return cell;
	}

	public boolean isBoardFull() {
		
		for(Cell x:cell) {
			if(x.getMark() == MarkType.Empty) {
				return false;
			}
		}
		return true;
	}
	public void setCellMark(int location,MarkType mark) {
		if(location<0 || location>8) {
			throw  new InvalidLocationException("invalid location");
		}
		cell[location].setMark(mark);
	}
}
