class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int j=0;
        int k=n;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr[i]=nums[j];
                j++;
            }else{
                arr[i]=nums[k];
                k++;
            }
        }
        return arr;
        
    }
}