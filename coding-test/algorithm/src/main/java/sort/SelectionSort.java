package sort;

import java.util.Arrays;

public class SelectionSort {
    int[] sort(int[] array, boolean order) {
        // 원본 배열, 배열 길이 저장
        final int LENGTH = array.length;
        
        // order가 참이면 오름차순 정렬
        if(order) {
            // 최솟값, 임시값을 저장하는 변수 선언
            int index, temp;
        
            // 배열을 반복문으로 정렬
            for(int i = 0; i < LENGTH - 1; i++) {
                index = i;
                for(int j = i + 1; j < LENGTH; j++) {
                    if(array[j] < array[index])
                        index = j;
                }
                temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
    
        // order가 참이면 내림차순 정렬
        if(!order) {
            // 최댓값, 임시값을 저장하는 변수 선언
            int index, temp;
    
            // 배열을 반복문으로 정렬
            for(int i = 0; i < LENGTH - 1; i++) {
                index = i;
                for(int j = i + 1; j < LENGTH; j++) {
                    if(array[j] > array[index])
                        index = j;
                }
                temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
    
        // 기존 배열, 정렬된 배열을 출력하고 반환
        return array;
    }
}
