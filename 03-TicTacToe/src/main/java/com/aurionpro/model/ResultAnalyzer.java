package com.aurionpro.model;

public class ResultAnalyzer {
	private Board board;
	private ResultType result;

	public ResultAnalyzer() {
		super();
		this.board = new Board();
		this.result = result;// ResultType.//PROGRESS;
	}

	public Board getBoard() {
		return board;
	}

	public ResultType getResult() {
		return result;
	}

	private void horizontalWinCheck() {
		Cell[] cells = board.getCell();
		if (cells[0].getMark() == MarkType.X && (cells[1].getMark() == MarkType.X)
				&& (cells[2].getMark() == MarkType.X)) {
			result = ResultType.WIN;
		}
		if (cells[0].getMark() == MarkType.O && (cells[1].getMark() == MarkType.O)
				&& (cells[2].getMark() == MarkType.O)) {
			result = ResultType.WIN;
		}

		if (cells[3].getMark() == MarkType.X && (cells[4].getMark() == MarkType.X)
				&& (cells[5].getMark() == MarkType.X)) {
			result = ResultType.WIN;
		}
		if (cells[3].getMark() == MarkType.O && (cells[4].getMark() == MarkType.O)
				&& (cells[5].getMark() == MarkType.O)) {
			result = ResultType.WIN;
		}
		if (cells[6].getMark() == MarkType.X && (cells[7].getMark() == MarkType.X)
				&& (cells[8].getMark() == MarkType.X)) {
			result = ResultType.WIN;
		}
		if (cells[6].getMark() == MarkType.O && (cells[7].getMark() == MarkType.O)
				&& (cells[8].getMark() == MarkType.O)) {
			result = ResultType.WIN;
		}

	}

	private void verticalwinCheck() {
		Cell[] cells = board.getCell();
		if (cells[0].getMark() == MarkType.X && (cells[3].getMark() == MarkType.X)
				&& (cells[6].getMark() == MarkType.X)) {
			result = ResultType.WIN;
		}
		if (cells[0].getMark() == MarkType.O && (cells[3].getMark() == MarkType.O)
				&& (cells[6].getMark() == MarkType.O)) {
			result = ResultType.WIN;
		}
		if (cells[1].getMark() == MarkType.X && (cells[4].getMark() == MarkType.X)
				&& (cells[7].getMark() == MarkType.X)) {
			result = ResultType.WIN;
		}
		if (cells[1].getMark() == MarkType.O && (cells[4].getMark() == MarkType.O)
				&& (cells[7].getMark() == MarkType.O)) {
			result = ResultType.WIN;
		}
		if (cells[2].getMark() == MarkType.X && (cells[5].getMark() == MarkType.X)
				&& (cells[8].getMark() == MarkType.X)) {
			result = ResultType.WIN;
		}
		if (cells[2].getMark() == MarkType.O && (cells[5].getMark() == MarkType.O)
				&& (cells[8].getMark() == MarkType.O)) {
			result = ResultType.WIN;
		}

	}

	private void diagonalWinCheck() {
		Cell[] cells = board.getCell();
		if (cells[0].getMark() == MarkType.X && (cells[4].getMark() == MarkType.X)
				&& (cells[8].getMark() == MarkType.X)) {
			result = ResultType.WIN;
		}
		if (cells[0].getMark() == MarkType.O && (cells[4].getMark() == MarkType.O)
				&& (cells[8].getMark() == MarkType.O)) {
			result = ResultType.WIN;
		}
		if (cells[2].getMark() == MarkType.X && (cells[4].getMark() == MarkType.X)
				&& (cells[6].getMark() == MarkType.X)) {
			result = ResultType.WIN;
		}
		if (cells[2].getMark() == MarkType.O && (cells[4].getMark() == MarkType.O)
				&& (cells[6].getMark() == MarkType.O)) {
			result = ResultType.WIN;
		}

	}

	public ResultType analyseResult() {
		diagonalWinCheck();
		verticalwinCheck();
		horizontalWinCheck();
		if (result != result.WIN) {
			if (!board.isBoardFull()) {
				result = ResultType.PROGRESS;
			} else {
				result = ResultType.DRAW;
			}

		}
		return result;

	}

}