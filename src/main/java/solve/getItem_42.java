package solve;

import java.util.Arrays;

public class getItem_42 {
    public static void main(String[] args) {
        getItem_42_Solution a = new getItem_42_Solution();

        int[] arr1 = new int[]{1, 4, 8, 10};
        int[] arr2 = new int[]{2, 3, 5, 9};
        int result = a.getItemFromTwoSortedArrays(arr1, arr2, 6);
        System.out.println(result);
    }
}
class getItem_42_Solution {
    public static int getItemFromTwoSortedArrays(int[] arr1, int[] arr2, int k) {
        // TODO:
        // 배열을 합친다.
        int[] new_arr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, new_arr,0 ,arr1.length);
        System.arraycopy(arr2, 0, new_arr,arr1.length ,arr2.length);
        // 오름차순 정렬을 한다.
        Arrays.sort(new_arr);
        // 이진 탐색
        int left = 0;
        int right = new_arr.length-1;
        int m = 0;
        while (left <= right){
            m = (left + right) / 2;
            if(k - 1 == m) return new_arr[m];
            if(k - 1 < m) right = m - 1;
            if(k - 1 > m) left = m + 1;
        }
        // 1 2 3 4 5 8 9 10
        return new_arr[left];
    }
}