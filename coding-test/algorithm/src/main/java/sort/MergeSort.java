package sort;

import java.util.Arrays;

public class MergeSort {
    void sort(int[] array) {
        int[] temp = new int[array.length];
        
        divide(array, temp, 0, array.length - 1);
    }
    
    /**
     * 배열을 균등한 크기로 분할하는 메소드.
     *
     * @param array 균등할 배열.
     */
    void divide(int[] array, int[] temp, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            
            // 시작 ~ 중간 인덱스 범위 분할
            divide(array, temp, startIndex, middleIndex);
            // 중간 ~ 끝 인덱스 범위 분할
            divide(array, temp, middleIndex + 1, endIndex);
            // 분할된 배열을 정렬
            combine(array, temp, startIndex, middleIndex, endIndex);
        }
    }
    
    /**
     * 배열을 정렬하고 병합하는 메소드.
     *
     * @param array       정렬할 배열.
     * @param temp        임시 배열.
     * @param startIndex  시작 인덱스.
     * @param middleIndex 중간 인덱스.
     * @param endIndex    끝 인덱스.
     */
    void combine(int[] array, int[] temp, int startIndex, int middleIndex, int endIndex) {
        int leftPointer = startIndex;
        int rightPointer = middleIndex + 1;
        int totalPointer = startIndex;
        
        // 배열을 임시배열로 복사
        for (int i = startIndex; i <= endIndex; i++)
            temp[i] = array[i];
        
        while (leftPointer <= middleIndex && rightPointer <= endIndex) {
            // 왼쪽 값이 오른쪽 값보다 클경우 배열 대입
            if (temp[leftPointer] <= temp[rightPointer]) {
                array[totalPointer] = temp[leftPointer];
                leftPointer++;
            }
            // 오른쪽 값이 왼쪽 값보다 클경우 배열 대입
            else {
                array[totalPointer] = temp[rightPointer];
                rightPointer++;
            }
            totalPointer++;
        }
        
        // 왼쪽 값들이 오른쪽 배열값들보다 빨리 끝날 경우,
        for (int i = 0; i <= middleIndex - leftPointer; i++) {
            array[totalPointer + i] = temp[leftPointer + i];
        }
    }
}
