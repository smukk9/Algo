package org.sandeep.main;

import java.util.Scanner;

import org.sandeep.impl.queenImpl;

public class mainapp {

	public static void main(String args[]){
		
		System.out.println("Please enter the board size");
		Scanner sc = new Scanner(System.in);
		int boardSize = sc.nextInt();
		int[][] board = new int[boardSize][boardSize];
		
		queenImpl qp = new queenImpl(boardSize);
		
		if(!qp.solveBoard(board,0))
		{
			System.out.println("No solutions found for given board size");
		}
		
		qp.printBoard(board);
		sc.close();
	}
}
