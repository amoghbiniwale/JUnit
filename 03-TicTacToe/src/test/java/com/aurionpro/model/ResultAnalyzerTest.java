package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ResultAnalyzerTest {
  Board board;
  ResultAnalyzer result1;
  Cell[] cells;

  @BeforeEach
  void init() {

    result1 = new ResultAnalyzer();
    board = result1.getBoard();
    cells = board.getCell();
  }

//  @Test
//  void test() {
//    fail("Not yet implemented");
//  }

  @Test
  void testHorizontalWinCheck_horizontalWinLine1() throws CellAlreadyMarkedException {

    cells[0].setMark(MarkType.X);
    cells[1].setMark(MarkType.X);
    cells[2].setMark(MarkType.X);
    assertEquals(ResultType.WIN, result1.analyseResult());

  }
  
  @Test
  void testHorizontalWinCheck_horizontalWinLine2() throws CellAlreadyMarkedException {

    cells[3].setMark(MarkType.X);
    cells[4].setMark(MarkType.X);
    cells[5].setMark(MarkType.X);
    assertEquals(ResultType.WIN, result1.analyseResult());

  }
  
  @Test
  void testHorizontalWinCheck_horizontalWinLine3() throws CellAlreadyMarkedException {

    cells[6].setMark(MarkType.X);
    cells[7].setMark(MarkType.X);
    cells[8].setMark(MarkType.X);
    assertEquals(ResultType.WIN, result1.analyseResult());

  }
  
  @Test
  void testVerticalWinCheck_verticalWin2() throws CellAlreadyMarkedException {
    cells[1].setMark(MarkType.X);
    cells[4].setMark(MarkType.X);
    cells[7].setMark(MarkType.X);
    assertEquals(ResultType.WIN, result1.analyseResult());
  }
  
  @Test
  void testVerticalWinCheck_verticalWin3() throws CellAlreadyMarkedException {
    cells[2].setMark(MarkType.X);
    cells[5].setMark(MarkType.X);
    cells[8].setMark(MarkType.X);
    assertEquals(ResultType.WIN, result1.analyseResult());
  }
  
  @Test
  void testVerticalWinCheck_verticalWin1() throws CellAlreadyMarkedException {
    cells[0].setMark(MarkType.X);
    cells[3].setMark(MarkType.X);
    cells[6].setMark(MarkType.X);
    assertEquals(ResultType.WIN, result1.analyseResult());
  }
  
  @Test
  void testDiagonalWinCheck_diagonalWin() throws CellAlreadyMarkedException {
    cells[0].setMark(MarkType.X);
    cells[4].setMark(MarkType.X);
    cells[8].setMark(MarkType.X);
    assertEquals(ResultType.WIN, result1.analyseResult());
  }

}