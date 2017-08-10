import java.util.Scanner;

/**
 * Created by choubeyp on 7/17/2017.
 */
public class TicTacToe {
    enum State {X, O}

    ;
    int n;


    public TicTacToe(State[][] board) {
        this.board = board;
        this.n = board.length;
    }

    State[][] board = {{null, State.O, State.X}, {null, State.O, State.X}, {null, null, State.X}};

/*
    public State checkColumn(int c) {
        State firstPiece = board[0][c];
        for (int i = 1; i < n; i++) {
            if (board[i][c] != firstPiece) {
                return null;
            }
        }
        return firstPiece;
    } */

    public State checkGroup(int r, int c, int dr, int dc) {
        State firstPiece = board[r][c];
        for (int i = 1; i < n; i++) {
            if (board[r + i*dr][c + i*dc] != firstPiece) {
                return null;
            }
        }
        return firstPiece;
    }
    public State rowWinner(int r){
        return checkGroup(r,0,0,1);
    }
    public State columnWinner(int c){
        return checkGroup(0,c,1,0);
    }
    public State diagonolWinner(){
        return checkGroup(0,0,1,1);
    }
    public State antidiagonolWinner(){
        return checkGroup(0,n-1,1,-1);
    }
    public State boardWinner(){
        State winner = diagonolWinner();
        if(winner != null){
            return winner;
        }
        winner = antidiagonolWinner();
        if(winner != null){
            return winner;
        }
        for (int i = 0; i < n; i++) {
            winner = rowWinner(i);
            if(winner != null){
                return winner;
            }
        }
        for (int i = 0; i < n; i++) {
            winner = columnWinner(i);
            if(winner != null){
                return winner;
            }
        }
    }


    /*State checkDiagonal(int r, int c) {
        State state = board[r][c];

        if (((board[0][0] == board[2][2]) && (board[0][0] == board[1][1])) ||
                ((board[2][0] == board[1][1]) && (board[1][0] == board[0][3])))
            return state;
        else
            return null;
    }


    State checkRow(int r) {
        State state = board[r][0];
        if (board[r][1] == state && board[r][2] == state) {
            return state;
        } else
            return null;

    }

    State checkElement(int r, int c) {
        State winner = checkRow(r, c);

        if (winner != null)
            return winner;
        else {
            winner = checkColumn(r, c);
            if (winner != null) {
                return winner;
            } else if (r == c) {
                winner = checkDiagonal(r, c);
            }
        }
        return winner;
    }

    public int evaluate() {
        State winner = null;
        for (int i = 0; i <= 2; i++) {
            if (board[i][i] == null) {
                continue;
            } else
                winner = checkElement(i, i);
            if (winner != null)
                break;
        }
        if (winner == null)
            return -1;
        else if (winner == State.X)
            return 1;
        else
            return 0;
    }*/
}
