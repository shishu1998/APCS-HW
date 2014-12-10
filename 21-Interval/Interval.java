import java.io.*;
import java.util.*;
public class Interval{
    private int high;
    private int low;
    public Interval(){
	Random r = new Random();
	low = r.nextInt(100);
	high = r.nextInt(100) + low + 1;
    }
    public Interval(int l, int h){
	low = l;
	high = h;
    }
    public String toString(){
	String output = "";
	output = output + "(";
	output = output + low;
	output = output + ",";
	output = output + high;
	output = output + ")";
	return output;
    }
    public int getLow(){
	return low;
    }
    public int getHigh(){
	return high;
    }
    public int compareTo(Interval b){
	if(low > b.getLow()){
	    return low - b.getLow();
	}
	else if(low < b.getLow()){
	    return low - b.getLow();
	}
	else if(high > b.getHigh()){
	    return high - b.getHigh();
	}
	else if(high < b.getHigh()){
	    return high - b.getHigh();
	}
	else{
	    return 0;
	}
    }
    public static void main(String[] args){
	Interval[] b = new Interval[10];
	for(int i = 0; i < b.length ; i ++){
	    Interval temp;
	    temp = new Interval();
	    b[i] = temp;
	    System.out.println(temp);
	     
	}
	Interval a = new Interval();
	Interval c = new Interval();
	System.out.println("Interval a:" + a);
	System.out.println("Interval c:" + c);
	System.out.println(a.compareTo(c)); 
    }
}
