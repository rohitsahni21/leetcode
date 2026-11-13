class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;

        int temp[] = new int[n];
        int j=0;

        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                temp[j]=nums[i];
                j++;
            }
        }
        for(int i =0;i<temp.length; i++){
            nums[i]=temp[i];
        }
        // for(int i = temp.length-1; i<n; i++){
        //     nums[i]=0;
        // }

        
    }
}