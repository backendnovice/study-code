package sort;

public class QuickSort {
    void sort(int[] array, int startIndex, int endIndex) {
        int partitionIndex = partition(array, startIndex, endIndex);
        
        if (startIndex < partitionIndex - 1) {
            sort(array, startIndex, partitionIndex - 1);
        }
        
        if (endIndex > partitionIndex) {
            sort(array, partitionIndex, endIndex);
        }
    }
    
    private int partition(int[] array, int leftIndex, int rightIndex) {
        // 피벗이 되는 중간 인덱스
        int pivotIndex = (leftIndex + rightIndex) / 2;
        
        while (leftIndex <= rightIndex) {
            // 왼쪽 값이 피벗 값보다 커질 때까지 오른쪽 이동
            while (array[leftIndex] < array[pivotIndex]) {
                leftIndex++;
            }
            
            // 오른쪽 값이 피벗 값보다 작아질 때까지 왼쪽 이동
            while (array[rightIndex] > array[pivotIndex]) {
                rightIndex--;
            }
            
            // 왼쪽 인덱스보다 오른쪽 인덱스가 작을 경우 교환
            if (leftIndex <= rightIndex) {
                swap(array, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        
        return leftIndex;
    }
    
    private void swap(int[] array, int leftIndex, int rightIndex) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }
}
