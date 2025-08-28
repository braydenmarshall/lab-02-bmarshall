import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortsTest {

    @Test
    public void testBubbleSort() {
        Sorts sorts = new Sorts();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        sorts.bubbleSort(arr);
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSort() {
        Sorts sorts = new Sorts();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        sorts.mergeSort(arr);
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testInsertionSort() {
        Sorts sorts = new Sorts();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        sorts.insertionSort(arr);
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        assertArrayEquals(expected, arr);
    }

    // Test empty array
    @Test
    public void testEmptyArray() {
        Sorts sorts = new Sorts();
        int[] arr = {};
        sorts.bubbleSort(arr);
        int[] expected = {};
        assertArrayEquals(expected, arr);

        sorts.mergeSort(arr);
        assertArrayEquals(expected, arr);

        sorts.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    // Test single element array
    @Test
    public void testSingleElementArray() {
        Sorts sorts = new Sorts();
        int[] arr = {42};
        sorts.bubbleSort(arr);
        int[] expected = {42};
        assertArrayEquals(expected, arr);

        sorts.mergeSort(arr);
        assertArrayEquals(expected, arr);

        sorts.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    // Test already sorted array
    @Test
    public void testAlreadySortedArray() {
        Sorts sorts = new Sorts();
        int[] arr = {1, 2, 3, 4, 5};
        sorts.bubbleSort(arr);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);

        sorts.mergeSort(arr);
        assertArrayEquals(expected, arr);

        sorts.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }
}