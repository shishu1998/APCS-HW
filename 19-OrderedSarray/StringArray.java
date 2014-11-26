public class StringArray{
    private String[] data;
    public StringArray(){
	data = new String[10];
    }
    public String toString(){
	String s = "";
	for (int i = 0; i < data.length; i ++){
	    s = s + data[i] + ", ";
	}
	return s;
    }
    public int size(){
	int count = 0;
	for(int counter =0; counter < data.length;counter ++){
	    if(data[counter] != null){
		count ++;
	    }
	}
	return count;
    }
    public boolean add(String i){
	int len = data.length;
	if(size() == len){
	    String []data2 = new String[len + 1];
	    for(int counter = 0;counter < len; counter ++){
		data2[counter] = data[counter];
	    }
	    data[size()] = i;
	}
	else{
	    data[size()] = i;
	}
	return true;
    }
    public String get(int index){
	return data[index];
    }
    public String remove(int index){
	if (index>data.length -1){
	    throw new ArrayIndexOutOfBoundsException();
	}
	String original = data[index];
	for(int counter = index; counter < data.length - 1;counter ++){
	    data[counter] = data[counter + 1];
	}
	return original;
    } 
    public static void main(String[] args){
	StringArray as = new StringArray();
	System.out.println(as);
	System.out.println(as.size());
	System.out.println(as.add("man"));
	System.out.println(as.add("tan"));
	System.out.println(as.add("Dan"));
	System.out.println(as.add("White"));
	System.out.println(as.add("Blue"));
	System.out.println(as);
	System.out.println(as.remove(0));
	System.out.println(as);
    }
}
