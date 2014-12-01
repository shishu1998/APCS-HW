public class OrderArray extends StringArray{
    public boolean add(String s){
	int proper = 0;
	if(super.get(0) == null){
	    super.set(proper,s);
	}
	else{
	    for(int i = super.size() - 1; i > 0; i --){
		if(s.compareTo(super.get(i)) < 0){
		    proper = i;
		}
		if(super.size() == super.get().length){
		    super.grow();
		}
		for( i = super.size() + 1; i > proper + 1; i --){
		    super.set(i,super.get(i-1));
		}
		super.set(proper,s);
	    }
	}
	return true;
    }

     public static void main(String[] args){
	StringArray as = new OrderArray();
	System.out.println(as);
	System.out.println(as.size());
	System.out.println(as.add("man"));
	System.out.println(as.add("tan"));
	System.out.println(as.add("dan"));
	System.out.println(as.add("white"));
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
	System.out.println(as.remove(0));
	System.out.println(as);
    }
}

