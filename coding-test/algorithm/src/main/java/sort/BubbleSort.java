package sort;

import java.util.Arrays;

public class BubbleSort {
    int[] sort(int[] array, boolean order) {
        // 배열 길이 저장
        final int LENGTH = array.length;
        
        // order가 참이면 오름차순 정렬
        if(order) {
            // 배열값을 임시저장하는 변수 선언
            int temp;
            
            // 배열을 반복문으로 정렬
            for(int i = LENGTH - 1; i > 0; i--) {
                for(int j = 0; j < i; j++) {
                    if(array[j] > array[j+1]) {
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
        
        // order가 거짓이면 내림차순 정렬
        if(!order) {
            // 배열값을 임시저장하는 변수 선언
            int temp;
            
            // 배열을 반복문으로 정렬
            for(int i = LENGTH - 1; i > 0; i--) {
                for(int j = 0; j < i; j++) {
                    if(array[j] < array[j+1]) {
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
        
        // 정렬된 배열을 반환
        return array;
    }
}
