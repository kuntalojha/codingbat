public int sum13(int[] nums) {
  int sum=0;
  if(nums.length==0 ){
    return sum;
  }else{
    for(int i=0;i<nums.length;i++){
      if(nums[i]==13){
        // return sum;
        i++;
        continue;
      }
      sum=sum+nums[i];
    }
    return sum;
  }
}
