class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList <String> a=new ArrayList<>();
        int start=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==nums.length-1 || nums[i]+1 !=nums[i+1])
            {
                if(start == i)
                {
                   a.add(String.valueOf(nums[i]));
                }
                else
                {
                   a.add(nums[start]+"->"+nums[i]);
                }
                start=i+1;
            }
        }
        return a;
    }
}