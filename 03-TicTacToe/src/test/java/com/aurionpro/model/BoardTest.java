package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
	Board board;
	Cell[] cells;

	@BeforeEach
	void init() {
		board = new Board();
		cells=board.getCell();
	}
	@Test
	void testIsBoardFull_checkIsEmpty() {
		boolean flag = true;
		for (Cell x : cells) {
			if (x.getMark() != MarkType.Empty) {
				flag = false;
				break;
			}
		}
		assertTrue(flag);
	}

	@Test
	void testSetCellMark_markAtParticularLocation() {
		board.setCellMark(1, MarkType.X);
		assertEquals(MarkType.X, cells[1].getMark());

	}

	@Test
	void testSetCellMark_InvalidExceptionCheck() {

		assertThrows(InvalidLocationException.class, () -> board.setCellMark(9, MarkType.X));
	}

	@Test
	void testIsBoardFull() {
		for (int i = 0; i < 8; i++) {
			board.setCellMark(i, MarkType.X);
		}
		assertEquals(true, board.isBoardFull());

	}

	@Test
	void testSetCellMark_CellAlreadyMarkedException() {
		board.setCellMark(1, MarkType.X);
		assertThrows(CellAlreadyMarkedException.class, () -> board.setCellMark(1, MarkType.X));
	}

}


