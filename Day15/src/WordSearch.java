public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        if (board == null || word == null || board.length == 0 || board[0].length == 0) {
            return false;
        }

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true; // Found the word
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false; // Out of bounds or character doesn't match
        }

        // Mark the cell as visited
        char temp = board[i][j];
        board[i][j] = '#'; // Use a special character to mark the visited cell

        // Explore all 4 directions
        boolean found = dfs(board, word, i - 1, j, index + 1) || // up
                dfs(board, word, i + 1, j, index + 1) || // down
                dfs(board, word, i, j - 1, index + 1) || // left
                dfs(board, word, i, j + 1, index + 1);   // right

        // Unmark the cell
        board[i][j] = temp;

        return found;
    }

    public static void main(String args[]){

    }
}
