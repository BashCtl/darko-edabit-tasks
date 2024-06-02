package very_hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
Chess Pieces

Create a function that takes the name of a chess piece, its position and a target position. The function should return true if the piece can move to the target and false if it can't.

The possible inputs are "Pawn", "Knight", "Bishop", "Rook", "Queen" and "King".

Examples
canMove("Rook", "A8", "H8") ➞ true

canMove("Bishop", "A7", "G1") ➞ true

canMove("Queen", "C4", "D6") ➞ false
Notes
Do not include pawn capture moves and en passant.
Do not include castling.
Remember to include pawns' two-square move on the second rank!
Look for patterns in the movement of the pieces.

 */

public class ChessPieces {


    public static boolean canMove(String piece, String currentPosition, String targetPosition) {
        int[] start = convertPosition(currentPosition);
        int[] end = convertPosition(targetPosition);

        switch (piece.toLowerCase()) {
            case "pawn":
                return canPawnMove(start, end);
            case "knight":
                return canKnightMove(start, end);
            case "bishop":
                return canBishopMove(start, end);
            case "rook":
                return canRookMove(start, end);
            case "queen":
                return canQueenMove(start, end);
            case "king":
                return canKingMove(start, end);
            default:
                throw new IllegalArgumentException("Unknown piece: " + piece);
        }
    }

    private static int[] convertPosition(String position) {
        int column = position.charAt(0) - 'A';
        int row = position.charAt(1) - '1';
        return new int[]{column, row};
    }

    private static boolean canPawnMove(int[] start, int[] end) {
        int startRow = start[1];
        int endRow = end[1];
        int startCol = start[0];
        int endCol = end[0];

        if (startCol == endCol) {
            if (endRow == startRow + 1) {
                return true;
            }
            if (startRow == 1 && endRow == startRow + 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean canKnightMove(int[] start, int[] end) {
        int dx = Math.abs(start[0] - end[0]);
        int dy = Math.abs(start[1] - end[1]);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }

    private static boolean canBishopMove(int[] start, int[] end) {
        return Math.abs(start[0] - end[0]) == Math.abs(start[1] - end[1]);
    }

    private static boolean canRookMove(int[] start, int[] end) {
        return start[0] == end[0] || start[1] == end[1];
    }

    private static boolean canQueenMove(int[] start, int[] end) {
        return canRookMove(start, end) || canBishopMove(start, end);
    }

    private static boolean canKingMove(int[] start, int[] end) {
        int dx = Math.abs(start[0] - end[0]);
        int dy = Math.abs(start[1] - end[1]);
        return dx <= 1 && dy <= 1;
    }

    @Test
    public void test1() {
        assertEquals(true, canMove("Pawn", "A5", "A6"));
    }

    @Test
    public void test2() {
        assertEquals(true, canMove("Pawn", "G2", "G4"));
    }

    @Test
    public void test3() {
        assertEquals(false, canMove("Pawn", "C6", "D7"));
    }

    @Test
    public void test4() {
        assertEquals(true, canMove("Knight", "F5", "E3"));
    }

    @Test
    public void test5() {
        assertEquals(false, canMove("Knight", "F6", "E5"));
    }

    @Test
    public void test6() {
        assertEquals(true, canMove("Bishop", "B4", "E7"));
    }

    @Test
    public void test7() {
        assertEquals(false, canMove("Bishop", "B6", "F5"));
    }

    @Test
    public void test8() {
        assertEquals(true, canMove("Rook", "A8", "H8"));
    }

    @Test
    public void test9() {
        assertEquals(false, canMove("Rook", "A8", "H7"));
    }

    @Test
    public void test10() {
        assertEquals(true, canMove("Queen", "A8", "H1"));
    }

    @Test
    public void test11() {
        assertEquals(false, canMove("Queen", "A6", "H4"));
    }

    @Test
    public void test12() {
        assertEquals(true, canMove("King", "C4", "D5"));
    }

    @Test
    public void test13() {
        assertEquals(false, canMove("King", "B7", "B5"));
    }
}
