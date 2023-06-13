package sort;

import java.util.Arrays;

public class SelectionSort {
    int[] sort(int[] array, boolean order) {
        // 배열 길이 저장
        final int LENGTH = array.length;
        
        // order가 참이면 오름차순 정렬
        if (order) {
            int index, temp;
            
            // 배열을 반복문으로 정렬
            for (int i = 0; i < LENGTH - 1; i++) {
                index = i;
                for (int j = i + 1; j < LENGTH; j++) {
                    if (array[j] < array[index])
                        index = j;
                }
                temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
        
        // order가 참이면 내림차순 정렬
        if (!order) {
            int index, temp;
            
            // 배열을 반복문으로 정렬
            for (int i = 0; i < LENGTH - 1; i++) {
                index = i;
                for (int j = i + 1; j < LENGTH; j++) {
                    if (array[j] > array[index])
                        index = j;
                }
                temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
        
        // 정렬된 배열 반환
        return array;
    }
}
