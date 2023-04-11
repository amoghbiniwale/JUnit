package com.aurionpro.model;

public class Cell {
	private MarkType mark;

	public Cell() {

		this.mark = MarkType.Empty;
	}

	public MarkType getMark() {
		return mark;
	}

	public void setMark(MarkType mark) {
		if (!isEmpty()) {
			throw new CellAlreadyMarkedException("cell is alredy marks");
		}
		this.mark = mark;
	}

	public boolean isEmpty() {
		if (mark == MarkType.Empty) {
			return true;
		}
		return false;

	}

}
