
public class LeetCodeChess {

    public static int numRookCaptures(char[][] board) {
        int count = 0;
        int row = -1;
        int col = -1;
        boolean flag = true;
        for (int i = 0; i < board.length && flag; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    row = i;
                    col = j;
                    flag = false;
                    break;
                }
            }
        }
        System.out.println("row : " + row);
        System.out.println("col :" + col);
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'B') {
                break;
            }
            if (board[i][col] == 'p') {
                count++;
                break;
            }
        }
        for (int i = row + 1; i < board.length; i++) {
            if (board[i][col] == 'B') {
                break;
            }
            if (board[i][col] == 'p') {
                count++;
                break;
            }
        }

        for (int i = col + 1; i < board[0].length; i++) {
            if (board[row][i] == 'B') {
                break;
            }
            if (board[row][i] == 'p') {
                count++;
                break;
            }
        }

        for (int i = col - 1; i >= 0; i--) {
            if (board[row][i] == 'B') {
                break;
            }
            if (board[row][i] == 'p') {
                count++;
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        char board[][] = {
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', 'p', '.', '.', '.', '.' },
                { '.', '.', '.', 'R', '.', '.', '.', 'p' },
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', 'p', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.' }
        };
        int results = numRookCaptures(board);
        System.out.println("final output : " + results);
    }
}