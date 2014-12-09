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
    public static void main(String[] args){
	Interval a = new Interval();
	System.out.println(a);
	 Interval[] b = new Interval[10];
	 for(int i = 0; i < b.length ; i ++){
	     Interval temp;
	     temp = new Interval();
	     b[i] = temp;
	     System.out.println(temp);
	     
	 }
	 
    }
}
