package level0;

public class ConvertToMultiArray {
    public int[][] solution(int[] num_list, int n) {
        final int m = num_list.length / n;
        
        int[][] result = new int[m][n];
        
        int pt = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                result[i][j] = num_list[pt];
                pt++;
            }
        }
        
        return result;
    }
}
