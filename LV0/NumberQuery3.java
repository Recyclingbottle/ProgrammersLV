class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length ; i++){
            int j = queries[i][0];
            int k = queries[i][1];
            int tmp = arr[j];
            arr[j] = arr[k];
            arr[k] = tmp;
        }
        return arr;
    }
}