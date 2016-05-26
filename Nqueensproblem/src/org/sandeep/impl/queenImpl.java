package org.sandeep.impl;

public class queenImpl {

	int boardSize =0;
	public queenImpl(int N){
		this.boardSize = N;
	}

	public boolean solveBoard(int[][] board, int column){
		if(column >= boardSize){
			return true;
		}
		for(int i= 0; i<boardSize; i++){

			if(checkMove(board,i, column)){
				board[i][column]=1;
				printBoard(board);
				//this where backtracking happens
				if(solveBoard(board,column+1)){
						return true;
				}
				board[i][column]=0;
			}
		}
		return false;
	}

	public boolean checkMove(int board[][], int row, int column){
		int i, j;
		//checking for same row. towards tables right.
		for(i=0;i<column;i++){
			if(board[row][i]==1){
				return false;
			}
		}
		//checking for diagonally upwards from the queen position.
		for(i=row,j=column; i>=0&&j>=0; i--,j--){
			if(board[i][j]==1){
				return false;
			}
		}
		//checking for diagonally downwards{towards table right) from the queen position.
		for(i=row,j=column; i<boardSize&& j>=0; i++,j--){
			if(board[i][j]==1){
				return false;
			}
		}
		//all the three test fails than no threat to queen
		return true;
	}

	public void printBoard(int[][] board){

		System.out.print("--------------------------\n\n");
		for(int i=0;i<boardSize;i++){
			for(int j=0;j<boardSize;j++){
				
				if(board[i][j]==1){
					System.out.print("Q\t");
				}else{
					System.out.print("-\t");
				}
			}
			System.out.println();
		}

	}
}
