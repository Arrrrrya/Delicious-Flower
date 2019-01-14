package com.syl.test;

import java.util.Scanner;

/**
 * to��д����̨������С��Ϸ
 * 
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _009_GomokuGame {

	public void startGomokuGame(int n) {
		System.out.println("���������ս��");
		System.out.println("������������1-" + n + "���ڵ���������space��������enter�����غ�");
		String[][] chessBoard = new String[n][n];
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < n; j++) {
				chessBoard[i][j] = ".";
			}
		}

		Scanner scan = new Scanner(System.in);
		boolean endFlag = false;
		boolean winFlag = false;
		String player = "player1";
		int i = 0;
		int j = 0;
		String stepInfo = "";
		int failStep = 0;
		String winner = "";

		while (!endFlag && !winFlag) {
			System.out.println(player + "�Ļغ�!");
			printChessBoard(chessBoard);
			stepInfo = scan.nextLine();
			try {
				i = Integer.parseInt(stepInfo.split(" ")[0]);
				j = Integer.parseInt(stepInfo.split(" ")[1]);
			} catch (NumberFormatException e) {
				System.out.println(player + "�Ѿ���Ȩ��");
				endFlag = true;
				winner = switchPlayer(player);
				break;
			}
			if (!stepIsOK(chessBoard, n, i, j)) {
				System.out.println("��" + (failStep + 1) + "��������Ч");
				failStep++;
				if (failStep == 2) {
					System.out.println("2��������Ч��ֱ���и���");
					endFlag = true;
						winner = switchPlayer(player);
					break;
				}
				continue;
			} else {
				if (player.equals("player1")) {
					chessBoard[i - 1][j - 1] = "o";
				} else {
					chessBoard[i - 1][j - 1] = "x";
				}
				if (checkWin(chessBoard, n)) {
					winner = player;
					winFlag = true;
					System.out.println("�������Ϊ��");
					printChessBoard(chessBoard);
					break;
				}
				player = switchPlayer(player);
			}
		}
		System.out.println(winner + " ��ʤ!");
		scan.close();
	}

	//������ô�Ż����о��ô�
	public boolean checkWin(String[][] chessBoard, int n) {
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard.length; j++) {
				if ((i + 4) < n && (j + 4) < n) {
					if ((chessBoard[i][j].equals("o") 
					  && chessBoard[i][j + 1].equals("o")
					  && chessBoard[i][j + 2].equals("o") 
					  && chessBoard[i][j + 3].equals("o")
					  && chessBoard[i][j + 4].equals("o"))
							|| (chessBoard[i][j].equals("x") 
							 && chessBoard[i][j + 1].equals("x")
							 && chessBoard[i][j + 2].equals("x") 
							 && chessBoard[i][j + 3].equals("x")
							 && chessBoard[i][j + 4].equals("x"))) {
						return true;
					}
					if ((chessBoard[i][j].equals("o") 
					  && chessBoard[i + 1][j].equals("o")
					  && chessBoard[i + 2][j].equals("o") 
					  && chessBoard[i + 3][j].equals("o")
					  && chessBoard[i + 4][j].equals("o"))
							|| (chessBoard[i][j].equals("x") 
							 && chessBoard[i + 1][j].equals("x")
							 && chessBoard[i + 2][i].equals("x") 
							 && chessBoard[i + 3][j].equals("x")
							 && chessBoard[i + 4][j].equals("x"))) {
						return true;
					}
					if ((chessBoard[i][i].equals("o") 
					  && chessBoard[i + 1][j + 1].equals("o")
					  && chessBoard[i + 2][j + 2].equals("o") 
					  && chessBoard[i + 3][j + 3].equals("o")
					  && chessBoard[i + 4][j + 4].equals("o"))
							|| (chessBoard[i][j].equals("x") 
							 && chessBoard[i + 1][j + 1].equals("x")
							 && chessBoard[i + 2][j + 2].equals("x") 
							 && chessBoard[i + 3][i + 3].equals("x")
							 && chessBoard[i + 4][j + 4].equals("x"))) {
						return true;
					}
					if ((chessBoard[i][i + 4].equals("o") 
					  && chessBoard[i + 1][j + 3].equals("o")
					  && chessBoard[i + 2][j + 2].equals("o") 
					  && chessBoard[i + 3][j + 1].equals("o")
					  && chessBoard[i + 4][j].equals("o"))
							|| (chessBoard[i][j + 4].equals("x") 
							 && chessBoard[i + 1][j + 3].equals("x")
							 && chessBoard[i + 2][j + 2].equals("x") 
							 && chessBoard[i + 3][i + 1].equals("x")
							 && chessBoard[i + 4][j].equals("x"))) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public String switchPlayer(String player) {
		if (player.equals("player1")) {
			player = "player2";
		} else {
			player = "player1";
		}
		return player;
	}

	public boolean stepIsOK(String[][] chessBoard, int n, int i, int j) {
		if (i < 1 || i > n || j < 1 || j > n || chessBoard[i - 1][j - 1].equals("o")
				|| chessBoard[i - 1][j - 1].equals("x")) {
			return false;
		}
		return true;
	}

	public void printChessBoard(String[][] chessBoard) {
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard.length; j++) {
				System.out.print(chessBoard[i][j]);
				if (j == 18) {
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args) {
		int n = 19;
		new _009_GomokuGame().startGomokuGame(n);

//		String[][] chessBoard = new String[n][n];
//		for (int i = 0; i < chessBoard.length; i++) {
//			for (int j = 0; j < n; j++) {
//				chessBoard[i][j] = ".";
//			}
//		}

//		chessBoard[0][1] = "o";
//		chessBoard[0][2] = "o";
//		chessBoard[0][3] = "o";
//		chessBoard[0][4] = "o";
//		chessBoard[0][5] = "o";
//		new _009_GomokuGame().printChessBoard(chessBoard);
//		System.out.println(new _009_GomokuGame().checkWin(chessBoard, n));

//		chessBoard[1][0] = "o";
//		chessBoard[2][0] = "o";
//		chessBoard[3][0] = "o";
//		chessBoard[4][0] = "o";
//		chessBoard[5][0] = "o";
//		new _009_GomokuGame().printChessBoard(chessBoard);
//		System.out.println(new _009_GomokuGame().checkWin(chessBoard, n));

//		chessBoard[1][1] = "o";
//		chessBoard[2][2] = "o";
//		chessBoard[3][3] = "o";
//		chessBoard[4][4] = "o";
//		chessBoard[5][5] = "o";
//		new _009_GomokuGame().printChessBoard(chessBoard);
//		System.out.println(new _009_GomokuGame().checkWin(chessBoard, n));

//		chessBoard[1][5] = "o";
//		chessBoard[2][4] = "o";
//		chessBoard[3][3] = "o";
//		chessBoard[4][2] = "o";
//		chessBoard[5][1] = "o";
//		new _009_GomokuGame().printChessBoard(chessBoard);
//		System.out.println(new _009_GomokuGame().checkWin(chessBoard, n));
	}
}
