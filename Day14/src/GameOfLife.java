public class GameOfLife {
    public static void gameOfLife(int[][] board) {
//beats 100%
        int row=board.length;
        int col=board[0].length;
        int tempBoard[][]=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col; j++) {
                int count=countNeighbour(board,i,j);
                if(board[i][j]==0){ //dead cell
                     if(count==3){
                         tempBoard[i][j]=1;
                     }
                     else tempBoard[i][j]=0;
                }
                else{//live cell
                    if(count==3 || count==2) tempBoard[i][j]=1;
                    else tempBoard[i][j]=0;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = tempBoard[i][j];
            }
        }
    }
    public static int countNeighbour(int[][] board,int i,int j){
        int row=board.length;
        int col=board[0].length;
        int count=0;
        //these are the 8 possible directions
        int[] dx={-1,-1,-1,0,0,1,1,1};
        int[] dy={-1,0,1,-1,1,-1,0,1};
            for(int k=0;k<8;k++) {
                int newX = i + dx[k];
                int newY = j + dy[k];

                if (newX >= 0 && newX < row && newY >= 0 && newY < col) {
                    if (board[newX][newY] == 1) {
                        count++;
                    }
                }
            }
        return count;
    }
    public static void main(String[] args){
        int [][]board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(board);
        int row=board.length;
        int col=board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
            }
    }
}
