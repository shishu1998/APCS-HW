public class StringArray{
    private String[] data;
    public StringArray(){
	data = new String[10];
    }
    public String[] get(){
	return data;
    }
    public void set(int index,String s){
	data[index] = s;
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
    public void grow(){
	String[] data2 = new String[size() + 10];
	for(int i = 0; i < data.length; i ++){
	    data2[i] = data[i];
	}
	data = new String[size() + 10];
	for(int i = 0; i < data.length; i ++){
	    data[i] = data2[i];
	}
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
}
