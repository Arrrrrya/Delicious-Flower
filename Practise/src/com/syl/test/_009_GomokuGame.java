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
		String winner = "";
		String chess = "";
		String player = "player1";
		String stepInfo = "";
		int i = 0;
		int j = 0;
		int failStep = 0;
		
		while (!endFlag && !winFlag) {
			System.out.println(player + " �Ļغ�!");
			printChessBoard(chessBoard);
			stepInfo = scan.nextLine();
			try {
				i = Integer.parseInt(stepInfo.split(" ")[0]);
				j = Integer.parseInt(stepInfo.split(" ")[1]);
			} catch (Exception e) {
				System.out.println(player + " �Ѿ���Ȩ��");
				endFlag = true;
				winner = switchPlayer(player);
				break;
			}
			if (!stepIsOK(chessBoard, n, i, j)) {
				System.out.println(player + " ��" + (failStep + 1) + "��������Ч");
				failStep++;
				if (failStep == 2) {
					System.out.println(player + " 2��������Ч��ֱ���и���");
					endFlag = true;
						winner = switchPlayer(player);
					break;
				}
				continue;
			} else {
				if (player.equals("player1")) {
					chess = "o";
				} else {
					chess = "x";
				}
				chessBoard[i - 1][j - 1] = chess;
				if (checkWin(chessBoard, n, chess)) {
					winner = player;
					winFlag = true;
					System.out.println("�������Ϊ��");
					printChessBoard(chessBoard);
					break;
				}
				player = switchPlayer(player);
			}
		}
		if(endFlag) {
			System.out.println(winner + " ��ʤ");
		}else if(winFlag) {
			System.out.println(winner + " սʤ�� " + (winner.equals("player1") ? switchPlayer(winner) : "player1") + "!");
		}
		scan.close();
	}

	//������ô�Ż����о��е��
	public boolean checkWin(String[][] chessBoard, int n, String chess) {
		for (int i = 0; i < chessBoard.length -4; i++) {
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
		new _009_GomokuGame().startGomokuGame(19);
	}
}
