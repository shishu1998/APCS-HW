public class Sarray{
    private int[] data;
    private int last = 0;
    public Sarray(){
	data = new int[10];
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
	    if(data[counter] != 0){
		count ++;
	    }
	}
	return count;
    }
    public boolean add(int i){
	int len = data.length;
	if(last == len){
	    int []data2 = new int[len + 1];
	    for(int counter = 0;counter < len; counter ++){
		data2[counter] = data[counter];
	    }
	    data[last] = i;
	    last ++;
	}
	else{
	    data[last] = i;
	    last ++;
	}
	return true;
    }
    public int get(int index){
	return data[index];
    }
    public int set(int index, int i){
	if (index>data.length -1){
	    throw new ArrayIndexOutOfBoundsException();
	}
	int original = data[index];
	data[index] = i;
	return original;
    }
    public int remove(int index){
	if (index>data.length -1){
	    throw new ArrayIndexOutOfBoundsException();
	}
	int original = data[index];
	for(int counter = index; counter < data.length - 1;counter ++){
	    data[counter] = data[counter + 1];
	}
	last --;
	return original;
    } 
    public void add(int index, int i){
	if (index>data.length -1){
	    throw new ArrayIndexOutOfBoundsException();
	}
	int len = data.length;
	if (last != data.length){
	    for(int counter = data.length - 1; counter > index; counter --){
		data[counter] = data[counter - 1];
	    }
	    data[index] = i;
	}
	else{
	    int []data2 = new int[len + 1];
	    for(int counter = 0;counter < len; counter ++){
		data2[counter] = data[counter];
	    }
	    last ++;
	    for(int counter = data.length - 1; counter > index; counter --){
		data[counter] = data[counter - 1];
	    }
	    data[index] = 1;
	}

    }
    public static void main(String[] args){
	Sarray as = new Sarray();
	System.out.println(as);
	System.out.println(as.size());
	System.out.println(as.add(5));
	System.out.println(as.add(6));
	System.out.println(as.add(5));
	System.out.println(as.add(9));
	System.out.println(as.add(11));
	System.out.println(as);
        as.add(3,2);
	System.out.println(as);
	System.out.println(as.remove(3));
	System.out.println(as);
    }
}
