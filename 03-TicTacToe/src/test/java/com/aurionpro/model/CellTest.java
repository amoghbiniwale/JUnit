package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CellTest {
	Cell cell;

	@BeforeEach
	void init() {
		cell = new Cell();
	}
	@Test
	void testGetMark_checkIsEmpty() {
		assertEquals(MarkType.Empty, cell.getMark());
	}
	@Test
	void TestSetMark_setXOToACell1() {
		cell.setMark(MarkType.X);
		assertEquals(MarkType.X,cell.getMark());
	}
	@Test
	void testSetMark_CellAlreadyMarkedException() {
		cell.setMark(MarkType.X);
		assertThrows(CellAlreadyMarkedException.class,()->cell.setMark(MarkType.X));
	}
	
}
