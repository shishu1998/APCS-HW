public class OrderArray extends StringArray{
    public int find(String w){
	int len = get().length;
	int output = len;
	for (int i = 0; i < len; i ++){
	    if (get()[i] == null || w.compareTo(get()[i]) <= 0) {
	        output = i;
		i = len;
	    }
	}
	return output;
    }
    public boolean add(String s){
	super.add(find(s), s);
	return true;
    }

     public static void main(String[] args){
        OrderArray as = new OrderArray();
	System.out.println(as);
	System.out.println(as.size());
	System.out.println(as.add("man"));
	System.out.println(as.add("dan"));
	System.out.println(as.add("wow"));
	System.out.println(as.add("blue"));
	System.out.println(as.add("ban"));
	System.out.println(as.add("fan"));
	System.out.println(as.add("wan"));
	System.out.println(as.add("bite"));
	System.out.println(as.add("true"));
	System.out.println(as.add("san"));
	System.out.println(as.add("ran"));
	System.out.println(as.add("can"));
	System.out.println(as.add("mite"));
	System.out.println(as.add("clue"));
	
	System.out.println(as);
    }
}

