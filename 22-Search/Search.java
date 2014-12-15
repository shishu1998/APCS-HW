import java.io.*;
import java.util.*;
public class Search{
    private int [] a;
    private Random r = new Random();
    public Search(int size){
	a = new int [size];
	for(int i = 0; i < size; i ++){
	    a[i] = r.nextInt(100);
	}
    }
    public void sort(){
	 Arrays.sort(a);
    }
    public int getlength(){
	return a.length - 1;
    }
    public int getstuff(int index){
	return a[index];
    }
    public int[] getarray(){
	return a;
    }
    public int lsearch(int[] a, int b){
        int result = -1;
	for(int i = 0; i < a.length - 1; i ++){
	    if(a[i] == b){
		result = b;
	    }
	}
	return result;
    }
    public int bsearch(int[] a, int b){
        int high = a.length - 1;
        int low = 0;
	int mid;
	int result = -1;
	while(high != low + 1){
	    mid = (high + low)/2;
	    if(a[mid] == b){
		result = b;
		break;
	    }
	    else if(a[mid] < b){
		low = mid;
	    }
	    else{
		high = mid;
	    }
	    
	}
	return result;
    }
    public int rbsearch(int low, int high, int find){
	int mid = (low + high) / 2;
	if(high == low + 1){
	    return -1;
	}
	else {
	    if(a[mid] < find){
		return rbsearch(mid, high, find);
	    }
	    if(a[mid] > find){
		return rbsearch(low,mid,find);
	    }
	    else{
		return find;
	    }
	}
    }
    public static void main(String[] args){
	Search a = new Search(100);
	a.sort();
	for(int i = 0; i < a.getlength(); i ++){
	    System.out.print(a.getstuff(i) + " ");
	}
	System.out.println();
	System.out.println(a.lsearch(a.getarray(),3));
	System.out.println(a.bsearch(a.getarray(),3));
	System.out.println(a.rbsearch(0,a.getarray().length - 1, 3));
	
	
    }
}

