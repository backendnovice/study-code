package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTest {
    final int[] RESULT_ASC = new int[]{1, 3, 4, 5, 7};
    final int[] RESULT_DESC = new int[]{7, 5, 4, 3, 1};
    
    @Test
    void sortBubbleTest() {
        int[] array = new int[]{7, 4, 5, 1, 3};
        
        BubbleSort program = new BubbleSort();
        
        assertArrayEquals(program.sort(array, true), RESULT_ASC);
        
        assertArrayEquals(program.sort(array, false), RESULT_DESC);
    }
    
    @Test
    void sortSelectionTest() {
        int[] array = new int[]{7, 4, 5, 1, 3};
        
        SelectionSort program = new SelectionSort();
        
        assertArrayEquals(program.sort(array, true), RESULT_ASC);
        
        assertArrayEquals(program.sort(array, false), RESULT_DESC);
    }
    
    @Test
    void sortInsertionTest() {
        int[] array = new int[]{7, 4, 5, 1, 3};
        
        InsertionSort program = new InsertionSort();
        
        assertArrayEquals(program.sort(array, true), RESULT_ASC);
        
        assertArrayEquals(program.sort(array, false), RESULT_DESC);
    }
    
    @Test
    void sortQuickTest() {
        int[] array = new int[]{7, 4, 5, 1, 3};
        
        QuickSort program = new QuickSort();
        program.sort(array, 0, array.length - 1);
        
        assertArrayEquals(array, RESULT_ASC);
    }
    
    @Test
    void sortMergeTest() {
        int[] array = new int[]{7, 4, 5, 1, 3};
        
        MergeSort program = new MergeSort();
        program.sort(array);
        
        assertArrayEquals(array, RESULT_ASC);
    }
}
