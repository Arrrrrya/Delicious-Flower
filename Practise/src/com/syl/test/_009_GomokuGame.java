package com.syl.test;

import java.util.Scanner;

/**
 * to编写控制台五子棋小游戏
 * 
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _009_GomokuGame {
	public String chess1 = "o";
	public String chess2 = "x";
	public String player1 = "player1";
	public String player2 = "player2";

	public void startGomokuGame(int n) {
		System.out.println("【五子棋大战】");
		System.out.println("规则：输入两个1-" + n + "以内的整数，以space隔开，按enter结束回合");
		String[][] chessBoard = new String[n][n];
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < n; j++) {
				chessBoard[i][j] = ".";
			}
		}

		Scanner scan = new Scanner(System.in);
		boolean endFlag = false;
		boolean winFlag = false;
		String winner = "";
		String chess = "";
		String currentPlayer = player1;
		String stepInfo = "";
		int i = 0;
		int j = 0;
		int failStep = 0;

		while (!endFlag && !winFlag) {
			System.out.println(currentPlayer + " 的回合!");
			printChessBoard(chessBoard);
			stepInfo = scan.nextLine();
			try {
				i = Integer.parseInt(stepInfo.split(" ")[0]);
				j = Integer.parseInt(stepInfo.split(" ")[1]);
			} catch (Exception e) {
				System.out.println(currentPlayer + " 已经弃权！");
				endFlag = true;
				winner = switchPlayer(currentPlayer);
				break;
			}
			if (!stepIsOK(chessBoard, n, i, j)) {
				System.out.println(currentPlayer + " 第" + (failStep + 1) + "次落子无效");
				failStep++;
				if (failStep == 2) {
					System.out.println(currentPlayer + " 2次落子无效，直接判负！");
					endFlag = true;
					winner = switchPlayer(currentPlayer);
					break;
				}
				continue;
			} else {
				if (currentPlayer.equals(player1)) {
					chess = chess1;
				} else {
					chess = chess2;
				}
				chessBoard[i - 1][j - 1] = chess;
				if (checkWin(chessBoard, n, chess)) {
					winner = currentPlayer;
					winFlag = true;
					System.out.println("最终棋局为：");
					printChessBoard(chessBoard);
					break;
				}
				currentPlayer = switchPlayer(currentPlayer);
			}
		}
		if (endFlag) {
			System.out.println(winner + " 获胜");
		} else if (winFlag) {
			System.out.println(winner + " 战胜了 " + (winner.equals(player1) ? switchPlayer(winner) : player1) + "!");
		}
		scan.close();
	}

	//请问怎么优化，感觉有点蠢
	public boolean checkWin(String[][] chessBoard, int n, String chess) {
		for (int i = 0; i < chessBoard.length - 4; i++) {
			for (int j = 0; j < chessBoard.length - 4; j++) {
				if ((chessBoard[i][j].equals(chess) 
				  && chessBoard[i][j + 1].equals(chess)
				  && chessBoard[i][j + 2].equals(chess) 
				  && chessBoard[i][j + 3].equals(chess)
				  && chessBoard[i][j + 4].equals(chess))){
					return true;
				}
				if ((chessBoard[i][j].equals(chess) 
				  && chessBoard[i + 1][j].equals(chess)
				  && chessBoard[i + 2][j].equals(chess) 
				  && chessBoard[i + 3][j].equals(chess)
				  && chessBoard[i + 4][j].equals(chess))) {
					return true;
				}
				if ((chessBoard[i][i].equals(chess) 
				  && chessBoard[i + 1][j + 1].equals(chess)
				  && chessBoard[i + 2][j + 2].equals(chess) 
				  && chessBoard[i + 3][j + 3].equals(chess)
				  && chessBoard[i + 4][j + 4].equals(chess))) {
					return true;
				}
				if ((chessBoard[i][i + 4].equals(chess) 
				  && chessBoard[i + 1][j + 3].equals(chess)
				  && chessBoard[i + 2][j + 2].equals(chess) 
				  && chessBoard[i + 3][j + 1].equals(chess)
				  && chessBoard[i + 4][j].equals(chess))) {
					return true;
				}
			}
		}
		return false;
	}

	public String switchPlayer(String player) {
		if (player.equals(player1)) {
			player = player2;
		} else {
			player = player1;
		}
		return player;
	}

	public boolean stepIsOK(String[][] chessBoard, int n, int i, int j) {
		if (i < 1 || i > n || j < 1 || j > n || chessBoard[i - 1][j - 1].equals(chess1)
				|| chessBoard[i - 1][j - 1].equals(chess2)) {
			return false;
		}
		return true;
	}

	public void printChessBoard(String[][] chessBoard) {
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard.length; j++) {
				System.out.print(chessBoard[i][j]);
				if (j == chessBoard.length - 1) {
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args) {
		new _009_GomokuGame().startGomokuGame(19);
	}
}
