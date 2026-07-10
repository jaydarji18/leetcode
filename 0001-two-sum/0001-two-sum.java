class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> value = new ArrayList<>();
        for(int i=0 ; i<nums.length-1 ;i++){
            int complement = target-nums[i];
            value.add(i);
            for(int j=i+1 ; j<nums.length;j++){
                if(nums[j]==complement){
                    value.add(j);
                    break;
                }
            }
            if(value.size()==2){
                break;
            }
            else{
                value.clear();
            }
        }
        int array[] = new int[2];
        int i=0;
        for(int element: value){
            array[i]=element;
            i++;
        }
        return array;
    }
}