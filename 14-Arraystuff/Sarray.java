public class Sarray{
    private int[] data;
    private int last;
    public Sarray(){
	data = new int[10];
    }
    public void add(int i){
	if(last < data.length){
	    for(int counter = data.length -1;counter > 0; counter -= 1){
		data[counter] = data[counter - 1];
	    }
	    data[0] = i;
	    last ++;
	}
    }


}
