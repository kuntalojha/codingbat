public int countEvens(int[] nums) {
  int count=0,num=0;;
  for(int i=0;i<nums.length;i++){
    num=nums[i];
    if(num%2==0){
      count++;
    }
  }
  return count;
}