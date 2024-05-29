package very_hard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;


/*
The ECG Sequence

In the ECG Sequence (that always starts with the numbers 1 and 2), every number that succeeds is the smallest not already present in the sequence and that shares a factor (excluding 1) with its preceding number. Every number in the ECG Sequence (besides 1 and 2) has a different index from its natural index in a normal numeric sequence. See the example below to establish the ECG Sequence Index of number 3.

// Find the smallest number that is not in sequence...
// This number shares a factor with the preceding?

SEQUENCE = [1, 2]

3 = no factors shared with 2
4 = shares factor 2 with number 2

SEQUENCE = [1, 2, 4]

3 = no factors shared with 4
5 = no factors shared with 4
6 = shares factor 2 with number 4

SEQUENCE = [1, 2, 4, 6]

3 = shares factor 3 with number 6

SEQUENCE = [1, 2, 4, 6, 3]

Number 3 is at index 4 in the ECG Sequence.
Given an integer n implement a function that returns its ECG Sequence Index.

Examples
ecgSeqIndex(3) ➞ 4

ecgSeqIndex(5) ➞ 9

ecgSeqIndex(7) ➞ 13
Notes
ECG is the acronym for the electrocardiogram: if you try to graphically represent the trend of the sequence, a similar scheme appears.
Curiosity: every odd prime p in the sequence is preceded by 2p and followed by 3p.

 */
public class ECGSequence {

    public static int ecgSequenceIndex(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(2);

        Set<Integer> inSequence = new HashSet<>();
        inSequence.add(1);
        inSequence.add(2);

        while (!inSequence.contains(n)) {
            int lastNumber = sequence.get(sequence.size() - 1);
            int nextNumber = findNextNumber(lastNumber, inSequence);
            sequence.add(nextNumber);
            inSequence.add(nextNumber);
        }

        return sequence.indexOf(n);
    }

    private static int findNextNumber(int lastNumber, Set<Integer> inSequence) {
        int candidate = 2; // Start checking from 2 upwards
        while (true) {
            if (!inSequence.contains(candidate) && hasCommonFactor(lastNumber, candidate)) {
                return candidate;
            }
            candidate++;
        }
    }

    private static boolean hasCommonFactor(int a, int b) {
        return gcd(a, b) > 1;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Test
    public void test1() {
        assertEquals(4, ecgSequenceIndex(3));
    }

    @Test
    public void test2() {
        assertEquals(9, ecgSequenceIndex(5));
    }

    @Test
    public void test3() {
        assertEquals(13, ecgSequenceIndex(7));
    }

    @Test
    public void test4() {
        assertEquals(11, ecgSequenceIndex(18));
    }

    @Test
    public void test5() {
        assertEquals(20, ecgSequenceIndex(33));
    }

    @Test
    public void test6() {
        assertEquals(40, ecgSequenceIndex(44));
    }

    @Test
    public void test7() {
        assertEquals(43, ecgSequenceIndex(69));
    }

    @Test
    public void test8() {
        assertEquals(68, ecgSequenceIndex(75));
    }

    @Test
    public void test9() {
        assertEquals(188, ecgSequenceIndex(101));
    }

    @Test
    public void test10() {
        assertEquals(199, ecgSequenceIndex(208));
    }

    @Test
    public void test11() {
        assertEquals(281, ecgSequenceIndex(300));
    }

}
