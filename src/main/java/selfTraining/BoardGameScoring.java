package selfTraining;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BoardGameScoring {

    public static int[] calculateScores(String input) {
        int[] scores = new int[3];
        for (char c : input.toCharArray()) {
            if (c == 'A') {
                scores[0]++;
            } else if (c == 'B') {
                scores[1]++;
            } else if (c == 'C') {
                scores[2]++;
            }
        }
        return scores;
    }

    @Test
    @DisplayName("Single player score test")
    public void testSinglePlayerScore() {
        assertArrayEquals(new int[]{1, 0, 0}, calculateScores("A"));
        assertArrayEquals(new int[]{0, 1, 0}, calculateScores("B"));
        assertArrayEquals(new int[]{0, 0, 1}, calculateScores("C"));
    }

    @Test
    @DisplayName("Equal scores test")
    public void testEqualScores() {
        assertArrayEquals(new int[]{1, 1, 1}, calculateScores("ABC"));
        assertArrayEquals(new int[]{2, 2, 2}, calculateScores("AABBBCCC"));
    }

    @Test
    @DisplayName("Different scores test")
    public void testDifferentScores() {
        assertArrayEquals(new int[]{2, 2, 3}, calculateScores("ABCBACC"));
        assertArrayEquals(new int[]{3, 5, 2}, calculateScores("AACCBBCBCC"));
    }

    @Test
    @DisplayName("Empty score test")
    public void testEmptyInput() {
        assertArrayEquals(new int[]{0, 0, 0}, calculateScores(""));
    }

    @Test
    @DisplayName("No A, B and C players test")
    public void testNoPlayerScores() {
        assertArrayEquals(new int[]{0, 0, 0}, calculateScores("DEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    public static void main(String[] args) {
        String input = "ABCBACC";
        int[] scores = BoardGameScoring.calculateScores(input);
//        int[] scores = BoardGameScoring.calculateScores(input);
        System.out.println("Scores: " + calculateScores(Arrays.toString(scores)));  //not working properly
    }
}
