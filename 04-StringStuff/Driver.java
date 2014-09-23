public class Driver{
    public static void main(String[] args){
	public boolean mixStart(String str) {
	    return str.indexOf("ix") > 0;
	}
	public String makeOutWord(String out, String word) {
	    return out.substring(0,2) + word + out.substring(2);
	}
	public String firstHalf(String str) {
	    return str.substring(0,str.length() / 2);
	}
    }
}
