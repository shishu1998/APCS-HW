public class Array{
    public int[] frontPiece(int[] nums) {
	if (nums.length == 1){
	    int[] newlist = new int[1];
	    newlist[0] = nums[0];
	    return newlist;}
	else if(nums.length == 0){
	    int[] newlist = new int[0];
	    return newlist;}
	else{
	    int[] newlist = new int[2];
	    newlist[0] = nums[0];
	    newlist[1] = nums[1];
	    return newlist;
	}

  
    }
    public int sum13(int[] nums) {
	int result = 0;
	for(int counter = 0;counter < nums.length;counter = counter + 1){
	    if(nums[counter] == 13){
		result = result;
		counter = counter + 1;}
	    else{
		result = result + nums[counter];}}
	return result;
    }
}
