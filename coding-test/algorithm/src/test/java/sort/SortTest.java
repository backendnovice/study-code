package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTest {
    final int[] RESULT_ASC = new int[]{1, 3, 4, 5, 7};
    final int[] RESULT_DESC = new int[]{7, 5, 4, 3, 1};
    
    @Test
    void sortBubbleTest() {
        int[] array = new int[]{7, 4, 5, 1, 3};
        
        BubbleSort object = new BubbleSort();
        
        assertArrayEquals(object.sort(array, true), RESULT_ASC);
        
        assertArrayEquals(object.sort(array, false), RESULT_DESC);
    }
    
    @Test
    void sortSelectionTest() {
        int[] array = new int[]{7, 4, 5, 1, 3};
        
        SelectionSort object = new SelectionSort();
        
        assertArrayEquals(object.sort(array, true), RESULT_ASC);
        
        assertArrayEquals(object.sort(array, false), RESULT_DESC);
    }
    
    @Test
    void sortInsertionTest() {
        int[] array = new int[]{7, 4, 5, 1, 3};
        
        InsertionSort object = new InsertionSort();
        
        assertArrayEquals(object.sort(array, true), RESULT_ASC);
        
        assertArrayEquals(object.sort(array, false), RESULT_DESC);
    }
    
    @Test
    void sortQuickTest() {
        int[] array = new int[]{7, 4, 5, 1, 3};
        
        QuickSort object = new QuickSort();
        object.sort(array, 0, array.length - 1);
        
        assertArrayEquals(array, RESULT_ASC);
    }
}
