public class StringStuff{
    //problem one
    public String nonStart(String a, String b) {
	return a.substring(1) + b.substring(1);
    }
    //problem two
    public String makeAbba(String a, String b) {
	return a + b + b + a;
    }
    //problem three
    public int diff21(int n) {
	if (n > 21) {
	    return (n - 21) * 2;
	}
	else {
	    return 21 - n;}
    
    	
    }
}
