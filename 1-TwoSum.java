class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> secondValueMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sv = target - nums[i];
            if(secondValueMap.containsKey(sv)){
                return new int[]{i,secondValueMap.get(sv)};
            }
            else{
                secondValueMap.put(nums[i],i);
            }
        }
        return null;
    }
}
