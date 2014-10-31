import java.util.*;

public class Arraystuff {
    /*-------------------- Instance Variables --------------------*/

    private int[] a;
    private Random rnd;
    /* by making a variable final we can't change
       the value after the initial asssignment 
    */
    public final int final_example = 123;

    /*-------------------- Constructors --------------------*/
    
    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }
    
    public Arraystuff() {
	this(100);
    }

    /*-------------------- Methods --------------------*/
    public String toString(){
	String s="";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }
    public int find(int n){
	int result = -1;
	int counter = 0;
	while (counter < a.length - 1 && a[counter] != n){
	    counter = counter + 1;
	    if(a[counter] == n){
	    result = counter;
	    }
	}
	return result;
    }
    public int maxVal(){
	int result;
	result = a[0];
	for (int counter = 1;counter < a.length - 1;counter = counter + 1){
	    if(a[counter] > result){
		result = a[counter];
	    }
	}
	return result;
    }
    public int sum67(int[] nums) {
	int sum = 0;
	boolean add = true;
	for(int counter=0;counter < nums.length; counter++){
	    if (nums[counter] == 6){
		add = false;}
	    if(add == true){
		sum = sum + nums[counter];
	    }
	    if(nums[counter] == 7){
		add = true;
	    }
	}
	return sum;
    }
    public boolean more14(int[] nums) {
	boolean more;
	int count1= 0;
	int count4 = 0;
	for(int counter = 0;counter < nums.length;counter ++){
	    if(nums[counter] == 4){
		count4 = count4 + 1;}
	    if(nums[counter] == 1){
		count1 = count1 + 1;
	    }

	}
	return count1 > count4;
  
    }
    public int[] tenRun(int[] nums) {
	int[] result = new int[nums.length];
	boolean ten = false;
	int replace = 0;
	for(int counter = 0;counter < nums.length;counter ++){
	    if(nums[counter] % 10 == 0){
		ten = true;
		replace = nums[counter];
	    }
	    if(ten == true){
		result[counter] = replace;
	    }
	    if(ten == false){
		result[counter] = nums[counter];
	    }
	}
	return result;
  
    }
    public boolean tripleUp(int[] nums) {
	boolean result = false;
	int count = 0;
	for(int counter = 2;counter < nums.length;counter ++){
	    int num1 = nums[counter];
	    int num2 = nums[counter -1] + 1;
	    int num3 = nums[counter - 2] + 2;
	    if(num1 == num2 & num1 == num3){
		result = true;
	    }
	}
	return result;
    }
    public boolean canBalance(int[] nums) {
	int sum = 0;
	int sum2 = 0;
	if(nums.length < 2){
	    return false;
	}
	for(int counter = 0;counter < nums.length;counter++){
	    sum = sum + nums[counter];
	}
	if(sum % 2 == 1){
	    return false;
	}
	else{
	    sum = sum / 2;
	}
	for(int counter2 = 0;sum2 < sum;counter2 ++){
	    sum2 = sum2 + nums[counter2];
	}  
	return sum == sum2;
    }
    public int[] seriesUp(int n) {
	int len = n*(n + 1) / 2;
	int[] result = new int[len];
	int position = 0;
	int num = 1;
	int limit = 1;
	for(int counter = 0;counter < len;counter++){
	    position = counter;
	    if(num <= limit){
		result[position] = num;
		num = num + 1;
	    }
	    else{
		limit = limit + 1;
		num = 1;
		result[position] = num;
		num = num + 1;
	    }
	}
	
	return result;
    }
    public int freq(int num){
	int check = a[num];
	int result = 0;
	for(int counter = 0;counter < a.length;counter ++){
	    if(a[counter] == check){
		result ++;
	    }
	}
	return result;
    }
    /* I tried to make it so that the code would check to see if there's another of the same number in the whole array, then it splices it into two parts to see if there're mirrors, however that didn't really work out since this did not work for all of the cases.
     */
    public int maxMirror(int[] nums) {
	int dbpos;
	int count1 = 0;
	int count2 = 0;
	int check = 0;
	for(int counter = 0;counter < nums.length;counter++){
	    check = nums[counter];
	    dbpos = 0;
	    for(int counter2 = 0;counter2 < nums.length;counter2 ++){
      if (nums[nums.length - 1 - counter2] == check){
	  dbpos = nums.length - 1 - counter2;
      }
	    }
	    for(int counter3 = 0;counter3 < nums.length;counter3 ++){
		if(counter3 < dbpos && nums[counter3] == nums[dbpos - counter3]){
		    count1 = count1 + 1;
		}
		else if(count1 > count2){
		    count2 = count1;
		}
	    }
	}
	return count2;
    }

    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	System.out.println(as.find(100));
	System.out.println(as.maxVal());
	System.out.println(as.freq(2));
	
    }
}
