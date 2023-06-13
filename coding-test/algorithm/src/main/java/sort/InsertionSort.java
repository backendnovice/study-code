package sort;

public class InsertionSort {
    int[] sort(int[] array, boolean order) {
        // 배열 길이 저장
        final int LENGTH = array.length;
        
        // order가 참이면 오름차순 정렬
        if (order) {
            int j, pointer;
            
            // 배열을 반복문으로 정렬
            for (int i = 1; i < LENGTH; i++) {
                pointer = array[i];
                for (j = i - 1; j >= 0 && array[j] > pointer; j--) {
                    array[j + 1] = array[j];
                }
                array[j + 1] = pointer;
            }
        }
        
        // order가 거짓이면 내림차순 정렬
        if (!order) {
            int j, pointer;
            
            // 배열을 반복문으로 정렬
            for (int i = 1; i < LENGTH; i++) {
                pointer = array[i];
                for (j = i - 1; j >= 0 && array[j] < pointer; j--) {
                    array[j + 1] = array[j];
                }
                array[j + 1] = pointer;
            }
        }
        
        // 정렬된 배열 반환
        return array;
    }
}
