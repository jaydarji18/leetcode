class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] mergedArray = mergeArray(nums1, nums2);
        int n = mergedArray.length;

        if (n % 2 == 1) {
            return mergedArray[n / 2];
        } else {
            return (mergedArray[(n / 2) - 1] + mergedArray[n / 2]) / 2.0;
        }
    }

    public static int[] mergeArray(int[] num1, int[] num2){
        int totalSize = num1.length + num2.length;
        int[] mergedArray = new int[totalSize];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < num1.length && j < num2.length){
            if(num1[i] < num2[j]){
                mergedArray[k] = num1[i];
                k++;
                i++;
            }else{
                mergedArray[k] = num2[j];
                k++;
                j++;
            }
        }

        while(i < num1.length){
            mergedArray[k] = num1[i];
            k++;
            i++;
        }

        while(j < num2.length){
            mergedArray[k] = num2[j];
            k++;
            j++;
        }

        return mergedArray;
    }
}