class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> scannedNumbers = new HashMap<>();

        for(int i=0 ; i<nums.length ; i++){
            int complement = target - nums[i];

            if(scannedNumbers.containsKey(complement)){
                return new int[]{
                    scannedNumbers.get(complement),
                    i
                };
            }

            scannedNumbers.put(nums[i], i);
        }

        return new int[] {};
    }
}